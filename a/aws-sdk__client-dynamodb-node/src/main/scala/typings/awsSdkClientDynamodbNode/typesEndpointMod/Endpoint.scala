package typings.awsSdkClientDynamodbNode.typesEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * _String shape
    */
  var Address: String
  /**
    * _Long shape
    */
  var CachePeriodInMinutes: Double
}

object Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}


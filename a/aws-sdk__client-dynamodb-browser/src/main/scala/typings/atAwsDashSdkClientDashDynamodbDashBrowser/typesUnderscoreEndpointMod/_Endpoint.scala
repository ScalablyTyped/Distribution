package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Endpoint extends js.Object {
  /**
    * _String shape
    */
  var Address: String
  /**
    * _Long shape
    */
  var CachePeriodInMinutes: Double
}

object _Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Double): _Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address, CachePeriodInMinutes = CachePeriodInMinutes)
  
    __obj.asInstanceOf[_Endpoint]
  }
}


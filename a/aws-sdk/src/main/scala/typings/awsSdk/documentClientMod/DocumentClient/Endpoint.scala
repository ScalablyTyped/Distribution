package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * IP address of the endpoint.
    */
  var Address: String = js.native
  /**
    * Endpoint cache time to live (TTL) value.
    */
  var CachePeriodInMinutes: Long = js.native
}

object Endpoint {
  @scala.inline
  def apply(Address: String, CachePeriodInMinutes: Long): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Endpoint]
  }
}


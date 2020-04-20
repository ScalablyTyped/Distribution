package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to update.
    */
  var Id: ResourceId = js.native
  /**
    * A complex type that contains the new settings for the service.
    */
  var Service: ServiceChange = js.native
}

object UpdateServiceRequest {
  @scala.inline
  def apply(Id: ResourceId, Service: ServiceChange): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
}


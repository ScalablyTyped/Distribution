package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to get settings for.
    */
  var Id: ResourceId = js.native
}

object GetServiceRequest {
  @scala.inline
  def apply(Id: ResourceId): GetServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServiceRequest]
  }
}


package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to delete.
    */
  var Id: ResourceId = js.native
}

object DeleteServiceRequest {
  @scala.inline
  def apply(Id: ResourceId): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteServiceRequest]
  }
}


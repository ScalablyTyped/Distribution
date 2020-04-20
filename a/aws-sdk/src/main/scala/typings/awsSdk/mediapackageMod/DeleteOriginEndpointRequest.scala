package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOriginEndpointRequest extends js.Object {
  /**
    * The ID of the OriginEndpoint to delete.
    */
  var Id: string = js.native
}

object DeleteOriginEndpointRequest {
  @scala.inline
  def apply(Id: string): DeleteOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginEndpointRequest]
  }
}


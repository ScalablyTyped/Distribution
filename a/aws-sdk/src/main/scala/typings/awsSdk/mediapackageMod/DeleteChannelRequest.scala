package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteChannelRequest extends js.Object {
  /**
    * The ID of the Channel to delete.
    */
  var Id: string = js.native
}

object DeleteChannelRequest {
  @scala.inline
  def apply(Id: string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}


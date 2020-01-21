package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelRequest extends js.Object {
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The ID of the Channel to update.
    */
  var Id: string = js.native
}

object UpdateChannelRequest {
  @scala.inline
  def apply(Id: string, Description: string = null): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
}


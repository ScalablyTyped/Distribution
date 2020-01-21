package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnectivityInfoResponse extends js.Object {
  /**
    * A message about the connectivity info update request.
    */
  var Message: js.UndefOr[string] = js.native
  /**
    * The new version of the connectivity info.
    */
  var Version: js.UndefOr[string] = js.native
}

object UpdateConnectivityInfoResponse {
  @scala.inline
  def apply(Message: string = null, Version: string = null): UpdateConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoResponse]
  }
}


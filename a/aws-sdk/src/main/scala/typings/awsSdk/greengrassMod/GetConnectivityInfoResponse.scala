package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectivityInfoResponse extends js.Object {
  /**
    * Connectivity info list.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  /**
    * A message about the connectivity info request.
    */
  var Message: js.UndefOr[string] = js.native
}

object GetConnectivityInfoResponse {
  @scala.inline
  def apply(ConnectivityInfo: listOfConnectivityInfo = null, Message: string = null): GetConnectivityInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (ConnectivityInfo != null) __obj.updateDynamic("ConnectivityInfo")(ConnectivityInfo.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectivityInfoResponse]
  }
}


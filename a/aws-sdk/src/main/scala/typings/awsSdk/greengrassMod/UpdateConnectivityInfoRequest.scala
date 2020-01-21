package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnectivityInfoRequest extends js.Object {
  /**
    * A list of connectivity info.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}

object UpdateConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: string, ConnectivityInfo: listOfConnectivityInfo = null): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    if (ConnectivityInfo != null) __obj.updateDynamic("ConnectivityInfo")(ConnectivityInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
}


package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Websocket extends js.Object {
  /**
    * The URL expiration timestamp in ISO date format. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var ConnectionExpiry: js.UndefOr[ISO8601Datetime] = js.native
  /**
    * The URL of the websocket.
    */
  var Url: js.UndefOr[PreSignedConnectionUrl] = js.native
}

object Websocket {
  @scala.inline
  def apply(ConnectionExpiry: ISO8601Datetime = null, Url: PreSignedConnectionUrl = null): Websocket = {
    val __obj = js.Dynamic.literal()
    if (ConnectionExpiry != null) __obj.updateDynamic("ConnectionExpiry")(ConnectionExpiry.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Websocket]
  }
}


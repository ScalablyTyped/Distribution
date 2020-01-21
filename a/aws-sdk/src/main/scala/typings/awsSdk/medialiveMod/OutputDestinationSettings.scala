package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDestinationSettings extends js.Object {
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.native
  /**
    * Stream name for RTMP destinations (URLs of type rtmp://)
    */
  var StreamName: js.UndefOr[string] = js.native
  /**
    * A URL specifying a destination
    */
  var Url: js.UndefOr[string] = js.native
  /**
    * username for destination
    */
  var Username: js.UndefOr[string] = js.native
}

object OutputDestinationSettings {
  @scala.inline
  def apply(
    PasswordParam: string = null,
    StreamName: string = null,
    Url: string = null,
    Username: string = null
  ): OutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam.asInstanceOf[js.Any])
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDestinationSettings]
  }
}


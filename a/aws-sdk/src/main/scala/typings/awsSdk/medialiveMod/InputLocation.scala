package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLocation extends js.Object {
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[string] = js.native
  /**
    * Uniform Resource Identifier - This should be a path to a file accessible to the Live system (eg. a http:// URI) depending on the output type. For example, a RTMP destination should have a uri simliar to: "rtmp://fmsserver/live".
    */
  var Uri: string = js.native
  /**
    * Documentation update needed
    */
  var Username: js.UndefOr[string] = js.native
}

object InputLocation {
  @scala.inline
  def apply(Uri: string, PasswordParam: string = null, Username: string = null): InputLocation = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLocation]
  }
}


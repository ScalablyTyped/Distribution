package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSourceRequest extends js.Object {
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[string] = js.native
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[string] = js.native
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[string] = js.native
}

object InputSourceRequest {
  @scala.inline
  def apply(PasswordParam: string = null, Url: string = null, Username: string = null): InputSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSourceRequest]
  }
}


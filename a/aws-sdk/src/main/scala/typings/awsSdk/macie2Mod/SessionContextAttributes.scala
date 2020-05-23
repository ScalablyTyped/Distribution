package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionContextAttributes extends js.Object {
  /**
    * The date and time, in ISO 8601 format, when the credentials were issued.
    */
  var creationDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * Specifies whether the credentials were authenticated with a multi-factor authentication (MFA) device.
    */
  var mfaAuthenticated: js.UndefOr[boolean] = js.native
}

object SessionContextAttributes {
  @scala.inline
  def apply(creationDate: timestampIso8601 = null, mfaAuthenticated: js.UndefOr[boolean] = js.undefined): SessionContextAttributes = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(mfaAuthenticated)) __obj.updateDynamic("mfaAuthenticated")(mfaAuthenticated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionContextAttributes]
  }
}


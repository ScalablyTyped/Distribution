package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberValidateRequest extends js.Object {
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[string] = js.native
  /**
    * The phone number to retrieve information about. The phone number that you provide should include a valid numeric country code. Otherwise, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[string] = js.native
}

object NumberValidateRequest {
  @scala.inline
  def apply(IsoCountryCode: string = null, PhoneNumber: string = null): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (IsoCountryCode != null) __obj.updateDynamic("IsoCountryCode")(IsoCountryCode.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberValidateRequest]
  }
}


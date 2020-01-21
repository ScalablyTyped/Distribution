package typings.awsSdkClientPinpointBrowser.typesNumberValidateRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberValidateRequest extends js.Object {
  /**
    * (Optional) The two-character ISO country code for the country or region where the phone number was originally registered.
    */
  var IsoCountryCode: js.UndefOr[String] = js.undefined
  /**
    * The phone number to get information about. The phone number that you provide should include a country code. If the number doesn't include a valid country code, the operation might result in an error.
    */
  var PhoneNumber: js.UndefOr[String] = js.undefined
}

object NumberValidateRequest {
  @scala.inline
  def apply(IsoCountryCode: String = null, PhoneNumber: String = null): NumberValidateRequest = {
    val __obj = js.Dynamic.literal()
    if (IsoCountryCode != null) __obj.updateDynamic("IsoCountryCode")(IsoCountryCode.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberValidateRequest]
  }
}


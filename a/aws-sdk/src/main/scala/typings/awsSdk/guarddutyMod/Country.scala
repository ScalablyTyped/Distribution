package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  /**
    * Country code of the remote IP address.
    */
  var CountryCode: js.UndefOr[String] = js.native
  /**
    * Country name of the remote IP address.
    */
  var CountryName: js.UndefOr[String] = js.native
}

object Country {
  @scala.inline
  def apply(CountryCode: String = null, CountryName: String = null): Country = {
    val __obj = js.Dynamic.literal()
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (CountryName != null) __obj.updateDynamic("CountryName")(CountryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}


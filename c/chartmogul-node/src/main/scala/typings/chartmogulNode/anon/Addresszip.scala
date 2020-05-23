package typings.chartmogulNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addresszip extends js.Object {
  var address_zip: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Addresszip {
  @scala.inline
  def apply(address_zip: String = null, city: String = null, country: String = null, state: String = null): Addresszip = {
    val __obj = js.Dynamic.literal()
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresszip]
  }
}


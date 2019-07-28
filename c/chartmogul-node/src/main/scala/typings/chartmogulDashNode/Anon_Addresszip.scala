package typings.chartmogulDashNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addresszip extends js.Object {
  var address_zip: js.UndefOr[String] = js.undefined
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object Anon_Addresszip {
  @scala.inline
  def apply(address_zip: String = null, city: String = null, country: String = null, state: String = null): Anon_Addresszip = {
    val __obj = js.Dynamic.literal()
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip)
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Addresszip]
  }
}


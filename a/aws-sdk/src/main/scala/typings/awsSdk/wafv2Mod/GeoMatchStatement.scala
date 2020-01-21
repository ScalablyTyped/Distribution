package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchStatement extends js.Object {
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the ISO 3166 international standard. 
    */
  var CountryCodes: js.UndefOr[typings.awsSdk.wafv2Mod.CountryCodes] = js.native
}

object GeoMatchStatement {
  @scala.inline
  def apply(CountryCodes: CountryCodes = null): GeoMatchStatement = {
    val __obj = js.Dynamic.literal()
    if (CountryCodes != null) __obj.updateDynamic("CountryCodes")(CountryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoMatchStatement]
  }
}


package typings
package chromeLib.chromeNs.privacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Websites extends js.Object {
  var hyperlinkAuditingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 21. */
  var protectedContentEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var referrersEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var thirdPartyCookiesAllowed: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Websites {
  @scala.inline
  def apply(
    hyperlinkAuditingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    protectedContentEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    referrersEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    thirdPartyCookiesAllowed: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Websites = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hyperlinkAuditingEnabled")(hyperlinkAuditingEnabled)
    __obj.updateDynamic("protectedContentEnabled")(protectedContentEnabled)
    __obj.updateDynamic("referrersEnabled")(referrersEnabled)
    __obj.updateDynamic("thirdPartyCookiesAllowed")(thirdPartyCookiesAllowed)
    __obj.asInstanceOf[Websites]
  }
}


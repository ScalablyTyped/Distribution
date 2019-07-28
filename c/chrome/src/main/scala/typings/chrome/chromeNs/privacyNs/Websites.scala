package typings.chrome.chromeNs.privacyNs

import typings.chrome.chromeNs.typesNs.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Websites extends js.Object {
  var hyperlinkAuditingEnabled: ChromeSetting
  /** @since Chrome 21. */
  var protectedContentEnabled: ChromeSetting
  var referrersEnabled: ChromeSetting
  var thirdPartyCookiesAllowed: ChromeSetting
}

object Websites {
  @scala.inline
  def apply(
    hyperlinkAuditingEnabled: ChromeSetting,
    protectedContentEnabled: ChromeSetting,
    referrersEnabled: ChromeSetting,
    thirdPartyCookiesAllowed: ChromeSetting
  ): Websites = {
    val __obj = js.Dynamic.literal(hyperlinkAuditingEnabled = hyperlinkAuditingEnabled, protectedContentEnabled = protectedContentEnabled, referrersEnabled = referrersEnabled, thirdPartyCookiesAllowed = thirdPartyCookiesAllowed)
  
    __obj.asInstanceOf[Websites]
  }
}


package typings.chrome.chrome.privacy

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.types.ChromeSetting
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

@JSGlobal("chrome.privacy.websites")
@js.native
object websites extends TopLevel[Websites]


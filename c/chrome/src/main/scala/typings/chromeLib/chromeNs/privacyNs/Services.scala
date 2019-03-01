package typings
package chromeLib.chromeNs.privacyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var alternateErrorPagesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var autofillEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var hotwordSearchEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var instantEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 38. */
  var passwordSavingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var safeBrowsingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var searchSuggestEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  /** since Chrome 20. */
  var spellingServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  var translationServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    autofillEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    hotwordSearchEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    instantEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    passwordSavingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    safeBrowsingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    safeBrowsingExtendedReportingEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    searchSuggestEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    spellingServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting,
    translationServiceEnabled: chromeLib.chromeNs.typesNs.ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alternateErrorPagesEnabled")(alternateErrorPagesEnabled)
    __obj.updateDynamic("autofillEnabled")(autofillEnabled)
    __obj.updateDynamic("hotwordSearchEnabled")(hotwordSearchEnabled)
    __obj.updateDynamic("instantEnabled")(instantEnabled)
    __obj.updateDynamic("passwordSavingEnabled")(passwordSavingEnabled)
    __obj.updateDynamic("safeBrowsingEnabled")(safeBrowsingEnabled)
    __obj.updateDynamic("safeBrowsingExtendedReportingEnabled")(safeBrowsingExtendedReportingEnabled)
    __obj.updateDynamic("searchSuggestEnabled")(searchSuggestEnabled)
    __obj.updateDynamic("spellingServiceEnabled")(spellingServiceEnabled)
    __obj.updateDynamic("translationServiceEnabled")(translationServiceEnabled)
    __obj.asInstanceOf[Services]
  }
}


package typings.chrome.chrome.privacy

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var alternateErrorPagesEnabled: ChromeSetting
  /** @since Chrome 70. */
  var autofillAddressEnabled: ChromeSetting
  /** @since Chrome 70. */
  var autofillCreditCardEnabled: ChromeSetting
  /** @deprecated since Chrome 70. Please use privacy.services.autofillAddressEnabled and privacy.services.autofillCreditCardEnabled. */
  var autofillEnabled: ChromeSetting
  /** @since Chrome 42. */
  var hotwordSearchEnabled: ChromeSetting
  var instantEnabled: ChromeSetting
  /** @since Chrome 38. */
  var passwordSavingEnabled: ChromeSetting
  var safeBrowsingEnabled: ChromeSetting
  /** @since Chrome 42. */
  var safeBrowsingExtendedReportingEnabled: ChromeSetting
  var searchSuggestEnabled: ChromeSetting
  /** since Chrome 20. */
  var spellingServiceEnabled: ChromeSetting
  var translationServiceEnabled: ChromeSetting
}

object Services {
  @scala.inline
  def apply(
    alternateErrorPagesEnabled: ChromeSetting,
    autofillAddressEnabled: ChromeSetting,
    autofillCreditCardEnabled: ChromeSetting,
    autofillEnabled: ChromeSetting,
    hotwordSearchEnabled: ChromeSetting,
    instantEnabled: ChromeSetting,
    passwordSavingEnabled: ChromeSetting,
    safeBrowsingEnabled: ChromeSetting,
    safeBrowsingExtendedReportingEnabled: ChromeSetting,
    searchSuggestEnabled: ChromeSetting,
    spellingServiceEnabled: ChromeSetting,
    translationServiceEnabled: ChromeSetting
  ): Services = {
    val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled.asInstanceOf[js.Any], autofillAddressEnabled = autofillAddressEnabled.asInstanceOf[js.Any], autofillCreditCardEnabled = autofillCreditCardEnabled.asInstanceOf[js.Any], autofillEnabled = autofillEnabled.asInstanceOf[js.Any], hotwordSearchEnabled = hotwordSearchEnabled.asInstanceOf[js.Any], instantEnabled = instantEnabled.asInstanceOf[js.Any], passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any], safeBrowsingEnabled = safeBrowsingEnabled.asInstanceOf[js.Any], safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled.asInstanceOf[js.Any], searchSuggestEnabled = searchSuggestEnabled.asInstanceOf[js.Any], spellingServiceEnabled = spellingServiceEnabled.asInstanceOf[js.Any], translationServiceEnabled = translationServiceEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
}


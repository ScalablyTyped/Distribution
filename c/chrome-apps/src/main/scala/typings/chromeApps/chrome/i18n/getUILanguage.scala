package typings.chromeApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n.getUILanguage")
@js.native
object getUILanguage extends js.Object {
  /**
    * Gets the browser UI language of the browser.
    * This is different from i18n.getAcceptLanguages which returns the preferred user languages.
    * @since Chrome 35.
    */
  def apply(): String = js.native
}


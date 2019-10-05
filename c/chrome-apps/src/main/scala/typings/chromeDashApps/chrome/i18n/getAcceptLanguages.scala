package typings.chromeDashApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n.getAcceptLanguages")
@js.native
object getAcceptLanguages extends js.Object {
  /**
    * Gets the accept-languages of the browser.
    * This is different from the locale used by the browser;
    * to get the locale, use i18n.getUILanguage.
    */
  def apply(callback: js.Function1[/* languages */ js.Array[LanguageCode], Unit]): Unit = js.native
}


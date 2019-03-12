package typings
package chromeLib.chromeNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n")
@js.native
object ^ extends js.Object {
  def detectLanguage(text: java.lang.String, callback: js.Function1[/* result */ LanguageDetectionResult, scala.Unit]): scala.Unit = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getMessage(messageName: java.lang.String): java.lang.String = js.native
  def getMessage(messageName: java.lang.String, substitutions: js.Any): java.lang.String = js.native
  def getUILanguage(): java.lang.String = js.native
}


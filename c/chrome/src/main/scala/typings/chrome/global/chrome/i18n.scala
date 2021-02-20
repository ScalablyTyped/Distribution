package typings.chrome.global.chrome

import typings.chrome.chrome.i18n.LanguageDetectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// i18n
////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
  * @since Chrome 5.
  */
object i18n {
  
  @JSGlobal("chrome.i18n.detectLanguage")
  @js.native
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
  
  @JSGlobal("chrome.i18n.getAcceptLanguages")
  @js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = js.native
  
  @JSGlobal("chrome.i18n.getMessage")
  @js.native
  def getMessage(messageName: String): String = js.native
  @JSGlobal("chrome.i18n.getMessage")
  @js.native
  def getMessage(messageName: String, substitutions: js.Any): String = js.native
  
  @JSGlobal("chrome.i18n.getUILanguage")
  @js.native
  def getUILanguage(): String = js.native
}

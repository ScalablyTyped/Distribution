package typings.chrome.global.chrome

import typings.chrome.chrome.i18n.LanguageDetectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// i18n
////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
  * @since Chrome 5.
  */
object i18n {
  
  @JSGlobal("chrome.i18n")
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectLanguage(text: String): js.Promise[LanguageDetectionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LanguageDetectionResult]]
  inline def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAcceptLanguages(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptLanguages")().asInstanceOf[js.Promise[js.Array[String]]]
  inline def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptLanguages")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getMessage(messageName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getMessage(messageName: String, substitutions: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getMessage(messageName: String, substitutions: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getUILanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUILanguage")().asInstanceOf[String]
}

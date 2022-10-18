package typings.ckeditorCkeditor5Language

import typings.ckeditorCkeditor5Language.anon.TextDirection
import typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.ltr
import typings.ckeditorCkeditor5Language.ckeditorCkeditor5LanguageStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsMod {
  
  @JSImport("@ckeditor/ckeditor5-language/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseLanguageAttribute(str: String): TextDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLanguageAttribute")(str.asInstanceOf[js.Any]).asInstanceOf[TextDirection]
  
  inline def stringifyLanguageAttribute(languageCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLanguageAttribute")(languageCode.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringifyLanguageAttribute(languageCode: String, textDirection: ltr | rtl): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyLanguageAttribute")(languageCode.asInstanceOf[js.Any], textDirection.asInstanceOf[js.Any])).asInstanceOf[String]
}

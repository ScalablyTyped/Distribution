package typings.ckeditorCkeditor5Utils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLanguageMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLanguageDirection(languageCode: String): LanguageDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageDirection")(languageCode.asInstanceOf[js.Any]).asInstanceOf[LanguageDirection]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.ltr
    - typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.rtl
  */
  trait LanguageDirection extends StObject
  object LanguageDirection {
    
    inline def ltr: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.ltr = "ltr".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.ltr]
    
    inline def rtl: typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.rtl = "rtl".asInstanceOf[typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.rtl]
  }
}

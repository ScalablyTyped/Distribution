package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language extends StObject {
  
  /**
    * Language code for the supported language.
    */
  var LanguageCode: LanguageCodeString
  
  /**
    * Language name of the supported language.
    */
  var LanguageName: LocalizedNameString
}
object Language {
  
  inline def apply(LanguageCode: LanguageCodeString, LanguageName: LocalizedNameString): Language = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], LanguageName = LanguageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: LanguageCodeString): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageName(value: LocalizedNameString): Self = StObject.set(x, "LanguageName", value.asInstanceOf[js.Any])
  }
}

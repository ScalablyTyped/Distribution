package typings.cookieclicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageOptions extends StObject {
  
  /**
    * Unused
    */
  var language: String
  
  /**
    * A string to evaluate when figuring out what form of plurality to use
    */
  var `plural-forms`: String
}
object LanguageOptions {
  
  inline def apply(language: String, `plural-forms`: String): LanguageOptions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("plural-forms")(`plural-forms`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageOptions]
  }
  
  extension [Self <: LanguageOptions](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def `setPlural-forms`(value: String): Self = StObject.set(x, "plural-forms", value.asInstanceOf[js.Any])
  }
}

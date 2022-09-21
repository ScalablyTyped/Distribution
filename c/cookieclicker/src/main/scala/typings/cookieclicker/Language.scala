package typings.cookieclicker

import typings.cookieclicker.Game.PseudoNull
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a language used for localization
  */
trait Language extends StObject {
  
  /** The text for the "Language" button */
  var changeLanguage: String
  
  /** An identifier for the lanaguge (eg. EN for English) */
  var file: String
  
  /**
    * Unused
    */
  var icon: PseudoNull
  
  /** Only defined for the English language */
  var isEN: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the language */
  var name: String
  
  /** The name of the language in English */
  var nameEN: String
  
  /**
    * The estimated length of a character, per latin character
    */
  var w: Double
}
object Language {
  
  inline def apply(changeLanguage: String, file: String, icon: PseudoNull, name: String, nameEN: String, w: Double): Language = {
    val __obj = js.Dynamic.literal(changeLanguage = changeLanguage.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameEN = nameEN.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setChangeLanguage(value: String): Self = StObject.set(x, "changeLanguage", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: PseudoNull): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIsEN(value: Boolean): Self = StObject.set(x, "isEN", value.asInstanceOf[js.Any])
    
    inline def setIsENUndefined: Self = StObject.set(x, "isEN", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameEN(value: String): Self = StObject.set(x, "nameEN", value.asInstanceOf[js.Any])
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}

package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionaryformat extends StObject {
  
  var dictionary_format: js.UndefOr[String] = js.native
  
  var dictionary_language: js.UndefOr[String] = js.native
  
  var dictionary_locale: js.UndefOr[String] = js.native
  
  var dictionary_path: js.UndefOr[String] = js.native
}
object Dictionaryformat {
  
  @scala.inline
  def apply(): Dictionaryformat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictionaryformat]
  }
  
  @scala.inline
  implicit class DictionaryformatMutableBuilder[Self <: Dictionaryformat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDictionary_format(value: String): Self = StObject.set(x, "dictionary_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_formatUndefined: Self = StObject.set(x, "dictionary_format", js.undefined)
    
    @scala.inline
    def setDictionary_language(value: String): Self = StObject.set(x, "dictionary_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_languageUndefined: Self = StObject.set(x, "dictionary_language", js.undefined)
    
    @scala.inline
    def setDictionary_locale(value: String): Self = StObject.set(x, "dictionary_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_localeUndefined: Self = StObject.set(x, "dictionary_locale", js.undefined)
    
    @scala.inline
    def setDictionary_path(value: String): Self = StObject.set(x, "dictionary_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary_pathUndefined: Self = StObject.set(x, "dictionary_path", js.undefined)
  }
}

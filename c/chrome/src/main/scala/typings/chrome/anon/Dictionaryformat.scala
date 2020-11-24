package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictionaryformat extends js.Object {
  
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
  implicit class DictionaryformatOps[Self <: Dictionaryformat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDictionary_format(value: String): Self = this.set("dictionary_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary_format: Self = this.set("dictionary_format", js.undefined)
    
    @scala.inline
    def setDictionary_language(value: String): Self = this.set("dictionary_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary_language: Self = this.set("dictionary_language", js.undefined)
    
    @scala.inline
    def setDictionary_locale(value: String): Self = this.set("dictionary_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary_locale: Self = this.set("dictionary_locale", js.undefined)
    
    @scala.inline
    def setDictionary_path(value: String): Self = this.set("dictionary_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary_path: Self = this.set("dictionary_path", js.undefined)
  }
}

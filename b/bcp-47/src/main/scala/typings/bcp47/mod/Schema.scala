package typings.bcp47.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema extends js.Object {
  
  var extendedLanguageSubtags: js.UndefOr[js.Array[String]] = js.native
  
  var extensions: js.UndefOr[js.Array[LocaleExtension]] = js.native
  
  var irregular: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var privateuse: js.UndefOr[js.Array[String]] = js.native
  
  var region: js.UndefOr[String] = js.native
  
  var regular: js.UndefOr[String] = js.native
  
  var script: js.UndefOr[String] = js.native
  
  var variants: js.UndefOr[js.Array[String]] = js.native
}
object Schema {
  
  @scala.inline
  def apply(): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  implicit class SchemaOps[Self <: Schema] (val x: Self) extends AnyVal {
    
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
    def setExtendedLanguageSubtagsVarargs(value: String*): Self = this.set("extendedLanguageSubtags", js.Array(value :_*))
    
    @scala.inline
    def setExtendedLanguageSubtags(value: js.Array[String]): Self = this.set("extendedLanguageSubtags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedLanguageSubtags: Self = this.set("extendedLanguageSubtags", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: LocaleExtension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[LocaleExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setIrregular(value: String): Self = this.set("irregular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIrregular: Self = this.set("irregular", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPrivateuseVarargs(value: String*): Self = this.set("privateuse", js.Array(value :_*))
    
    @scala.inline
    def setPrivateuse(value: js.Array[String]): Self = this.set("privateuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateuse: Self = this.set("privateuse", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRegular(value: String): Self = this.set("regular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: String*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[String]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}

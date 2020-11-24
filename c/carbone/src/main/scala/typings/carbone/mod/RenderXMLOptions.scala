package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderXMLOptions extends js.Object {
  
  var complement: js.UndefOr[js.Object] = js.native
  
  var existingVariables: js.UndefOr[js.Array[Variable]] = js.native
  
  var extension: js.UndefOr[String] = js.native
  
  var formatters: js.UndefOr[Formatters] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var translations: js.UndefOr[Translations] = js.native
}
object RenderXMLOptions {
  
  @scala.inline
  def apply(): RenderXMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderXMLOptions]
  }
  
  @scala.inline
  implicit class RenderXMLOptionsOps[Self <: RenderXMLOptions] (val x: Self) extends AnyVal {
    
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
    def setComplement(value: js.Object): Self = this.set("complement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplement: Self = this.set("complement", js.undefined)
    
    @scala.inline
    def setExistingVariablesVarargs(value: Variable*): Self = this.set("existingVariables", js.Array(value :_*))
    
    @scala.inline
    def setExistingVariables(value: js.Array[Variable]): Self = this.set("existingVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExistingVariables: Self = this.set("existingVariables", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setFormatters(value: Formatters): Self = this.set("formatters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setTranslations(value: Translations): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}

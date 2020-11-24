package typings.b.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var classSeparator: js.UndefOr[String] = js.native
  
  var elementSeparator: js.UndefOr[String] = js.native
  
  var isFullBoolValue: js.UndefOr[Boolean] = js.native
  
  var isFullModifier: js.UndefOr[Boolean] = js.native
  
  var modSeparator: js.UndefOr[String] = js.native
  
  var modValueSeparator: js.UndefOr[String] = js.native
  
  var tailSpace: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClassSeparator(value: String): Self = this.set("classSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassSeparator: Self = this.set("classSeparator", js.undefined)
    
    @scala.inline
    def setElementSeparator(value: String): Self = this.set("elementSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementSeparator: Self = this.set("elementSeparator", js.undefined)
    
    @scala.inline
    def setIsFullBoolValue(value: Boolean): Self = this.set("isFullBoolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullBoolValue: Self = this.set("isFullBoolValue", js.undefined)
    
    @scala.inline
    def setIsFullModifier(value: Boolean): Self = this.set("isFullModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFullModifier: Self = this.set("isFullModifier", js.undefined)
    
    @scala.inline
    def setModSeparator(value: String): Self = this.set("modSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModSeparator: Self = this.set("modSeparator", js.undefined)
    
    @scala.inline
    def setModValueSeparator(value: String): Self = this.set("modValueSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModValueSeparator: Self = this.set("modValueSeparator", js.undefined)
    
    @scala.inline
    def setTailSpace(value: String): Self = this.set("tailSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTailSpace: Self = this.set("tailSpace", js.undefined)
  }
}

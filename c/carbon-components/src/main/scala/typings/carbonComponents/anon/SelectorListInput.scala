package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorListInput extends js.Object {
  
  var classActive: String = js.native
  
  var selectorInit: String = js.native
  
  def selectorListInput(id: js.Any): String = js.native
  
  var selectorRow: String = js.native
}
object SelectorListInput {
  
  @scala.inline
  def apply(
    classActive: String,
    selectorInit: String,
    selectorListInput: js.Any => String,
    selectorRow: String
  ): SelectorListInput = {
    val __obj = js.Dynamic.literal(classActive = classActive.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorListInput = js.Any.fromFunction1(selectorListInput), selectorRow = selectorRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorListInput]
  }
  
  @scala.inline
  implicit class SelectorListInputOps[Self <: SelectorListInput] (val x: Self) extends AnyVal {
    
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
    def setClassActive(value: String): Self = this.set("classActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorListInput(value: js.Any => String): Self = this.set("selectorListInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectorRow(value: String): Self = this.set("selectorRow", value.asInstanceOf[js.Any])
  }
}

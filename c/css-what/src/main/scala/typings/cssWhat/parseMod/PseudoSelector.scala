package typings.cssWhat.parseMod

import typings.cssWhat.cssWhatStrings.pseudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoSelector extends Selector {
  
  var data: DataType = js.native
  
  var name: String = js.native
  
  var `type`: pseudo = js.native
}
object PseudoSelector {
  
  @scala.inline
  def apply(name: String, `type`: pseudo): PseudoSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoSelector]
  }
  
  @scala.inline
  implicit class PseudoSelectorOps[Self <: PseudoSelector] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pseudo): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Array[Selector]*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: DataType): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
}

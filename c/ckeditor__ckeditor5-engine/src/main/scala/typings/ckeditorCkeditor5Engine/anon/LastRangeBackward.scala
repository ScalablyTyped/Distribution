package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.view.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastRangeBackward extends js.Object {
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.native
  
  var order: js.UndefOr[js.Array[Double]] = js.native
  
  var rootElement: js.UndefOr[Element | DocumentFragment] = js.native
  
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.native
}
object LastRangeBackward {
  
  @scala.inline
  def apply(): LastRangeBackward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastRangeBackward]
  }
  
  @scala.inline
  implicit class LastRangeBackwardOps[Self <: LastRangeBackward] (val x: Self) extends AnyVal {
    
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
    def setLastRangeBackward(value: Boolean): Self = this.set("lastRangeBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRangeBackward: Self = this.set("lastRangeBackward", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: Double*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[Double]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setRootElement(value: Element | DocumentFragment): Self = this.set("rootElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootElement: Self = this.set("rootElement", js.undefined)
    
    @scala.inline
    def setSameSelectionCharacters(value: Boolean): Self = this.set("sameSelectionCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSelectionCharacters: Self = this.set("sameSelectionCharacters", js.undefined)
  }
}

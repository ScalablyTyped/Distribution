package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.view.DocumentFragment
import typings.ckeditorCkeditor5Engine.mod.view.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastRangeBackward extends StObject {
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[js.Array[Double]] = js.undefined
  
  var rootElement: js.UndefOr[Element | DocumentFragment] = js.undefined
  
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.undefined
}
object LastRangeBackward {
  
  @scala.inline
  def apply(): LastRangeBackward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastRangeBackward]
  }
  
  @scala.inline
  implicit class LastRangeBackwardMutableBuilder[Self <: LastRangeBackward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRangeBackward(value: Boolean): Self = StObject.set(x, "lastRangeBackward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRangeBackwardUndefined: Self = StObject.set(x, "lastRangeBackward", js.undefined)
    
    @scala.inline
    def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setRootElement(value: Element | DocumentFragment): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
    
    @scala.inline
    def setSameSelectionCharacters(value: Boolean): Self = StObject.set(x, "sameSelectionCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSelectionCharactersUndefined: Self = StObject.set(x, "sameSelectionCharacters", js.undefined)
  }
}

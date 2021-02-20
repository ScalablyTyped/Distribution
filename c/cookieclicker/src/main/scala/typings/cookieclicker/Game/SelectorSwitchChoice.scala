package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorSwitchChoice extends StObject {
  
  /**
    * True to make a line
    */
  var div: Boolean = js.native
  
  var icon: Icon = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var selected: js.UndefOr[Boolean | PseudoBoolean] = js.native
}
object SelectorSwitchChoice {
  
  @scala.inline
  def apply(div: Boolean, icon: Icon, name: String): SelectorSwitchChoice = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSwitchChoice]
  }
  
  @scala.inline
  implicit class SelectorSwitchChoiceMutableBuilder[Self <: SelectorSwitchChoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiv(value: Boolean): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean | PseudoBoolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}

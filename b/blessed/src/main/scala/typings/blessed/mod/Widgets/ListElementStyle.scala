package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListElementStyle extends StObject {
  
  var item: js.UndefOr[js.Any] = js.native
  
  var selected: js.UndefOr[js.Any] = js.native
}
object ListElementStyle {
  
  @scala.inline
  def apply(): ListElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElementStyle]
  }
  
  @scala.inline
  implicit class ListElementStyleMutableBuilder[Self <: ListElementStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}

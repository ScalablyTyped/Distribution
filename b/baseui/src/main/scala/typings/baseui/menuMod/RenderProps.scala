package typings.baseui.menuMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProps
  extends StObject
     with StatefulContainerState {
  
  var getRequiredItemProps: GetRequiredItemProps
  
  var items: ItemsT
}
object RenderProps {
  
  @scala.inline
  def apply(
    getRequiredItemProps: (/* item */ js.Any, /* index */ Double) => RenderItemProps,
    highlightedIndex: Double,
    isFocused: Boolean,
    items: ItemsT
  ): RenderProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsMutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRequiredItemProps(value: (/* item */ js.Any, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItems(value: ItemsT): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ItemT*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

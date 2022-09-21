package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderProps
  extends StObject
     with StatefulContainerState {
  
  var getRequiredItemProps: GetRequiredItemPropsFn
  
  var items: Items
}
object RenderProps {
  
  inline def apply(
    getRequiredItemProps: (/* item */ Item, /* index */ Double) => RenderItemProps,
    highlightedIndex: Double,
    isFocused: Boolean,
    items: Items
  ): RenderProps = {
    val __obj = js.Dynamic.literal(getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), highlightedIndex = highlightedIndex.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
  
  extension [Self <: RenderProps](x: Self) {
    
    inline def setGetRequiredItemProps(value: (/* item */ Item, /* index */ Double) => RenderItemProps): Self = StObject.set(x, "getRequiredItemProps", js.Any.fromFunction2(value))
    
    inline def setItems(value: Items): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
  }
}

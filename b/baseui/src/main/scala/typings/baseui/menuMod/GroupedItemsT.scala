package typings.baseui.menuMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedItemsT
  extends StObject
     with /* key */ StringDictionary[ArrayItemsT] {
  
  var __ungrouped: ArrayItemsT
}
object GroupedItemsT {
  
  inline def apply(__ungrouped: ArrayItemsT): GroupedItemsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedItemsT]
  }
  
  extension [Self <: GroupedItemsT](x: Self) {
    
    inline def set__ungrouped(value: ArrayItemsT): Self = StObject.set(x, "__ungrouped", value.asInstanceOf[js.Any])
    
    inline def set__ungroupedVarargs(value: ItemT*): Self = StObject.set(x, "__ungrouped", js.Array(value :_*))
  }
}

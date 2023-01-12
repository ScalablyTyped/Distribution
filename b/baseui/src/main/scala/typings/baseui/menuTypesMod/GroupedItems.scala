package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupedItems
  extends StObject
     with /* x */ StringDictionary[ArrayItems] {
  
  var __ungrouped: ArrayItems
}
object GroupedItems {
  
  inline def apply(__ungrouped: ArrayItems): GroupedItems = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupedItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupedItems] (val x: Self) extends AnyVal {
    
    inline def set__ungrouped(value: ArrayItems): Self = StObject.set(x, "__ungrouped", value.asInstanceOf[js.Any])
    
    inline def set__ungroupedVarargs(value: Item*): Self = StObject.set(x, "__ungrouped", js.Array(value*))
  }
}

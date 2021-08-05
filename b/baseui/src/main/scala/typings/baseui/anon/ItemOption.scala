package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemOption extends StObject {
  
  var item: typings.baseui.selectMod.Option
}
object ItemOption {
  
  inline def apply(item: typings.baseui.selectMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  
  extension [Self <: ItemOption](x: Self) {
    
    inline def setItem(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}

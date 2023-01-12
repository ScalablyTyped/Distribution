package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemOption extends StObject {
  
  var item: typings.baseui.selectTypesMod.Option
}
object ItemOption {
  
  inline def apply(item: typings.baseui.selectTypesMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemOption] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.baseui.selectTypesMod.Option): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}

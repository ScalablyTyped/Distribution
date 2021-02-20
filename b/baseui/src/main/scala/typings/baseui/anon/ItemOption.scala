package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemOption extends StObject {
  
  var item: typings.baseui.selectMod.Option = js.native
}
object ItemOption {
  
  @scala.inline
  def apply(item: typings.baseui.selectMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  
  @scala.inline
  implicit class ItemOptionMutableBuilder[Self <: ItemOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: typings.baseui.selectMod.Option): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}

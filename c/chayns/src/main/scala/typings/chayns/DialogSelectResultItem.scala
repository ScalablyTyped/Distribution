package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogSelectResultItem extends StObject {
  
  var name: String
  
  var value: js.UndefOr[String] = js.undefined
}
object DialogSelectResultItem {
  
  @scala.inline
  def apply(name: String): DialogSelectResultItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResultItem]
  }
  
  @scala.inline
  implicit class DialogSelectResultItemMutableBuilder[Self <: DialogSelectResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

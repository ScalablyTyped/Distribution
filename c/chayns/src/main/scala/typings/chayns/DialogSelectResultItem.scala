package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogSelectResultItem extends StObject {
  
  var name: String
  
  var value: js.UndefOr[String] = js.undefined
}
object DialogSelectResultItem {
  
  inline def apply(name: String): DialogSelectResultItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectResultItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogSelectResultItem] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

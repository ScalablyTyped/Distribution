package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyMapping extends StObject {
  
  var entityTypeName: String = js.native
  
  var realValue: js.Any = js.native
  
  var tempValue: js.Any = js.native
}
object KeyMapping {
  
  @scala.inline
  def apply(entityTypeName: String, realValue: js.Any, tempValue: js.Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], realValue = realValue.asInstanceOf[js.Any], tempValue = tempValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapping]
  }
  
  @scala.inline
  implicit class KeyMappingMutableBuilder[Self <: KeyMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypeName(value: String): Self = StObject.set(x, "entityTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealValue(value: js.Any): Self = StObject.set(x, "realValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempValue(value: js.Any): Self = StObject.set(x, "tempValue", value.asInstanceOf[js.Any])
  }
}

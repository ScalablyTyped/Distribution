package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.awsSdkTypesStrings.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerHeaderValue
  extends StObject
     with MessageHeaderValue {
  
  var `type`: integer
  
  var value: Double
}
object IntegerHeaderValue {
  
  inline def apply(value: Double): IntegerHeaderValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[IntegerHeaderValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegerHeaderValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

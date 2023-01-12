package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityProperty extends StObject {
  
  /**
    * Property identifier, usually the node name.
    */
  var key: String
  
  /**
    * Property value (0..100).
    */
  var value: Double
}
object OpacityProperty {
  
  inline def apply(key: String, value: Double): OpacityProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacityProperty] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

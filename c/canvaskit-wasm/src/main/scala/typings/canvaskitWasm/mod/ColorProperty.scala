package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorProperty extends StObject {
  
  /**
    * Property identifier, usually the node name.
    */
  var key: String
  
  /**
    * Property value (RGBA, 255-based).
    */
  var value: ColorInt
}
object ColorProperty {
  
  inline def apply(key: String, value: ColorInt): ColorProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorProperty]
  }
  
  extension [Self <: ColorProperty](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ColorInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipmapModeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Linear: MipmapMode
  
  var Nearest: MipmapMode
  
  var None: MipmapMode
}
object MipmapModeEnumValues {
  
  inline def apply(Linear: MipmapMode, Nearest: MipmapMode, None: MipmapMode, values: js.Array[Double]): MipmapModeEnumValues = {
    val __obj = js.Dynamic.literal(Linear = Linear.asInstanceOf[js.Any], Nearest = Nearest.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipmapModeEnumValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MipmapModeEnumValues] (val x: Self) extends AnyVal {
    
    inline def setLinear(value: MipmapMode): Self = StObject.set(x, "Linear", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: MipmapMode): Self = StObject.set(x, "Nearest", value.asInstanceOf[js.Any])
    
    inline def setNone(value: MipmapMode): Self = StObject.set(x, "None", value.asInstanceOf[js.Any])
  }
}

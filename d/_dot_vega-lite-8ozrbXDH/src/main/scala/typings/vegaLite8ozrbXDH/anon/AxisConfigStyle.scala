package typings.vegaLite8ozrbXDH.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisConfigStyle extends StObject {
  
  var axisConfigStyle: Any
  
  var vgAxisConfig: Any
  
  var vlOnlyAxisConfig: Any
}
object AxisConfigStyle {
  
  inline def apply(axisConfigStyle: Any, vgAxisConfig: Any, vlOnlyAxisConfig: Any): AxisConfigStyle = {
    val __obj = js.Dynamic.literal(axisConfigStyle = axisConfigStyle.asInstanceOf[js.Any], vgAxisConfig = vgAxisConfig.asInstanceOf[js.Any], vlOnlyAxisConfig = vlOnlyAxisConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisConfigStyle]
  }
  
  extension [Self <: AxisConfigStyle](x: Self) {
    
    inline def setAxisConfigStyle(value: Any): Self = StObject.set(x, "axisConfigStyle", value.asInstanceOf[js.Any])
    
    inline def setVgAxisConfig(value: Any): Self = StObject.set(x, "vgAxisConfig", value.asInstanceOf[js.Any])
    
    inline def setVlOnlyAxisConfig(value: Any): Self = StObject.set(x, "vlOnlyAxisConfig", value.asInstanceOf[js.Any])
  }
}

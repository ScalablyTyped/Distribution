package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxisMinorTick
  extends StObject
     with dxPolarChartCommonAxisSettingsMinorTick {
  
  /**
    * Shifts minor ticks from the reference position.
    */
  var shift: js.UndefOr[Double] = js.undefined
}
object dxPolarChartArgumentAxisMinorTick {
  
  inline def apply(): dxPolarChartArgumentAxisMinorTick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisMinorTick]
  }
  
  extension [Self <: dxPolarChartArgumentAxisMinorTick](x: Self) {
    
    inline def setShift(value: Double): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    
    inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
  }
}

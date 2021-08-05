package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartistEasingDefinition extends StObject {
  
  var `0`: Double
  
  var `1`: Double
  
  var `2`: Double
  
  var `3`: Double
}
object IChartistEasingDefinition {
  
  inline def apply(`0`: Double, `1`: Double, `2`: Double, `3`: Double): IChartistEasingDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartistEasingDefinition]
  }
  
  extension [Self <: IChartistEasingDefinition](x: Self) {
    
    inline def set0(value: Double): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Double): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: Double): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def set3(value: Double): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
  }
}

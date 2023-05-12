package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var chart: typings.chartJs.distCoreCoreDotcontrollerMod.Chart
  
  var `type`: String
}
object Type {
  
  inline def apply(chart: typings.chartJs.distCoreCoreDotcontrollerMod.Chart, `type`: String): Type = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setChart(value: typings.chartJs.distCoreCoreDotcontrollerMod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

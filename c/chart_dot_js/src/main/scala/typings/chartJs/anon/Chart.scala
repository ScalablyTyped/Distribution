package typings.chartJs.anon

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chart extends StObject {
  
  var chart: typings.chartJs.distTypesIndexMod.Chart[
    typings.chartJs.distTypesIndexMod.ChartType, 
    typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
    Any
  ]
  
  var ctx: CanvasRenderingContext2D
  
  var id: String
  
  var `type`: String
}
object Chart {
  
  inline def apply(
    chart: typings.chartJs.distTypesIndexMod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ],
    ctx: CanvasRenderingContext2D,
    id: String,
    `type`: String
  ): Chart = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
    
    inline def setChart(
      value: typings.chartJs.distTypesIndexMod.Chart[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

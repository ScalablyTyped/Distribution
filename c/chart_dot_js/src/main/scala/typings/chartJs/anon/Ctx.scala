package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.Chart4
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ctx extends StObject {
  
  var chart: Chart4[
    ChartType, 
    typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
    Any
  ]
  
  var ctx: CanvasRenderingContext2D
  
  var id: String
  
  var `type`: String
}
object Ctx {
  
  inline def apply(
    chart: Chart4[
      ChartType, 
      typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
      Any
    ],
    ctx: CanvasRenderingContext2D,
    id: String,
    `type`: String
  ): Ctx = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctx]
  }
  
  extension [Self <: Ctx](x: Self) {
    
    inline def setChart(
      value: Chart4[
          ChartType, 
          typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
          Any
        ]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartType extends StObject {
  
  var chart: typings.chartJs.distTypesIndexMod.Chart[
    typings.chartJs.distTypesIndexMod.ChartType, 
    typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
    Any
  ]
  
  var `type`: String
}
object ChartType {
  
  inline def apply(
    chart: typings.chartJs.distTypesIndexMod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ],
    `type`: String
  ): ChartType = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartType] (val x: Self) extends AnyVal {
    
    inline def setChart(
      value: typings.chartJs.distTypesIndexMod.Chart[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ]
    ): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleChartOptions[TType /* <: ChartType */] extends StObject {
  
  var scales: StringDictionary[
    ScaleOptionsByType[
      /* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['scales'] */ js.Any
    ]
  ]
}
object ScaleChartOptions {
  
  inline def apply[TType /* <: ChartType */](
    scales: StringDictionary[
      ScaleOptionsByType[
        /* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['scales'] */ js.Any
      ]
    ]
  ): ScaleChartOptions[TType] = {
    val __obj = js.Dynamic.literal(scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleChartOptions[TType]]
  }
  
  extension [Self <: ScaleChartOptions[?], TType /* <: ChartType */](x: Self & ScaleChartOptions[TType]) {
    
    inline def setScales(
      value: StringDictionary[
          ScaleOptionsByType[
            /* import warning: importer.ImportType#apply Failed type conversion: chart.js.chart.js.ChartTypeRegistry[TType]['scales'] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}

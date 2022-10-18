package typings.chartjsPluginTrendline

import org.scalablytyped.runtime.Shortcut
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.Plugin
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartjsPluginTrendline.mod.TrendlineLinearOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TrendlineLinearPlugin extends Shortcut {
    
    @JSGlobal("TrendlineLinearPlugin")
    @js.native
    val ^ : Plugin[ChartType, AnyObject] = js.native
    
    type _To = Plugin[ChartType, AnyObject]
    
    /* This means you don't have to write `^`, but can instead just say `TrendlineLinearPlugin.foo` */
    override def _to: Plugin[ChartType, AnyObject] = ^
    
    /* augmented module */
    object chartDotjsMod {
      
      trait ChartDatasetProperties[TType /* <: ChartType */, TData] extends StObject {
        
        var trendlineLinear: js.UndefOr[TrendlineLinearOptions] = js.undefined
      }
      object ChartDatasetProperties {
        
        inline def apply[TType /* <: ChartType */, TData](): ChartDatasetProperties[TType, TData] = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ChartDatasetProperties[TType, TData]]
        }
        
        extension [Self <: ChartDatasetProperties[?, ?], TType /* <: ChartType */, TData](x: Self & (ChartDatasetProperties[TType, TData])) {
          
          inline def setTrendlineLinear(value: TrendlineLinearOptions): Self = StObject.set(x, "trendlineLinear", value.asInstanceOf[js.Any])
          
          inline def setTrendlineLinearUndefined: Self = StObject.set(x, "trendlineLinear", js.undefined)
        }
      }
    }
  }
}

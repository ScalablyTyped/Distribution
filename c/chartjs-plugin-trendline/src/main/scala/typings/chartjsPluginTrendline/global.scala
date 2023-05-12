package typings.chartjsPluginTrendline

import org.scalablytyped.runtime.Shortcut
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.Plugin
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
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ChartDatasetProperties[?, ?], TType /* <: ChartType */, TData] (val x: Self & (ChartDatasetProperties[TType, TData])) extends AnyVal {
          
          inline def setTrendlineLinear(value: TrendlineLinearOptions): Self = StObject.set(x, "trendlineLinear", value.asInstanceOf[js.Any])
          
          inline def setTrendlineLinearUndefined: Self = StObject.set(x, "trendlineLinear", js.undefined)
        }
      }
    }
  }
}

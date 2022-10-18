package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPlotAdapterMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/PlotAdapter", JSImport.Default)
  @js.native
  val default: FC[IAdapterProps] = js.native
  
  trait IAdapterProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * options 转换器
      * @example
      * // 合并图表类型，或者做配置项转换
      * (opt) => {
      *   const options = {
      *     // 可配置默认数据
      *     data: [...],
      *     ...opt,
      *   }
      *
      *   return {
      *     plotType: opt.stackField ? 'StackColumn' : 'Column',
      *     options,
      *   }
      * }
      */
    var adapter: js.UndefOr[js.Function1[/* IOptions */ Any, IPlotCfg]] = js.undefined
    
    /**
      * 可覆盖组件displayName
      */
    var chartName: js.UndefOr[String] = js.undefined
  }
  object IAdapterProps {
    
    inline def apply(): IAdapterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAdapterProps]
    }
    
    extension [Self <: IAdapterProps](x: Self) {
      
      inline def setAdapter(value: /* IOptions */ Any => IPlotCfg): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setChartName(value: String): Self = StObject.set(x, "chartName", value.asInstanceOf[js.Any])
      
      inline def setChartNameUndefined: Self = StObject.set(x, "chartName", js.undefined)
    }
  }
  
  type IOptions = Record[String, Any]
  
  trait IPlotCfg extends StObject {
    
    var options: IOptions
    
    var plotType: String
  }
  object IPlotCfg {
    
    inline def apply(options: IOptions, plotType: String): IPlotCfg = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], plotType = plotType.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlotCfg]
    }
    
    extension [Self <: IPlotCfg](x: Self) {
      
      inline def setOptions(value: IOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPlotType(value: String): Self = StObject.set(x, "plotType", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[IAdapterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsPlotAdapterMod.foo` */
  override def _to: FC[IAdapterProps] = default
}

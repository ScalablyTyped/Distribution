package typings.bizcharts

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.chartMod.Chart
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.FilterCondition
import typings.antvG2.libInterfaceMod.LegendCfg
import typings.antvGBase.interfacesMod.IGroup
import typings.bizcharts.interfaceMod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("bizcharts/lib/components/Legend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ILegend): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ILegend
    extends StObject
       with LegendCfg
       with /* key */ StringDictionary[Any] {
    
    /** 筛选 */
    var filter: js.UndefOr[FilterCondition] = js.undefined
    
    /** 连续图例值改变时 or 分类图例点击图例时 */
    var onChange: js.UndefOr[js.Function2[/* e */ js.UndefOr[IEvent], /* chart */ js.UndefOr[Chart], Unit]] = js.undefined
    
    /** 来自父级的 chart 或者 view实例 */
    var view: js.UndefOr[Any] = js.undefined
    
    /** 图例是否可见 */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ILegend {
    
    inline def apply(container: IGroup): ILegend = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILegend]
    }
    
    extension [Self <: ILegend](x: Self) {
      
      inline def setFilter(value: (/* value */ Any, /* datum */ Datum, /* idx */ js.UndefOr[Double]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOnChange(value: (/* e */ js.UndefOr[IEvent], /* chart */ js.UndefOr[Chart]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setView(value: Any): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}

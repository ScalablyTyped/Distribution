package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libPlotsDualAxesMod.DualAxes
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.LabelAPIOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.LengendAPIOptions
import typings.bizcharts.libPlotsCoreInterfaceMod.TooltipAPIOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsDualAxesChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/DualAxesChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]] = js.native
  
  @js.native
  trait DualAxesOptions
    extends DualAxes
       with BasePlotOptions {
    
    /** 数据标注label */
    var label: js.UndefOr[LabelAPIOptions] = js.native
    
    /** 图例 */
    var legend: js.UndefOr[LengendAPIOptions] = js.native
    
    /** 图表提示框 */
    var tooltip: js.UndefOr[TooltipAPIOptions] = js.native
  }
  
  type _To = ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsDualAxesChartMod.foo` */
  override def _to: ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]] = default
}

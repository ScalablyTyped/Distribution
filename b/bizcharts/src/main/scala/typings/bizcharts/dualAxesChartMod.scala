package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.dualAxesMod.DualAxes
import typings.bizcharts.coreInterfaceMod.LabelAPIOptions
import typings.bizcharts.coreInterfaceMod.LengendAPIOptions
import typings.bizcharts.coreInterfaceMod.TooltipAPIOptions
import typings.bizcharts.createPlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dualAxesChartMod extends Shortcut {
  
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
  
  /* This means you don't have to write `default`, but can instead just say `dualAxesChartMod.foo` */
  override def _to: ForwardRefExoticComponent[DualAxesOptions & RefAttributes[Any]] = default
}

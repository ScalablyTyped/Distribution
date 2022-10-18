package typings.chartist

import typings.chartist.anon.Max
import typings.chartist.distAxesAxisMod.Axis
import typings.chartist.distAxesAxisMod.AxisUnits_
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesAutoScaleAxisMod {
  
  @JSImport("chartist/dist/axes/AutoScaleAxis", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
    
    /* private */ val bounds: Any = js.native
    
    @JSName("range")
    val range_AutoScaleAxis: Max = js.native
  }
}

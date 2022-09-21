package typings.chartist

import typings.chartist.anon.Max
import typings.chartist.axisMod.Axis
import typings.chartist.axisMod.AxisUnits_
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedScaleAxisMod {
  
  @JSImport("chartist/dist/axes/FixedScaleAxis", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
    
    @JSName("range")
    val range_FixedScaleAxis: Max = js.native
  }
}

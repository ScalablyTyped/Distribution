package typings.chartist

import typings.chartist.axisMod.Axis
import typings.chartist.axisMod.AxisUnits_
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepAxisMod {
  
  @JSImport("chartist/dist/axes/StepAxis", "StepAxis")
  @js.native
  open class StepAxis protected () extends Axis {
    def this(axisUnit: AxisUnits_, _data: Any, chartRect: ChartRect, options: AxisOptions) = this()
    
    /* private */ val stepLength: Any = js.native
    
    val stretch: Boolean = js.native
  }
}

package typings.chartist

import typings.chartist.anon.Dir
import typings.chartist.anon.Len
import typings.chartist.axisMod.AxisUnits_
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.Label
import typings.chartist.coreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axesMod {
  
  @JSImport("chartist/dist/axes", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected ()
    extends typings.chartist.autoScaleAxisMod.AutoScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist/dist/axes", "Axis")
  @js.native
  abstract class Axis protected ()
    extends typings.chartist.axisMod.Axis {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
  }
  
  @JSImport("chartist/dist/axes", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected ()
    extends typings.chartist.fixedScaleAxisMod.FixedScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist/dist/axes", "StepAxis")
  @js.native
  open class StepAxis protected ()
    extends typings.chartist.stepAxisMod.StepAxis {
    def this(axisUnit: AxisUnits_, _data: Any, chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  object axisUnits {
    
    @JSImport("chartist/dist/axes", "axisUnits.x")
    @js.native
    val x: Dir = js.native
    
    @JSImport("chartist/dist/axes", "axisUnits.y")
    @js.native
    val y: Len = js.native
  }
}

package typings.chartist

import typings.chartist.anon.Dir
import typings.chartist.anon.Len
import typings.chartist.distAxesAxisMod.AxisUnits_
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.Label
import typings.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesMod {
  
  @JSImport("chartist/dist/axes", "AutoScaleAxis")
  @js.native
  open class AutoScaleAxis protected ()
    extends typings.chartist.distAxesAutoScaleAxisMod.AutoScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("chartist/dist/axes", "Axis")
  @js.native
  open class Axis protected ()
    extends typings.chartist.distAxesAxisMod.Axis {
    def this(units: AxisUnits_, chartRect: ChartRect, ticks: js.Array[Label]) = this()
  }
  
  @JSImport("chartist/dist/axes", "FixedScaleAxis")
  @js.native
  open class FixedScaleAxis protected ()
    extends typings.chartist.distAxesFixedScaleAxisMod.FixedScaleAxis {
    def this(axisUnit: AxisUnits_, data: js.Array[NormalizedSeries], chartRect: ChartRect, options: AxisOptions) = this()
  }
  
  @JSImport("chartist/dist/axes", "StepAxis")
  @js.native
  open class StepAxis protected ()
    extends typings.chartist.distAxesStepAxisMod.StepAxis {
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

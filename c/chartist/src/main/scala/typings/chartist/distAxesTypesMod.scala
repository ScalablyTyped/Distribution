package typings.chartist

import org.scalablytyped.runtime.Instantiable4
import typings.chartist.distAxesAutoScaleAxisMod.AutoScaleAxis
import typings.chartist.distAxesAxisMod.AxisUnits_
import typings.chartist.distAxesFixedScaleAxisMod.FixedScaleAxis
import typings.chartist.distAxesStepAxisMod.StepAxis
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.ChartRect
import typings.chartist.distCoreTypesMod.NormalizedSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxesTypesMod {
  
  type AxisType = Instantiable4[
    /* axisUnit */ AxisUnits_, 
    (/* _data */ Any) | (/* data */ js.Array[NormalizedSeries]), 
    /* chartRect */ ChartRect, 
    /* options */ AxisOptions, 
    AutoScaleAxis | FixedScaleAxis | StepAxis
  ]
}

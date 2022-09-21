package typings.chartist

import org.scalablytyped.runtime.Instantiable4
import typings.chartist.autoScaleAxisMod.AutoScaleAxis
import typings.chartist.axisMod.AxisUnits_
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.ChartRect
import typings.chartist.coreTypesMod.NormalizedSeries
import typings.chartist.fixedScaleAxisMod.FixedScaleAxis
import typings.chartist.stepAxisMod.StepAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AxisType = Instantiable4[
    /* axisUnit */ AxisUnits_, 
    (/* _data */ Any) | (/* data */ js.Array[NormalizedSeries]), 
    /* chartRect */ ChartRect, 
    /* options */ AxisOptions, 
    AutoScaleAxis | FixedScaleAxis | StepAxis
  ]
}

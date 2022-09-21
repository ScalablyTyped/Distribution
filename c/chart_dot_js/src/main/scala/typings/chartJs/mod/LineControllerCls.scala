package typings.chartJs.mod

import typings.chartJs.basicMod.AnyObject
import typings.chartJs.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("chart.js", "LineController")
@js.native
open class LineControllerCls protected () extends DatasetController[
      ChartType, 
      Element[AnyObject, AnyObject], 
      Element[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ] {
  def this(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], datasetIndex: Double) = this()
}

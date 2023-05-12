package typings.chartJs.chartJsMod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.ParsedDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("chart/js", "BubbleController")
@js.native
open class BubbleControllerCls protected ()
  extends typings.chartJs.distTypesIndexMod.DatasetController[
      ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject], 
      ParsedDataType[ChartType]
    ] {
  def this(
    chart: typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    datasetIndex: Double
  ) = this()
}

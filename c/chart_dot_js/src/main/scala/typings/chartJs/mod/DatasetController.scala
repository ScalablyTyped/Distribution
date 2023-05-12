package typings.chartJs.mod

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", "DatasetController")
@js.native
open class DatasetController[TType /* <: ChartType */, TElement /* <: default[AnyObject, AnyObject] */, TDatasetElement /* <: default[AnyObject, AnyObject] */, TParsedData] protected ()
  extends typings.chartJs.distTypesIndexMod.DatasetController[TType, TElement, TDatasetElement, TParsedData] {
  def this(
    chart: typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any],
    datasetIndex: Double
  ) = this()
}

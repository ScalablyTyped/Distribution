package typings.chartJs.mod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart extends StObject {
  
  var aspectRatio: Double | Null = js.native
  
  var canvas: HTMLCanvasElement | Null = js.native
  
  var chartArea: ChartArea = js.native
  
  def clear(): typings.chartJs.mod.Chart = js.native
  
  var config: ChartConfiguration = js.native
  
  var ctx: CanvasRenderingContext2D | Null = js.native
  
  var data: ChartData = js.native
  
  def destroy(): js.Object = js.native
  
  def generateLegend(): js.Object = js.native
  
  def getDatasetAtEvent(e: js.Any): js.Array[js.Object] = js.native
  
  def getDatasetMeta(index: Double): Meta = js.native
  
  def getElementAtEvent(e: js.Any): js.Array[js.Object] = js.native
  
  def getElementsAtEvent(e: js.Any): js.Array[js.Object] = js.native
  
  def getElementsAtXAxis(e: js.Any): js.Array[js.Object] = js.native
  
  def getVisibleDatasetCount(): Double = js.native
  
  var height: Double | Null = js.native
  
  def isDatasetVisible(datasetIndex: Double): Boolean = js.native
  
  var options: ChartOptions = js.native
  
  def render(): js.Object = js.native
  def render(hasDurationLazyEasing: ChartRenderProps): js.Object = js.native
  
  def resize(): typings.chartJs.mod.Chart = js.native
  
  def setDatasetVisibility(datasetIndex: Double, visible: Boolean): Unit = js.native
  
  def stop(): typings.chartJs.mod.Chart = js.native
  
  def toBase64Image(): String = js.native
  
  def update(): js.Object = js.native
  def update(hasDurationLazyEasing: ChartUpdateProps): js.Object = js.native
  
  var width: Double | Null = js.native
}

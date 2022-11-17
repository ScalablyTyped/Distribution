package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineElement[T /* <: LineProps */, O /* <: LineOptions */]
  extends StObject
     with Element[T, O]
     with VisualElement {
  
  def first(): Point1 | false = js.native
  
  @JSName("interpolate")
  @scala.annotation.targetName("interpolate_x_y")
  def interpolate(point: Point1, property: "x" | "y"): js.UndefOr[Point1 | js.Array[Point1]] = js.native
  
  def last(): Point1 | false = js.native
  
  def path(ctx: CanvasRenderingContext2D): Boolean = js.native
  
  def pathSegment(ctx: CanvasRenderingContext2D, segment: Segment, params: AnyObject): js.UndefOr[Boolean] = js.native
  
  var points: js.Array[Point1] = js.native
  
  val segments: js.Array[Segment] = js.native
  
  def updateControlPoints(chartArea: ChartArea): Unit = js.native
  @JSName("updateControlPoints")
  @scala.annotation.targetName("updateControlPoints_x_y")
  def updateControlPoints(chartArea: ChartArea, indexAxis: "x" | "y"): Unit = js.native
}

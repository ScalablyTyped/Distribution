package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.PartialPointOptionsPointH
import typings.chartJs.anon.X
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointElement
  extends StObject
     with Element[PointProps, PointOptions & PointHoverOptions] {
  
  def draw(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = js.native
  
  def getCenterPoint(): X = js.native
  def getCenterPoint(useFinalPosition: Boolean): X = js.native
  
  def getRange(): Any = js.native
  
  def inRange(mouseX: Double, mouseY: Double): Boolean = js.native
  def inRange(mouseX: Double, mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inXRange(mouseX: Double): Boolean = js.native
  def inXRange(mouseX: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inYRange(mouseY: Double): Boolean = js.native
  def inYRange(mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
  
  var parsed: CartesianParsedData = js.native
  
  def size(): Double = js.native
  def size(options: PartialPointOptionsPointH): Double = js.native
  
  var skip: js.UndefOr[Boolean] = js.native
  
  var stop: js.UndefOr[Boolean] = js.native
}

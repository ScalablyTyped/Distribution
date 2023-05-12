package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.Point
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualElement extends StObject {
  
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = js.native
  
  def getCenterPoint(): Point = js.native
  def getCenterPoint(useFinalPosition: Boolean): Point = js.native
  
  var getRange: js.UndefOr[js.Function1[/* axis */ x | y, Double]] = js.native
  
  def inRange(mouseX: Double, mouseY: Double): Boolean = js.native
  def inRange(mouseX: Double, mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inXRange(mouseX: Double): Boolean = js.native
  def inXRange(mouseX: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inYRange(mouseY: Double): Boolean = js.native
  def inYRange(mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
}

package typings.chartJs.mod

import typings.chartJs.anon.X
import typings.chartJs.distChunksHelpersDotcoreMod.ArcOptions
import typings.chartJs.distChunksHelpersDotcoreMod.E
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcElement extends E[ArcProps, ArcOptions] {
  
  var circumference: Double = js.native
  
  def draw(ctx: CanvasRenderingContext2D): scala.Unit = js.native
  
  var endAngle: Double = js.native
  
  var fullCircles: Double = js.native
  
  def getCenterPoint(useFinalPosition: Boolean): X = js.native
  
  def inRange(chartX: Double, chartY: Double, useFinalPosition: Boolean): Boolean = js.native
  
  var innerRadius: Double = js.native
  
  var outerRadius: Double = js.native
  
  var pixelMargin: Double = js.native
  
  var startAngle: Double = js.native
}

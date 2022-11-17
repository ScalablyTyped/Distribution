package typings.chartJs.mod

import typings.chartJs.anon.X
import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.E
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarElement extends E[AnyObject, AnyObject] {
  
  var base: Any = js.native
  
  def draw(ctx: Any): scala.Unit = js.native
  
  def getCenterPoint(useFinalPosition: Any): X = js.native
  
  def getRange(axis: Any): Double = js.native
  
  var height: Any = js.native
  
  var horizontal: Any = js.native
  
  def inRange(mouseX: Any, mouseY: Any, useFinalPosition: Any): Boolean = js.native
  
  def inXRange(mouseX: Any, useFinalPosition: Any): Boolean = js.native
  
  def inYRange(mouseY: Any, useFinalPosition: Any): Boolean = js.native
  
  var inflateAmount: Any = js.native
  
  var width: Any = js.native
}

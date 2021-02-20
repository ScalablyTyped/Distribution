package typings.ckeditorCkeditor5Utils.mod

import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.Range
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "Rect")
@js.native
class Rect protected () extends StObject {
  def this(source: js.Object) = this()
  def this(source: Rect) = this()
  def this(source: ClientRect) = this()
  def this(source: HTMLElement) = this()
  def this(source: Range) = this()
  def this(source: Window) = this()
  
  val bottom: Double = js.native
  
  def contains(anotherRect: Rect): Boolean = js.native
  
  def excludeScrollbarsAndBorders(): Rect = js.native
  
  def getArea(): Double = js.native
  
  def getIntersection(anotherRect: Rect): Rect = js.native
  
  def getIntersectionArea(anotherRect: Rect): Double = js.native
  
  def getVisible(): Rect | Null = js.native
  
  val height: Double = js.native
  
  def isEqual(rect: Rect): Boolean = js.native
  
  val left: Double = js.native
  
  def moveBy(x: Double, y: Double): Rect = js.native
  
  def moveTo(x: Double, y: Double): Rect = js.native
  
  val right: Double = js.native
  
  val top: Double = js.native
  
  val width: Double = js.native
}
/* static members */
object Rect {
  
  @JSImport("@ckeditor/ckeditor5-utils", "Rect.getDomRangeRects")
  @js.native
  def getDomRangeRects(range: Range): js.Array[Rect] = js.native
}

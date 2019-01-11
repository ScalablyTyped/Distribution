package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "Rect")
@js.native
class Rect protected () extends js.Object {
  def this(source: Rect) = this()
  def this(source: js.Object) = this()
  def this(source: stdLib.ClientRect) = this()
  def this(source: stdLib.HTMLElement) = this()
  def this(source: stdLib.Range) = this()
  def this(source: stdLib.Window) = this()
  val bottom: scala.Double = js.native
  val height: scala.Double = js.native
  val left: scala.Double = js.native
  val right: scala.Double = js.native
  val top: scala.Double = js.native
  val width: scala.Double = js.native
  def contains(anotherRect: Rect): scala.Boolean = js.native
  def excludeScrollbarsAndBorders(): Rect = js.native
  def getArea(): scala.Double = js.native
  def getIntersection(anotherRect: Rect): Rect = js.native
  def getIntersectionArea(anotherRect: Rect): scala.Double = js.native
  def getVisible(): Rect | scala.Null = js.native
  def isEqual(rect: Rect): scala.Boolean = js.native
  def moveBy(x: scala.Double, y: scala.Double): Rect = js.native
  def moveTo(x: scala.Double, y: scala.Double): Rect = js.native
}

@JSImport("@ckeditor/ckeditor5-utils", "Rect")
@js.native
object Rect extends js.Object {
  def getDomRangeRects(range: stdLib.Range): js.Array[atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod.Rect] = js.native
}


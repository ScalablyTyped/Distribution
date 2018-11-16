package typings
package axelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Axel")
@js.native
class Axel () extends js.Object {
  var brush: java.lang.String = js.native
  var cols: scala.Double = js.native
  var cursor: cursorInterface = js.native
  var rows: scala.Double = js.native
  def bg(r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def box(x1: scala.Double, y1: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def circ(x: scala.Double, y: scala.Double, m: scala.Double): scala.Double = js.native
  def clear(): scala.Unit = js.native
  def dist(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def draw(cb: js.Function): scala.Unit = js.native
  def fg(r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def goto(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def lerp(p1: scala.Double, p2: scala.Double, m: scala.Double): scala.Double = js.native
  def line(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Unit = js.native
  def point(x: scala.Double, y: scala.Double, char: java.lang.String): scala.Unit = js.native
  def scrub(x1: scala.Double, y1: scala.Double, w: scala.Double, h: scala.Double): scala.Unit = js.native
  def text(x: scala.Double, y: scala.Double, text: java.lang.String): scala.Unit = js.native
}


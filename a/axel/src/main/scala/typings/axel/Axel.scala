package typings.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Axel")
@js.native
class Axel () extends js.Object {
  var brush: String = js.native
  var cols: Double = js.native
  var cursor: cursorInterface = js.native
  var rows: Double = js.native
  def bg(r: Double, g: Double, b: Double): Unit = js.native
  def box(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
  def circ(x: Double, y: Double, m: Double): Double = js.native
  def clear(): Unit = js.native
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def draw(cb: js.Function): Unit = js.native
  def fg(r: Double, g: Double, b: Double): Unit = js.native
  def goto(x: Double, y: Double): Unit = js.native
  def lerp(p1: Double, p2: Double, m: Double): Double = js.native
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  def point(x: Double, y: Double, char: String): Unit = js.native
  def scrub(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
  def text(x: Double, y: Double, text: String): Unit = js.native
}


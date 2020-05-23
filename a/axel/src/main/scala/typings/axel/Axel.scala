package typings.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Axel extends js.Object {
  var brush: String
  var cols: Double
  var cursor: cursorInterface
  var rows: Double
  def bg(r: Double, g: Double, b: Double): Unit
  def box(x1: Double, y1: Double, w: Double, h: Double): Unit
  def circ(x: Double, y: Double, m: Double): Double
  def clear(): Unit
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double
  def draw(cb: js.Function): Unit
  def fg(r: Double, g: Double, b: Double): Unit
  def goto(x: Double, y: Double): Unit
  def lerp(p1: Double, p2: Double, m: Double): Double
  def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit
  def point(x: Double, y: Double, char: String): Unit
  def scrub(x1: Double, y1: Double, w: Double, h: Double): Unit
  def text(x: Double, y: Double, text: String): Unit
}

object Axel {
  @scala.inline
  def apply(
    bg: (Double, Double, Double) => Unit,
    box: (Double, Double, Double, Double) => Unit,
    brush: String,
    circ: (Double, Double, Double) => Double,
    clear: () => Unit,
    cols: Double,
    cursor: cursorInterface,
    dist: (Double, Double, Double, Double) => Double,
    draw: js.Function => Unit,
    fg: (Double, Double, Double) => Unit,
    goto: (Double, Double) => Unit,
    lerp: (Double, Double, Double) => Double,
    line: (Double, Double, Double, Double) => Unit,
    point: (Double, Double, String) => Unit,
    rows: Double,
    scrub: (Double, Double, Double, Double) => Unit,
    text: (Double, Double, String) => Unit
  ): Axel = {
    val __obj = js.Dynamic.literal(bg = js.Any.fromFunction3(bg), box = js.Any.fromFunction4(box), brush = brush.asInstanceOf[js.Any], circ = js.Any.fromFunction3(circ), clear = js.Any.fromFunction0(clear), cols = cols.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], dist = js.Any.fromFunction4(dist), draw = js.Any.fromFunction1(draw), fg = js.Any.fromFunction3(fg), goto = js.Any.fromFunction2(goto), lerp = js.Any.fromFunction3(lerp), line = js.Any.fromFunction4(line), point = js.Any.fromFunction3(point), rows = rows.asInstanceOf[js.Any], scrub = js.Any.fromFunction4(scrub), text = js.Any.fromFunction3(text))
    __obj.asInstanceOf[Axel]
  }
}


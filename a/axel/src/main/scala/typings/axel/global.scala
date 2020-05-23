package typings.axel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Axel ()
    extends typings.axel.Axel {
    /* CompleteClass */
    override var brush: String = js.native
    /* CompleteClass */
    override var cols: Double = js.native
    /* CompleteClass */
    override var cursor: cursorInterface = js.native
    /* CompleteClass */
    override var rows: Double = js.native
    /* CompleteClass */
    override def bg(r: Double, g: Double, b: Double): Unit = js.native
    /* CompleteClass */
    override def box(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
    /* CompleteClass */
    override def circ(x: Double, y: Double, m: Double): Double = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
    /* CompleteClass */
    override def draw(cb: js.Function): Unit = js.native
    /* CompleteClass */
    override def fg(r: Double, g: Double, b: Double): Unit = js.native
    /* CompleteClass */
    override def goto(x: Double, y: Double): Unit = js.native
    /* CompleteClass */
    override def lerp(p1: Double, p2: Double, m: Double): Double = js.native
    /* CompleteClass */
    override def line(x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
    /* CompleteClass */
    override def point(x: Double, y: Double, char: String): Unit = js.native
    /* CompleteClass */
    override def scrub(x1: Double, y1: Double, w: Double, h: Double): Unit = js.native
    /* CompleteClass */
    override def text(x: Double, y: Double, text: String): Unit = js.native
  }
  
}


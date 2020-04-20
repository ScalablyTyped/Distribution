package typings.cliBox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<cli-box.cli-box.MarksKeys, string> */
trait Marks extends js.Object {
  var b: String
  var e: String
  var n: String
  @JSName("ne")
  var ne_FMarks: String
  var nw: String
  var s: String
  var se: String
  var sw: String
  var w: String
}

object Marks {
  @scala.inline
  def apply(
    b: String,
    e: String,
    n: String,
    ne: String,
    nw: String,
    s: String,
    se: String,
    sw: String,
    w: String
  ): Marks = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marks]
  }
}


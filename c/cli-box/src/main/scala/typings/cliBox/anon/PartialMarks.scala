package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cli-box.cli-box.Marks> */
trait PartialMarks extends js.Object {
  var b: js.UndefOr[String] = js.undefined
  var e: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[String] = js.undefined
  @JSName("ne")
  var ne_FPartialMarks: js.UndefOr[String] = js.undefined
  var nw: js.UndefOr[String] = js.undefined
  var s: js.UndefOr[String] = js.undefined
  var se: js.UndefOr[String] = js.undefined
  var sw: js.UndefOr[String] = js.undefined
  var w: js.UndefOr[String] = js.undefined
}

object PartialMarks {
  @scala.inline
  def apply(
    b: String = null,
    e: String = null,
    n: String = null,
    ne: String = null,
    nw: String = null,
    s: String = null,
    se: String = null,
    sw: String = null,
    w: String = null
  ): PartialMarks = {
    val __obj = js.Dynamic.literal()
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (ne != null) __obj.updateDynamic("ne")(ne.asInstanceOf[js.Any])
    if (nw != null) __obj.updateDynamic("nw")(nw.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (se != null) __obj.updateDynamic("se")(se.asInstanceOf[js.Any])
    if (sw != null) __obj.updateDynamic("sw")(sw.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMarks]
  }
}


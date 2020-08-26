package typings.cliBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cli-box.cli-box.Marks> */
@js.native
trait PartialMarks extends js.Object {
  var b: js.UndefOr[String] = js.native
  var e: js.UndefOr[String] = js.native
  var n: js.UndefOr[String] = js.native
  @JSName("ne")
  var ne_FPartialMarks: js.UndefOr[String] = js.native
  var nw: js.UndefOr[String] = js.native
  var s: js.UndefOr[String] = js.native
  var se: js.UndefOr[String] = js.native
  var sw: js.UndefOr[String] = js.native
  var w: js.UndefOr[String] = js.native
}

object PartialMarks {
  @scala.inline
  def apply(): PartialMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMarks]
  }
  @scala.inline
  implicit class PartialMarksOps[Self <: PartialMarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setNe(value: String): Self = this.set("ne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNe: Self = this.set("ne", js.undefined)
    @scala.inline
    def setNw(value: String): Self = this.set("nw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNw: Self = this.set("nw", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setSe(value: String): Self = this.set("se", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSe: Self = this.set("se", js.undefined)
    @scala.inline
    def setSw(value: String): Self = this.set("sw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSw: Self = this.set("sw", js.undefined)
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}


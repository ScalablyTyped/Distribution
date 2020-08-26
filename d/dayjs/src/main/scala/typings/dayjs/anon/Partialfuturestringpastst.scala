package typings.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  future :string,   past :string,   s :string,   m :string,   mm :string,   h :string,   hh :string,   d :string,   dd :string,   M :string,   MM :string,   y :string,   yy :string}> */
@js.native
trait Partialfuturestringpastst extends js.Object {
  var M: js.UndefOr[String] = js.native
  var MM: js.UndefOr[String] = js.native
  var d: js.UndefOr[String] = js.native
  var dd: js.UndefOr[String] = js.native
  var future: js.UndefOr[String] = js.native
  var h: js.UndefOr[String] = js.native
  var hh: js.UndefOr[String] = js.native
  var m: js.UndefOr[String] = js.native
  var mm: js.UndefOr[String] = js.native
  var past: js.UndefOr[String] = js.native
  var s: js.UndefOr[String] = js.native
  var y: js.UndefOr[String] = js.native
  var yy: js.UndefOr[String] = js.native
}

object Partialfuturestringpastst {
  @scala.inline
  def apply(): Partialfuturestringpastst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialfuturestringpastst]
  }
  @scala.inline
  implicit class PartialfuturestringpaststOps[Self <: Partialfuturestringpastst] (val x: Self) extends AnyVal {
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
    def setM(value: String): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setMM(value: String): Self = this.set("MM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMM: Self = this.set("MM", js.undefined)
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDd(value: String): Self = this.set("dd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    @scala.inline
    def setFuture(value: String): Self = this.set("future", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuture: Self = this.set("future", js.undefined)
    @scala.inline
    def setH(value: String): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setHh(value: String): Self = this.set("hh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHh: Self = this.set("hh", js.undefined)
    @scala.inline
    def setPast(value: String): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePast: Self = this.set("past", js.undefined)
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setYy(value: String): Self = this.set("yy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYy: Self = this.set("yy", js.undefined)
  }
  
}


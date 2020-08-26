package typings.cliTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  padding-left :number,   padding-right :number,   head :std.Array<string>,   border :std.Array<string>,   compact :boolean}> */
@js.native
trait Partialpaddingleftnumberp extends js.Object {
  var border: js.UndefOr[js.Array[String]] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var head: js.UndefOr[js.Array[String]] = js.native
  var `padding-left`: js.UndefOr[Double] = js.native
  var `padding-right`: js.UndefOr[Double] = js.native
}

object Partialpaddingleftnumberp {
  @scala.inline
  def apply(): Partialpaddingleftnumberp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialpaddingleftnumberp]
  }
  @scala.inline
  implicit class PartialpaddingleftnumberpOps[Self <: Partialpaddingleftnumberp] (val x: Self) extends AnyVal {
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
    def setBorderVarargs(value: String*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: js.Array[String]): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setHeadVarargs(value: String*): Self = this.set("head", js.Array(value :_*))
    @scala.inline
    def setHead(value: js.Array[String]): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def `setPadding-left`(value: Double): Self = this.set("padding-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-left`: Self = this.set("padding-left", js.undefined)
    @scala.inline
    def `setPadding-right`(value: Double): Self = this.set("padding-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePadding-right`: Self = this.set("padding-right", js.undefined)
  }
  
}


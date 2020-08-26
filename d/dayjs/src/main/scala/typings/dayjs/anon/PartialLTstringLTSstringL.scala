package typings.dayjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  LT :string,   LTS :string,   L :string,   LL :string,   LLL :string,   LLLL :string}> */
@js.native
trait PartialLTstringLTSstringL extends js.Object {
  var L: js.UndefOr[String] = js.native
  var LL: js.UndefOr[String] = js.native
  var LLL: js.UndefOr[String] = js.native
  var LLLL: js.UndefOr[String] = js.native
  var LT: js.UndefOr[String] = js.native
  var LTS: js.UndefOr[String] = js.native
}

object PartialLTstringLTSstringL {
  @scala.inline
  def apply(): PartialLTstringLTSstringL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLTstringLTSstringL]
  }
  @scala.inline
  implicit class PartialLTstringLTSstringLOps[Self <: PartialLTstringLTSstringL] (val x: Self) extends AnyVal {
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
    def setL(value: String): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("L", js.undefined)
    @scala.inline
    def setLL(value: String): Self = this.set("LL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLL: Self = this.set("LL", js.undefined)
    @scala.inline
    def setLLL(value: String): Self = this.set("LLL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLLL: Self = this.set("LLL", js.undefined)
    @scala.inline
    def setLLLL(value: String): Self = this.set("LLLL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLLLL: Self = this.set("LLLL", js.undefined)
    @scala.inline
    def setLT(value: String): Self = this.set("LT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLT: Self = this.set("LT", js.undefined)
    @scala.inline
    def setLTS(value: String): Self = this.set("LTS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLTS: Self = this.set("LTS", js.undefined)
  }
  
}


package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreditHistoryOptions extends js.Object {
  var begin_after_id: js.UndefOr[String] = js.native
  var bucket: js.UndefOr[String] = js.native
  var length: js.UndefOr[Double] = js.native
}

object CreditHistoryOptions {
  @scala.inline
  def apply(): CreditHistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditHistoryOptions]
  }
  @scala.inline
  implicit class CreditHistoryOptionsOps[Self <: CreditHistoryOptions] (val x: Self) extends AnyVal {
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
    def setBegin_after_id(value: String): Self = this.set("begin_after_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin_after_id: Self = this.set("begin_after_id", js.undefined)
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
  
}


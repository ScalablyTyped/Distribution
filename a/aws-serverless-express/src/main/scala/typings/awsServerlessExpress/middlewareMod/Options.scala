package typings.awsServerlessExpress.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var deleteHeaders: js.UndefOr[Boolean] = js.native
  var reqPropKey: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDeleteHeaders(value: Boolean): Self = this.set("deleteHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteHeaders: Self = this.set("deleteHeaders", js.undefined)
    @scala.inline
    def setReqPropKey(value: String): Self = this.set("reqPropKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqPropKey: Self = this.set("reqPropKey", js.undefined)
  }
  
}


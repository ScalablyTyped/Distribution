package typings.bugsnagJs.clientMod

import typings.bugsnagJs.bugsnagJsStrings.error
import typings.bugsnagJs.bugsnagJsStrings.info
import typings.bugsnagJs.bugsnagJsStrings.warning
import typings.bugsnagJs.commonMod.BeforeSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyOpts extends js.Object {
  var beforeSend: js.UndefOr[BeforeSend] = js.native
  var context: js.UndefOr[String] = js.native
  var device: js.UndefOr[js.Object] = js.native
  var metaData: js.UndefOr[js.Object] = js.native
  var request: js.UndefOr[js.Object] = js.native
  var severity: js.UndefOr[info | warning | error] = js.native
  var user: js.UndefOr[js.Object] = js.native
}

object INotifyOpts {
  @scala.inline
  def apply(): INotifyOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INotifyOpts]
  }
  @scala.inline
  implicit class INotifyOptsOps[Self <: INotifyOpts] (val x: Self) extends AnyVal {
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
    def setBeforeSend(value: /* report */ typings.bugsnagJs.reportMod.default => Boolean | Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDevice(value: js.Object): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setMetaData(value: js.Object): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaData: Self = this.set("metaData", js.undefined)
    @scala.inline
    def setRequest(value: js.Object): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setSeverity(value: info | warning | error): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}


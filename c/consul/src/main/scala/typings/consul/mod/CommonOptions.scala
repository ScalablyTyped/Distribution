package typings.consul.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions extends js.Object {
  var consistent: js.UndefOr[Boolean] = js.native
  var ctx: js.UndefOr[EventEmitter] = js.native
  var dc: js.UndefOr[String] = js.native
  var stale: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var token: js.UndefOr[String] = js.native
  @JSName("wait")
  var wait_FCommonOptions: js.UndefOr[String] = js.native
  var wan: js.UndefOr[Boolean] = js.native
}

object CommonOptions {
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
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
    def setConsistent(value: Boolean): Self = this.set("consistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistent: Self = this.set("consistent", js.undefined)
    @scala.inline
    def setCtx(value: EventEmitter): Self = this.set("ctx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
    @scala.inline
    def setDc(value: String): Self = this.set("dc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDc: Self = this.set("dc", js.undefined)
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setWait(value: String): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
    @scala.inline
    def setWan(value: Boolean): Self = this.set("wan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWan: Self = this.set("wan", js.undefined)
  }
  
}


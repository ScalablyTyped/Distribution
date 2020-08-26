package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapActionDetail extends js.Object {
  /**
    * A description of the bootstrap action.
    */
  var BootstrapActionConfig: js.UndefOr[typings.awsSdk.emrMod.BootstrapActionConfig] = js.native
}

object BootstrapActionDetail {
  @scala.inline
  def apply(): BootstrapActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapActionDetail]
  }
  @scala.inline
  implicit class BootstrapActionDetailOps[Self <: BootstrapActionDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBootstrapActionConfig(value: BootstrapActionConfig): Self = this.set("BootstrapActionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootstrapActionConfig: Self = this.set("BootstrapActionConfig", js.undefined)
  }
  
}


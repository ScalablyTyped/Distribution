package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionControls extends js.Object {
  /**
    * A SsmControls object.
    */
  var SsmControls: js.UndefOr[typings.awsSdk.configserviceMod.SsmControls] = js.native
}

object ExecutionControls {
  @scala.inline
  def apply(): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionControls]
  }
  @scala.inline
  implicit class ExecutionControlsOps[Self <: ExecutionControls] (val x: Self) extends AnyVal {
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
    def setSsmControls(value: SsmControls): Self = this.set("SsmControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsmControls: Self = this.set("SsmControls", js.undefined)
  }
  
}


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
  def apply(SsmControls: SsmControls = null): ExecutionControls = {
    val __obj = js.Dynamic.literal()
    if (SsmControls != null) __obj.updateDynamic("SsmControls")(SsmControls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionControls]
  }
}


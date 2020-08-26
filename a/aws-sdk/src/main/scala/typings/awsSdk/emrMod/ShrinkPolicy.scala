package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShrinkPolicy extends js.Object {
  /**
    * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
    */
  var DecommissionTimeout: js.UndefOr[Integer] = js.native
  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  var InstanceResizePolicy: js.UndefOr[typings.awsSdk.emrMod.InstanceResizePolicy] = js.native
}

object ShrinkPolicy {
  @scala.inline
  def apply(): ShrinkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShrinkPolicy]
  }
  @scala.inline
  implicit class ShrinkPolicyOps[Self <: ShrinkPolicy] (val x: Self) extends AnyVal {
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
    def setDecommissionTimeout(value: Integer): Self = this.set("DecommissionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecommissionTimeout: Self = this.set("DecommissionTimeout", js.undefined)
    @scala.inline
    def setInstanceResizePolicy(value: InstanceResizePolicy): Self = this.set("InstanceResizePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceResizePolicy: Self = this.set("InstanceResizePolicy", js.undefined)
  }
  
}


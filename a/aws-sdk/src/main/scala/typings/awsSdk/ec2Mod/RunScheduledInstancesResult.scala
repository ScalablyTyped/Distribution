package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunScheduledInstancesResult extends js.Object {
  /**
    * The IDs of the newly launched instances.
    */
  var InstanceIdSet: js.UndefOr[typings.awsSdk.ec2Mod.InstanceIdSet] = js.native
}

object RunScheduledInstancesResult {
  @scala.inline
  def apply(): RunScheduledInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunScheduledInstancesResult]
  }
  @scala.inline
  implicit class RunScheduledInstancesResultOps[Self <: RunScheduledInstancesResult] (val x: Self) extends AnyVal {
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
    def setInstanceIdSetVarargs(value: InstanceId*): Self = this.set("InstanceIdSet", js.Array(value :_*))
    @scala.inline
    def setInstanceIdSet(value: InstanceIdSet): Self = this.set("InstanceIdSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIdSet: Self = this.set("InstanceIdSet", js.undefined)
  }
  
}


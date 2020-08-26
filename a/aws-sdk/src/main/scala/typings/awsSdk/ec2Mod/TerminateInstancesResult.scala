package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateInstancesResult extends js.Object {
  /**
    * Information about the terminated instances.
    */
  var TerminatingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object TerminateInstancesResult {
  @scala.inline
  def apply(): TerminateInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateInstancesResult]
  }
  @scala.inline
  implicit class TerminateInstancesResultOps[Self <: TerminateInstancesResult] (val x: Self) extends AnyVal {
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
    def setTerminatingInstancesVarargs(value: InstanceStateChange*): Self = this.set("TerminatingInstances", js.Array(value :_*))
    @scala.inline
    def setTerminatingInstances(value: InstanceStateChangeList): Self = this.set("TerminatingInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminatingInstances: Self = this.set("TerminatingInstances", js.undefined)
  }
  
}


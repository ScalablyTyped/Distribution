package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartInstancesResult extends js.Object {
  /**
    * Information about the started instances.
    */
  var StartingInstances: js.UndefOr[InstanceStateChangeList] = js.native
}

object StartInstancesResult {
  @scala.inline
  def apply(): StartInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartInstancesResult]
  }
  @scala.inline
  implicit class StartInstancesResultOps[Self <: StartInstancesResult] (val x: Self) extends AnyVal {
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
    def setStartingInstancesVarargs(value: InstanceStateChange*): Self = this.set("StartingInstances", js.Array(value :_*))
    @scala.inline
    def setStartingInstances(value: InstanceStateChangeList): Self = this.set("StartingInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingInstances: Self = this.set("StartingInstances", js.undefined)
  }
  
}


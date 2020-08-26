package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetOnPremisesInstancesOutput extends js.Object {
  /**
    * Information about the on-premises instances.
    */
  var instanceInfos: js.UndefOr[InstanceInfoList] = js.native
}

object BatchGetOnPremisesInstancesOutput {
  @scala.inline
  def apply(): BatchGetOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
  }
  @scala.inline
  implicit class BatchGetOnPremisesInstancesOutputOps[Self <: BatchGetOnPremisesInstancesOutput] (val x: Self) extends AnyVal {
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
    def setInstanceInfosVarargs(value: InstanceInfo*): Self = this.set("instanceInfos", js.Array(value :_*))
    @scala.inline
    def setInstanceInfos(value: InstanceInfoList): Self = this.set("instanceInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceInfos: Self = this.set("instanceInfos", js.undefined)
  }
  
}


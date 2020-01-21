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
  def apply(instanceInfos: InstanceInfoList = null): BatchGetOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceInfos != null) __obj.updateDynamic("instanceInfos")(instanceInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
  }
}


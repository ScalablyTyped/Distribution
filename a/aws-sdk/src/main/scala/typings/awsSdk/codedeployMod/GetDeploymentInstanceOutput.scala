package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeploymentInstanceOutput extends js.Object {
  /**
    *  Information about the instance. 
    */
  var instanceSummary: js.UndefOr[InstanceSummary] = js.native
}

object GetDeploymentInstanceOutput {
  @scala.inline
  def apply(instanceSummary: InstanceSummary = null): GetDeploymentInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceSummary != null) __obj.updateDynamic("instanceSummary")(instanceSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentInstanceOutput]
  }
}


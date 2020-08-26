package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackProvisioningParametersResult extends js.Object {
  /**
    * The AWS OpsWorks Stacks agent installer's URL.
    */
  var AgentInstallerUrl: js.UndefOr[String] = js.native
  /**
    * An embedded object that contains the provisioning parameters.
    */
  var Parameters: js.UndefOr[typings.awsSdk.opsworksMod.Parameters] = js.native
}

object DescribeStackProvisioningParametersResult {
  @scala.inline
  def apply(): DescribeStackProvisioningParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
  }
  @scala.inline
  implicit class DescribeStackProvisioningParametersResultOps[Self <: DescribeStackProvisioningParametersResult] (val x: Self) extends AnyVal {
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
    def setAgentInstallerUrl(value: String): Self = this.set("AgentInstallerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentInstallerUrl: Self = this.set("AgentInstallerUrl", js.undefined)
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
  
}


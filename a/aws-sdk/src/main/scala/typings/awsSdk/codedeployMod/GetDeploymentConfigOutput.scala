package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentConfigOutput extends js.Object {
  
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.native
}
object GetDeploymentConfigOutput {
  
  @scala.inline
  def apply(): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
  
  @scala.inline
  implicit class GetDeploymentConfigOutputOps[Self <: GetDeploymentConfigOutput] (val x: Self) extends AnyVal {
    
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
    def setDeploymentConfigInfo(value: DeploymentConfigInfo): Self = this.set("deploymentConfigInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfigInfo: Self = this.set("deploymentConfigInfo", js.undefined)
  }
}

package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploySystemInstanceResponse extends js.Object {
  
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.native
  
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary = js.native
}
object DeploySystemInstanceResponse {
  
  @scala.inline
  def apply(summary: SystemInstanceSummary): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
  
  @scala.inline
  implicit class DeploySystemInstanceResponseOps[Self <: DeploySystemInstanceResponse] (val x: Self) extends AnyVal {
    
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
    def setSummary(value: SystemInstanceSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassDeploymentId(value: GreengrassDeploymentId): Self = this.set("greengrassDeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassDeploymentId: Self = this.set("greengrassDeploymentId", js.undefined)
  }
}

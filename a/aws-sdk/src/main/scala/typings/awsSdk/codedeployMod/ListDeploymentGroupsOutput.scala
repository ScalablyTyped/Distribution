package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentGroupsOutput extends js.Object {
  
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * A list of deployment group names.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.native
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment groups call to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDeploymentGroupsOutput {
  
  @scala.inline
  def apply(): ListDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentGroupsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentGroupsOutputOps[Self <: ListDeploymentGroupsOutput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setDeploymentGroupsVarargs(value: DeploymentGroupName*): Self = this.set("deploymentGroups", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentGroups(value: DeploymentGroupsList): Self = this.set("deploymentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentGroups: Self = this.set("deploymentGroups", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}

package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentGroupsOutput extends StObject {
  
  /**
    * The application name.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  
  /**
    * A list of deployment group names.
    */
  var deploymentGroups: js.UndefOr[DeploymentGroupsList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment groups call to return the next set of deployment groups in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentGroupsOutput {
  
  @scala.inline
  def apply(): ListDeploymentGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentGroupsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentGroupsOutputMutableBuilder[Self <: ListDeploymentGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setDeploymentGroups(value: DeploymentGroupsList): Self = StObject.set(x, "deploymentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupsUndefined: Self = StObject.set(x, "deploymentGroups", js.undefined)
    
    @scala.inline
    def setDeploymentGroupsVarargs(value: DeploymentGroupName*): Self = StObject.set(x, "deploymentGroups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

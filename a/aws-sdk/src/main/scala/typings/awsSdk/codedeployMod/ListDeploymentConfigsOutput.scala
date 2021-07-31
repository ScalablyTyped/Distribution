package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentConfigsOutput extends StObject {
  
  /**
    * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
    */
  var deploymentConfigsList: js.UndefOr[DeploymentConfigsList] = js.undefined
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployment configurations call to return the next set of deployment configurations in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDeploymentConfigsOutput {
  
  @scala.inline
  def apply(): ListDeploymentConfigsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentConfigsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentConfigsOutputMutableBuilder[Self <: ListDeploymentConfigsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfigsList(value: DeploymentConfigsList): Self = StObject.set(x, "deploymentConfigsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigsListUndefined: Self = StObject.set(x, "deploymentConfigsList", js.undefined)
    
    @scala.inline
    def setDeploymentConfigsListVarargs(value: DeploymentConfigName*): Self = StObject.set(x, "deploymentConfigsList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

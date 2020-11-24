package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeploymentsOutput extends js.Object {
  
  /**
    * A list of deployment IDs.
    */
  var deployments: js.UndefOr[DeploymentsList] = js.native
  
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list deployments call to return the next set of deployments in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListDeploymentsOutput {
  
  @scala.inline
  def apply(): ListDeploymentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsOutput]
  }
  
  @scala.inline
  implicit class ListDeploymentsOutputOps[Self <: ListDeploymentsOutput] (val x: Self) extends AnyVal {
    
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
    def setDeploymentsVarargs(value: DeploymentId*): Self = this.set("deployments", js.Array(value :_*))
    
    @scala.inline
    def setDeployments(value: DeploymentsList): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployments: Self = this.set("deployments", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}

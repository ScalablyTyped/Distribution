package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBulkDeploymentDetailedReportsResponse extends StObject {
  
  /**
    * A list of the individual group deployments in the bulk deployment operation.
    */
  var Deployments: js.UndefOr[BulkDeploymentResults] = js.native
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListBulkDeploymentDetailedReportsResponse {
  
  @scala.inline
  def apply(): ListBulkDeploymentDetailedReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
  }
  
  @scala.inline
  implicit class ListBulkDeploymentDetailedReportsResponseMutableBuilder[Self <: ListBulkDeploymentDetailedReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: BulkDeploymentResults): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: BulkDeploymentResult*): Self = StObject.set(x, "Deployments", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceActionsForProvisioningArtifactOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * An object containing information about the self-service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.undefined
}
object ListServiceActionsForProvisioningArtifactOutput {
  
  @scala.inline
  def apply(): ListServiceActionsForProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
  }
  
  @scala.inline
  implicit class ListServiceActionsForProvisioningArtifactOutputMutableBuilder[Self <: ListServiceActionsForProvisioningArtifactOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setServiceActionSummaries(value: ServiceActionSummaries): Self = StObject.set(x, "ServiceActionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionSummariesUndefined: Self = StObject.set(x, "ServiceActionSummaries", js.undefined)
    
    @scala.inline
    def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = StObject.set(x, "ServiceActionSummaries", js.Array(value :_*))
  }
}

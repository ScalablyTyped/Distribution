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
  
  inline def apply(): ListServiceActionsForProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsForProvisioningArtifactOutput]
  }
  
  extension [Self <: ListServiceActionsForProvisioningArtifactOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setServiceActionSummaries(value: ServiceActionSummaries): Self = StObject.set(x, "ServiceActionSummaries", value.asInstanceOf[js.Any])
    
    inline def setServiceActionSummariesUndefined: Self = StObject.set(x, "ServiceActionSummaries", js.undefined)
    
    inline def setServiceActionSummariesVarargs(value: ServiceActionSummary*): Self = StObject.set(x, "ServiceActionSummaries", js.Array(value*))
  }
}

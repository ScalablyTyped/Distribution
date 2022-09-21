package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningArtifactsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetails] = js.undefined
}
object ListProvisioningArtifactsOutput {
  
  inline def apply(): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
  
  extension [Self <: ListProvisioningArtifactsOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisioningArtifactDetails(value: ProvisioningArtifactDetails): Self = StObject.set(x, "ProvisioningArtifactDetails", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactDetailsUndefined: Self = StObject.set(x, "ProvisioningArtifactDetails", js.undefined)
    
    inline def setProvisioningArtifactDetailsVarargs(value: ProvisioningArtifactDetail*): Self = StObject.set(x, "ProvisioningArtifactDetails", js.Array(value*))
  }
}

package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProvisioningArtifactsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the provisioning artifacts.
    */
  var ProvisioningArtifactDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetails] = js.native
}
object ListProvisioningArtifactsOutput {
  
  @scala.inline
  def apply(): ListProvisioningArtifactsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsOutput]
  }
  
  @scala.inline
  implicit class ListProvisioningArtifactsOutputMutableBuilder[Self <: ListProvisioningArtifactsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactDetails(value: ProvisioningArtifactDetails): Self = StObject.set(x, "ProvisioningArtifactDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactDetailsUndefined: Self = StObject.set(x, "ProvisioningArtifactDetails", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactDetailsVarargs(value: ProvisioningArtifactDetail*): Self = StObject.set(x, "ProvisioningArtifactDetails", js.Array(value :_*))
  }
}

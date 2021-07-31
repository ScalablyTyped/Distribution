package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningArtifactsForServiceActionOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * An array of objects with information about product views and provisioning artifacts.
    */
  var ProvisioningArtifactViews: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactViews] = js.undefined
}
object ListProvisioningArtifactsForServiceActionOutput {
  
  @scala.inline
  def apply(): ListProvisioningArtifactsForServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisioningArtifactsForServiceActionOutput]
  }
  
  @scala.inline
  implicit class ListProvisioningArtifactsForServiceActionOutputMutableBuilder[Self <: ListProvisioningArtifactsForServiceActionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactViews(value: ProvisioningArtifactViews): Self = StObject.set(x, "ProvisioningArtifactViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactViewsUndefined: Self = StObject.set(x, "ProvisioningArtifactViews", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactViewsVarargs(value: ProvisioningArtifactView*): Self = StObject.set(x, "ProvisioningArtifactViews", js.Array(value :_*))
  }
}

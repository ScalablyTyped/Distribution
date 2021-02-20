package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProductOutput extends StObject {
  
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  
  /**
    * Information about the provisioning artifact. 
    */
  var ProvisioningArtifactDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetail] = js.native
  
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}
object CreateProductOutput {
  
  @scala.inline
  def apply(): CreateProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProductOutput]
  }
  
  @scala.inline
  implicit class CreateProductOutputMutableBuilder[Self <: CreateProductOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductViewDetail(value: ProductViewDetail): Self = StObject.set(x, "ProductViewDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewDetailUndefined: Self = StObject.set(x, "ProductViewDetail", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = StObject.set(x, "ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactDetailUndefined: Self = StObject.set(x, "ProvisioningArtifactDetail", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}

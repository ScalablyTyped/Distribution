package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProductViewOutput extends StObject {
  
  /**
    * Summary information about the product.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  
  /**
    * Information about the provisioning artifacts for the product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifacts] = js.native
}
object DescribeProductViewOutput {
  
  @scala.inline
  def apply(): DescribeProductViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductViewOutput]
  }
  
  @scala.inline
  implicit class DescribeProductViewOutputMutableBuilder[Self <: DescribeProductViewOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    @scala.inline
    def setProvisioningArtifacts(value: ProvisioningArtifacts): Self = StObject.set(x, "ProvisioningArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactsUndefined: Self = StObject.set(x, "ProvisioningArtifacts", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactsVarargs(value: ProvisioningArtifact*): Self = StObject.set(x, "ProvisioningArtifacts", js.Array(value :_*))
  }
}

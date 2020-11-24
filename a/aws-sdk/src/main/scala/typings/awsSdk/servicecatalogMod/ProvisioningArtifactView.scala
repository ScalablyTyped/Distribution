package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactView extends js.Object {
  
  /**
    * Summary information about a product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummary] = js.native
  
  /**
    * Information about a provisioning artifact. A provisioning artifact is also known as a product version.
    */
  var ProvisioningArtifact: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifact] = js.native
}
object ProvisioningArtifactView {
  
  @scala.inline
  def apply(): ProvisioningArtifactView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactView]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactViewOps[Self <: ProvisioningArtifactView] (val x: Self) extends AnyVal {
    
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
    def setProductViewSummary(value: ProductViewSummary): Self = this.set("ProductViewSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductViewSummary: Self = this.set("ProductViewSummary", js.undefined)
    
    @scala.inline
    def setProvisioningArtifact(value: ProvisioningArtifact): Self = this.set("ProvisioningArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifact: Self = this.set("ProvisioningArtifact", js.undefined)
  }
}

package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningParametersInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths. You must provide the name or ID, but not both.
    */
  var PathId: js.UndefOr[Id] = js.native
  /**
    * The name of the path. You must provide the name or ID, but not both.
    */
  var PathName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The product identifier. You must provide the product name or ID, but not both.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The name of the product. You must provide the name or ID, but not both.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  /**
    * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The name of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
}

object DescribeProvisioningParametersInput {
  @scala.inline
  def apply(): DescribeProvisioningParametersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningParametersInput]
  }
  @scala.inline
  implicit class DescribeProvisioningParametersInputOps[Self <: DescribeProvisioningParametersInput] (val x: Self) extends AnyVal {
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
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    @scala.inline
    def setPathId(value: Id): Self = this.set("PathId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathId: Self = this.set("PathId", js.undefined)
    @scala.inline
    def setPathName(value: PortfolioDisplayName): Self = this.set("PathName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathName: Self = this.set("PathName", js.undefined)
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    @scala.inline
    def setProductName(value: ProductViewName): Self = this.set("ProductName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("ProductName", js.undefined)
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = this.set("ProvisioningArtifactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningArtifactName: Self = this.set("ProvisioningArtifactName", js.undefined)
  }
  
}


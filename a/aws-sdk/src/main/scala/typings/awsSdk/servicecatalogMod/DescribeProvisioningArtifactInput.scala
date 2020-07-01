package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.native
  /**
    * The product name.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  /**
    * The provisioning artifact name.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
  /**
    * Indicates whether a verbose level of detail is enabled.
    */
  var Verbose: js.UndefOr[typings.awsSdk.servicecatalogMod.Verbose] = js.native
}

object DescribeProvisioningArtifactInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    ProductId: Id = null,
    ProductName: ProductViewName = null,
    ProvisioningArtifactId: Id = null,
    ProvisioningArtifactName: ProvisioningArtifactName = null,
    Verbose: js.UndefOr[Verbose] = js.undefined
  ): DescribeProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId.asInstanceOf[js.Any])
    if (ProductName != null) __obj.updateDynamic("ProductName")(ProductName.asInstanceOf[js.Any])
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId.asInstanceOf[js.Any])
    if (ProvisioningArtifactName != null) __obj.updateDynamic("ProvisioningArtifactName")(ProvisioningArtifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningArtifactInput]
  }
}


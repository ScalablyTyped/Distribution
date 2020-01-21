package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
    */
  var CopyOptions: js.UndefOr[typings.awsSdk.servicecatalogMod.CopyOptions] = js.native
  /**
    *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The Amazon Resource Name (ARN) of the source product.
    */
  var SourceProductArn: ProductArn = js.native
  /**
    * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
    */
  var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.native
  /**
    * The identifier of the target product. By default, a new product is created.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
  /**
    * A name for the target product. The default is the name of the source product.
    */
  var TargetProductName: js.UndefOr[ProductViewName] = js.native
}

object CopyProductInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    SourceProductArn: ProductArn,
    AcceptLanguage: AcceptLanguage = null,
    CopyOptions: CopyOptions = null,
    SourceProvisioningArtifactIdentifiers: SourceProvisioningArtifactProperties = null,
    TargetProductId: Id = null,
    TargetProductName: ProductViewName = null
  ): CopyProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], SourceProductArn = SourceProductArn.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (CopyOptions != null) __obj.updateDynamic("CopyOptions")(CopyOptions.asInstanceOf[js.Any])
    if (SourceProvisioningArtifactIdentifiers != null) __obj.updateDynamic("SourceProvisioningArtifactIdentifiers")(SourceProvisioningArtifactIdentifiers.asInstanceOf[js.Any])
    if (TargetProductId != null) __obj.updateDynamic("TargetProductId")(TargetProductId.asInstanceOf[js.Any])
    if (TargetProductName != null) __obj.updateDynamic("TargetProductName")(TargetProductName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyProductInput]
  }
}


package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The configuration for the provisioning artifact.
    */
  var Parameters: ProvisioningArtifactProperties = js.native
  /**
    * The product identifier.
    */
  var ProductId: Id = js.native
}

object CreateProvisioningArtifactInput {
  @scala.inline
  def apply(
    IdempotencyToken: IdempotencyToken,
    Parameters: ProvisioningArtifactProperties,
    ProductId: Id,
    AcceptLanguage: AcceptLanguage = null
  ): CreateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningArtifactInput]
  }
}


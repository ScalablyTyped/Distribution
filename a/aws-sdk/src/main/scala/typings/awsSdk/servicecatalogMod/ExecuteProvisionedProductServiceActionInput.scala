package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteProvisionedProductServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * An idempotency token that uniquely identifies the execute request.
    */
  var ExecuteToken: IdempotencyToken = js.native
  var Parameters: js.UndefOr[ExecutionParameterMap] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id = js.native
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: Id = js.native
}

object ExecuteProvisionedProductServiceActionInput {
  @scala.inline
  def apply(
    ExecuteToken: IdempotencyToken,
    ProvisionedProductId: Id,
    ServiceActionId: Id,
    AcceptLanguage: AcceptLanguage = null,
    Parameters: ExecutionParameterMap = null
  ): ExecuteProvisionedProductServiceActionInput = {
    val __obj = js.Dynamic.literal(ExecuteToken = ExecuteToken.asInstanceOf[js.Any], ProvisionedProductId = ProvisionedProductId.asInstanceOf[js.Any], ServiceActionId = ServiceActionId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteProvisionedProductServiceActionInput]
  }
}


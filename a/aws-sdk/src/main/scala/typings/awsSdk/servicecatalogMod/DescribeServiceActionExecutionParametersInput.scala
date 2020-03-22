package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceActionExecutionParametersInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id = js.native
  /**
    * The self-service action identifier.
    */
  var ServiceActionId: Id = js.native
}

object DescribeServiceActionExecutionParametersInput {
  @scala.inline
  def apply(ProvisionedProductId: Id, ServiceActionId: Id, AcceptLanguage: AcceptLanguage = null): DescribeServiceActionExecutionParametersInput = {
    val __obj = js.Dynamic.literal(ProvisionedProductId = ProvisionedProductId.asInstanceOf[js.Any], ServiceActionId = ServiceActionId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersInput]
  }
}


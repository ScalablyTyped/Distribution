package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableImportFindingsForProductResponse extends js.Object {
  /**
    * The ARN of your subscription to the product to enable integrations for.
    */
  var ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.native
}

object EnableImportFindingsForProductResponse {
  @scala.inline
  def apply(ProductSubscriptionArn: NonEmptyString = null): EnableImportFindingsForProductResponse = {
    val __obj = js.Dynamic.literal()
    if (ProductSubscriptionArn != null) __obj.updateDynamic("ProductSubscriptionArn")(ProductSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableImportFindingsForProductResponse]
  }
}


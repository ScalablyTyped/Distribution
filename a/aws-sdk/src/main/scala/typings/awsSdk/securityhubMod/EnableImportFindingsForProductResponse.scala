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
  def apply(): EnableImportFindingsForProductResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableImportFindingsForProductResponse]
  }
  @scala.inline
  implicit class EnableImportFindingsForProductResponseOps[Self <: EnableImportFindingsForProductResponse] (val x: Self) extends AnyVal {
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
    def setProductSubscriptionArn(value: NonEmptyString): Self = this.set("ProductSubscriptionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSubscriptionArn: Self = this.set("ProductSubscriptionArn", js.undefined)
  }
  
}


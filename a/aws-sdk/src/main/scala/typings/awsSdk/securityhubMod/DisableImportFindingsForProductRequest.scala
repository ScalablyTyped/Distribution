package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableImportFindingsForProductRequest extends js.Object {
  
  /**
    * The ARN of the integrated product to disable the integration for.
    */
  var ProductSubscriptionArn: NonEmptyString = js.native
}
object DisableImportFindingsForProductRequest {
  
  @scala.inline
  def apply(ProductSubscriptionArn: NonEmptyString): DisableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductSubscriptionArn = ProductSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableImportFindingsForProductRequest]
  }
  
  @scala.inline
  implicit class DisableImportFindingsForProductRequestOps[Self <: DisableImportFindingsForProductRequest] (val x: Self) extends AnyVal {
    
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
  }
}

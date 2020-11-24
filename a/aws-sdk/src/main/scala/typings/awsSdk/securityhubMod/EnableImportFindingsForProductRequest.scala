package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableImportFindingsForProductRequest extends js.Object {
  
  /**
    * The ARN of the product to enable the integration for.
    */
  var ProductArn: NonEmptyString = js.native
}
object EnableImportFindingsForProductRequest {
  
  @scala.inline
  def apply(ProductArn: NonEmptyString): EnableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductArn = ProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableImportFindingsForProductRequest]
  }
  
  @scala.inline
  implicit class EnableImportFindingsForProductRequestOps[Self <: EnableImportFindingsForProductRequest] (val x: Self) extends AnyVal {
    
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
    def setProductArn(value: NonEmptyString): Self = this.set("ProductArn", value.asInstanceOf[js.Any])
  }
}

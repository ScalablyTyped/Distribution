package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableImportFindingsForProductRequest extends StObject {
  
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
  implicit class DisableImportFindingsForProductRequestMutableBuilder[Self <: DisableImportFindingsForProductRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionArn", value.asInstanceOf[js.Any])
  }
}

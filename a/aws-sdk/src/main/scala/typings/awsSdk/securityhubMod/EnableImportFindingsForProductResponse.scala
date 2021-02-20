package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableImportFindingsForProductResponse extends StObject {
  
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
  implicit class EnableImportFindingsForProductResponseMutableBuilder[Self <: EnableImportFindingsForProductResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSubscriptionArnUndefined: Self = StObject.set(x, "ProductSubscriptionArn", js.undefined)
  }
}

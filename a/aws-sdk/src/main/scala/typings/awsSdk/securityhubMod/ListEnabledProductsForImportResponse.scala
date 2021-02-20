package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnabledProductsForImportResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * The list of ARNs for the resources that represent your subscriptions to products. 
    */
  var ProductSubscriptions: js.UndefOr[ProductSubscriptionArnList] = js.native
}
object ListEnabledProductsForImportResponse {
  
  @scala.inline
  def apply(): ListEnabledProductsForImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnabledProductsForImportResponse]
  }
  
  @scala.inline
  implicit class ListEnabledProductsForImportResponseMutableBuilder[Self <: ListEnabledProductsForImportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProductSubscriptions(value: ProductSubscriptionArnList): Self = StObject.set(x, "ProductSubscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSubscriptionsUndefined: Self = StObject.set(x, "ProductSubscriptions", js.undefined)
    
    @scala.inline
    def setProductSubscriptionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ProductSubscriptions", js.Array(value :_*))
  }
}

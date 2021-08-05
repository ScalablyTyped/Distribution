package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableImportFindingsForProductResponse extends StObject {
  
  /**
    * The ARN of your subscription to the product to enable integrations for.
    */
  var ProductSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined
}
object EnableImportFindingsForProductResponse {
  
  inline def apply(): EnableImportFindingsForProductResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableImportFindingsForProductResponse]
  }
  
  extension [Self <: EnableImportFindingsForProductResponse](x: Self) {
    
    inline def setProductSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setProductSubscriptionArnUndefined: Self = StObject.set(x, "ProductSubscriptionArn", js.undefined)
  }
}

package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveCustomerResult extends StObject {
  
  /**
    * The CustomerAWSAccountId provides the AWS account ID associated with the CustomerIdentifier for the individual customer.
    */
  var CustomerAWSAccountId: js.UndefOr[typings.awsSdk.marketplacemeteringMod.CustomerAWSAccountId] = js.undefined
  
  /**
    * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
    */
  var CustomerIdentifier: js.UndefOr[typings.awsSdk.marketplacemeteringMod.CustomerIdentifier] = js.undefined
  
  /**
    * The product code is returned to confirm that the buyer is registering for your product. Subsequent BatchMeterUsage calls should be made using this product code.
    */
  var ProductCode: js.UndefOr[typings.awsSdk.marketplacemeteringMod.ProductCode] = js.undefined
}
object ResolveCustomerResult {
  
  inline def apply(): ResolveCustomerResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCustomerResult]
  }
  
  extension [Self <: ResolveCustomerResult](x: Self) {
    
    inline def setCustomerAWSAccountId(value: CustomerAWSAccountId): Self = StObject.set(x, "CustomerAWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setCustomerAWSAccountIdUndefined: Self = StObject.set(x, "CustomerAWSAccountId", js.undefined)
    
    inline def setCustomerIdentifier(value: CustomerIdentifier): Self = StObject.set(x, "CustomerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdentifierUndefined: Self = StObject.set(x, "CustomerIdentifier", js.undefined)
    
    inline def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "ProductCode", js.undefined)
  }
}

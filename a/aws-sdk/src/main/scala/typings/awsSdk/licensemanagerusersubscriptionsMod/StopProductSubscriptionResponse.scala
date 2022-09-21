package typings.awsSdk.licensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopProductSubscriptionResponse extends StObject {
  
  /**
    * Metadata that describes the start product subscription operation.
    */
  var ProductUserSummary: typings.awsSdk.licensemanagerusersubscriptionsMod.ProductUserSummary
}
object StopProductSubscriptionResponse {
  
  inline def apply(ProductUserSummary: ProductUserSummary): StopProductSubscriptionResponse = {
    val __obj = js.Dynamic.literal(ProductUserSummary = ProductUserSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopProductSubscriptionResponse]
  }
  
  extension [Self <: StopProductSubscriptionResponse](x: Self) {
    
    inline def setProductUserSummary(value: ProductUserSummary): Self = StObject.set(x, "ProductUserSummary", value.asInstanceOf[js.Any])
  }
}

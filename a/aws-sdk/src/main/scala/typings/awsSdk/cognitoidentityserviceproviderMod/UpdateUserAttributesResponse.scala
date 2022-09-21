package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserAttributesResponse extends StObject {
  
  /**
    * The code delivery details list from the server for the request to update user attributes.
    */
  var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined
}
object UpdateUserAttributesResponse {
  
  inline def apply(): UpdateUserAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserAttributesResponse]
  }
  
  extension [Self <: UpdateUserAttributesResponse](x: Self) {
    
    inline def setCodeDeliveryDetailsList(value: CodeDeliveryDetailsListType): Self = StObject.set(x, "CodeDeliveryDetailsList", value.asInstanceOf[js.Any])
    
    inline def setCodeDeliveryDetailsListUndefined: Self = StObject.set(x, "CodeDeliveryDetailsList", js.undefined)
    
    inline def setCodeDeliveryDetailsListVarargs(value: CodeDeliveryDetailsType*): Self = StObject.set(x, "CodeDeliveryDetailsList", js.Array(value*))
  }
}

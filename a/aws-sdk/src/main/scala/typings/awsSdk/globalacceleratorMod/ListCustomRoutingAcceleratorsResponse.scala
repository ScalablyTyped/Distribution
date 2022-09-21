package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingAcceleratorsResponse extends StObject {
  
  /**
    * The list of custom routing accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[CustomRoutingAccelerators] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingAcceleratorsResponse {
  
  inline def apply(): ListCustomRoutingAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomRoutingAcceleratorsResponse]
  }
  
  extension [Self <: ListCustomRoutingAcceleratorsResponse](x: Self) {
    
    inline def setAccelerators(value: CustomRoutingAccelerators): Self = StObject.set(x, "Accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "Accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: CustomRoutingAccelerator*): Self = StObject.set(x, "Accelerators", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

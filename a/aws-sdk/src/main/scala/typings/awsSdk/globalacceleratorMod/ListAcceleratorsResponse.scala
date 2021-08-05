package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAcceleratorsResponse extends StObject {
  
  /**
    * The list of accelerators for a customer account.
    */
  var Accelerators: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerators] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListAcceleratorsResponse {
  
  inline def apply(): ListAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceleratorsResponse]
  }
  
  extension [Self <: ListAcceleratorsResponse](x: Self) {
    
    inline def setAccelerators(value: Accelerators): Self = StObject.set(x, "Accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "Accelerators", js.undefined)
    
    inline def setAcceleratorsVarargs(value: Accelerator*): Self = StObject.set(x, "Accelerators", js.Array(value :_*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

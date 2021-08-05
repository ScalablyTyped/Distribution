package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListByoipCidrsResponse extends StObject {
  
  /**
    * Information about your address ranges.
    */
  var ByoipCidrs: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidrs] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListByoipCidrsResponse {
  
  inline def apply(): ListByoipCidrsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByoipCidrsResponse]
  }
  
  extension [Self <: ListByoipCidrsResponse](x: Self) {
    
    inline def setByoipCidrs(value: ByoipCidrs): Self = StObject.set(x, "ByoipCidrs", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrsUndefined: Self = StObject.set(x, "ByoipCidrs", js.undefined)
    
    inline def setByoipCidrsVarargs(value: ByoipCidr*): Self = StObject.set(x, "ByoipCidrs", js.Array(value :_*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

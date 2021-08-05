package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListListenersResponse extends StObject {
  
  /**
    * The list of listeners for an accelerator.
    */
  var Listeners: js.UndefOr[typings.awsSdk.globalacceleratorMod.Listeners] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListListenersResponse {
  
  inline def apply(): ListListenersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListListenersResponse]
  }
  
  extension [Self <: ListListenersResponse](x: Self) {
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value :_*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

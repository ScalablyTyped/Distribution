package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDescription extends StObject {
  
  /**
    * The listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.elbMod.Listener] = js.undefined
  
  /**
    * The policies. If there are no policies enabled, the list is empty.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.undefined
}
object ListenerDescription {
  
  inline def apply(): ListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerDescription]
  }
  
  extension [Self <: ListenerDescription](x: Self) {
    
    inline def setListener(value: Listener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
    
    inline def setPolicyNames(value: PolicyNames): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    inline def setPolicyNamesVarargs(value: PolicyName*): Self = StObject.set(x, "PolicyNames", js.Array(value :_*))
  }
}

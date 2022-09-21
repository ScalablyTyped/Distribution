package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListenerOutput extends StObject {
  
  /**
    * Information about the listener.
    */
  var Listeners: js.UndefOr[typings.awsSdk.elbv2Mod.Listeners] = js.undefined
}
object CreateListenerOutput {
  
  inline def apply(): CreateListenerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateListenerOutput]
  }
  
  extension [Self <: CreateListenerOutput](x: Self) {
    
    inline def setListeners(value: Listeners): Self = StObject.set(x, "Listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersUndefined: Self = StObject.set(x, "Listeners", js.undefined)
    
    inline def setListenersVarargs(value: Listener*): Self = StObject.set(x, "Listeners", js.Array(value*))
  }
}

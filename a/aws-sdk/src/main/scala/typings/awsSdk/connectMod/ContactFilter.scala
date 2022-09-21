package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactFilter extends StObject {
  
  /**
    * A list of up to 9 contact states.
    */
  var ContactStates: js.UndefOr[typings.awsSdk.connectMod.ContactStates] = js.undefined
}
object ContactFilter {
  
  inline def apply(): ContactFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFilter]
  }
  
  extension [Self <: ContactFilter](x: Self) {
    
    inline def setContactStates(value: ContactStates): Self = StObject.set(x, "ContactStates", value.asInstanceOf[js.Any])
    
    inline def setContactStatesUndefined: Self = StObject.set(x, "ContactStates", js.undefined)
    
    inline def setContactStatesVarargs(value: ContactState*): Self = StObject.set(x, "ContactStates", js.Array(value*))
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyFleetResult extends StObject {
  
  /**
    * If the request succeeds, the response returns true. If the request fails, no response is returned, and instead an error message is returned.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}
object ModifyFleetResult {
  
  inline def apply(): ModifyFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyFleetResult]
  }
  
  extension [Self <: ModifyFleetResult](x: Self) {
    
    inline def setReturn(value: Boolean): Self = StObject.set(x, "Return", value.asInstanceOf[js.Any])
    
    inline def setReturnUndefined: Self = StObject.set(x, "Return", js.undefined)
  }
}

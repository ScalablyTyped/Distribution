package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckCapacityResponse extends StObject {
  
  /**
    * The capacity required by the rules and scope.
    */
  var Capacity: js.UndefOr[ConsumedCapacity] = js.undefined
}
object CheckCapacityResponse {
  
  inline def apply(): CheckCapacityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckCapacityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckCapacityResponse] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: ConsumedCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
  }
}

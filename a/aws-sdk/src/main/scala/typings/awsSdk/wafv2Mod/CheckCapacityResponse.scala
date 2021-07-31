package typings.awsSdk.wafv2Mod

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
  
  @scala.inline
  def apply(): CheckCapacityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckCapacityResponse]
  }
  
  @scala.inline
  implicit class CheckCapacityResponseMutableBuilder[Self <: CheckCapacityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: ConsumedCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
  }
}

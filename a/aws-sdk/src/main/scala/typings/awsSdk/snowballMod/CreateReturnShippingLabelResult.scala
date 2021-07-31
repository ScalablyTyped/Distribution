package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReturnShippingLabelResult extends StObject {
  
  /**
    * The status information of the task on a Snow device that is being returned to AWS.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.undefined
}
object CreateReturnShippingLabelResult {
  
  @scala.inline
  def apply(): CreateReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReturnShippingLabelResult]
  }
  
  @scala.inline
  implicit class CreateReturnShippingLabelResultMutableBuilder[Self <: CreateReturnShippingLabelResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ShippingLabelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

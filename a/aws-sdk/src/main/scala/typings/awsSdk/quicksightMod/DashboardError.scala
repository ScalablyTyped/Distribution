package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashboardError extends StObject {
  
  /**
    * Message.
    */
  var Message: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Type.
    */
  var Type: js.UndefOr[DashboardErrorType] = js.native
}
object DashboardError {
  
  @scala.inline
  def apply(): DashboardError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardError]
  }
  
  @scala.inline
  implicit class DashboardErrorMutableBuilder[Self <: DashboardError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NonEmptyString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setType(value: DashboardErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

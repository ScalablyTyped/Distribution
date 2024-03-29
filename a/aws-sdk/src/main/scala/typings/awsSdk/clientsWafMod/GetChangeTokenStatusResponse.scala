package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeTokenStatusResponse extends StObject {
  
  /**
    * The status of the change token.
    */
  var ChangeTokenStatus: js.UndefOr[typings.awsSdk.clientsWafMod.ChangeTokenStatus] = js.undefined
}
object GetChangeTokenStatusResponse {
  
  inline def apply(): GetChangeTokenStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChangeTokenStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetChangeTokenStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeTokenStatus(value: ChangeTokenStatus): Self = StObject.set(x, "ChangeTokenStatus", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenStatusUndefined: Self = StObject.set(x, "ChangeTokenStatus", js.undefined)
  }
}

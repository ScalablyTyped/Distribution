package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTargetsResponse extends StObject {
  
  /**
    * The targets that were successfully deregistered.
    */
  var successful: js.UndefOr[TargetList] = js.undefined
  
  /**
    * The targets that the operation couldn't deregister.
    */
  var unsuccessful: js.UndefOr[TargetFailureList] = js.undefined
}
object DeregisterTargetsResponse {
  
  inline def apply(): DeregisterTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTargetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterTargetsResponse] (val x: Self) extends AnyVal {
    
    inline def setSuccessful(value: TargetList): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: Target*): Self = StObject.set(x, "successful", js.Array(value*))
    
    inline def setUnsuccessful(value: TargetFailureList): Self = StObject.set(x, "unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: TargetFailure*): Self = StObject.set(x, "unsuccessful", js.Array(value*))
  }
}

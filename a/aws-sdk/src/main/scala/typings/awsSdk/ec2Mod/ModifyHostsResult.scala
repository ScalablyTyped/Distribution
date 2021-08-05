package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHostsResult extends StObject {
  
  /**
    * The IDs of the Dedicated Hosts that were successfully modified.
    */
  var Successful: js.UndefOr[ResponseHostIdList] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts that could not be modified. Check whether the setting you requested can be used.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemList] = js.undefined
}
object ModifyHostsResult {
  
  inline def apply(): ModifyHostsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyHostsResult]
  }
  
  extension [Self <: ModifyHostsResult](x: Self) {
    
    inline def setSuccessful(value: ResponseHostIdList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: String*): Self = StObject.set(x, "Successful", js.Array(value :_*))
    
    inline def setUnsuccessful(value: UnsuccessfulItemList): Self = StObject.set(x, "Unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "Unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: UnsuccessfulItem*): Self = StObject.set(x, "Unsuccessful", js.Array(value :_*))
  }
}

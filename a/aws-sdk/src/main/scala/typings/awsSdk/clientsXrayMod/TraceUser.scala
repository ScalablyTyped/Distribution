package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceUser extends StObject {
  
  /**
    * Services that the user's request hit.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.clientsXrayMod.ServiceIds] = js.undefined
  
  /**
    * The user's name.
    */
  var UserName: js.UndefOr[String] = js.undefined
}
object TraceUser {
  
  inline def apply(): TraceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceUser] (val x: Self) extends AnyVal {
    
    inline def setServiceIds(value: ServiceIds): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    inline def setServiceIdsUndefined: Self = StObject.set(x, "ServiceIds", js.undefined)
    
    inline def setServiceIdsVarargs(value: ServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value*))
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}

package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentUserResponse extends StObject {
  
  /**
    * Metadata of the user.
    */
  var User: js.UndefOr[typings.awsSdk.clientsWorkdocsMod.User] = js.undefined
}
object GetCurrentUserResponse {
  
  inline def apply(): GetCurrentUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCurrentUserResponse]
  }
  
  extension [Self <: GetCurrentUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}

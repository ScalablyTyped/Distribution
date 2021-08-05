package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateUserResponse extends StObject {
  
  /**
    * The user information.
    */
  var User: js.UndefOr[typings.awsSdk.workdocsMod.User] = js.undefined
}
object ActivateUserResponse {
  
  inline def apply(): ActivateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateUserResponse]
  }
  
  extension [Self <: ActivateUserResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}

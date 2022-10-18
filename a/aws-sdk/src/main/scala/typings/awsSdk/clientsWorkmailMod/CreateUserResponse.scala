package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserResponse extends StObject {
  
  /**
    * The identifier for the new user.
    */
  var UserId: js.UndefOr[WorkMailIdentifier] = js.undefined
}
object CreateUserResponse {
  
  inline def apply(): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserResponse]
  }
  
  extension [Self <: CreateUserResponse](x: Self) {
    
    inline def setUserId(value: WorkMailIdentifier): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}

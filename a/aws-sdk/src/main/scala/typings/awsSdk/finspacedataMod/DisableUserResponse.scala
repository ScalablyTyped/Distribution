package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableUserResponse extends StObject {
  
  /**
    * The unique identifier for the disabled user account.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object DisableUserResponse {
  
  inline def apply(): DisableUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableUserResponse]
  }
  
  extension [Self <: DisableUserResponse](x: Self) {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  
  /**
    * The Amazon Connect user name of the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
}
object UserSummary {
  
  inline def apply(): UserSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSummary]
  }
  
  extension [Self <: UserSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: UserId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setUsername(value: AgentUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}

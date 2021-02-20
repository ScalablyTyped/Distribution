package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSessionResponse extends StObject {
  
  /**
    * The alias in use for the bot associated with the session data.
    */
  var botAlias: js.UndefOr[BotAlias] = js.native
  
  /**
    * The name of the bot associated with the session data.
    */
  var botName: js.UndefOr[BotName] = js.native
  
  /**
    * The unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the client application user.
    */
  var userId: js.UndefOr[UserId] = js.native
}
object DeleteSessionResponse {
  
  @scala.inline
  def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  
  @scala.inline
  implicit class DeleteSessionResponseMutableBuilder[Self <: DeleteSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotAliasUndefined: Self = StObject.set(x, "botAlias", js.undefined)
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

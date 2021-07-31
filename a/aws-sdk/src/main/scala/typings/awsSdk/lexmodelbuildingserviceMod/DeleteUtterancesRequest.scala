package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUtterancesRequest extends StObject {
  
  /**
    * The name of the bot that stored the utterances.
    */
  var botName: BotName
  
  /**
    *  The unique identifier for the user that made the utterances. This is the user ID that was sent in the PostContent or PostText operation request that contained the utterance.
    */
  var userId: UserId
}
object DeleteUtterancesRequest {
  
  @scala.inline
  def apply(botName: BotName, userId: UserId): DeleteUtterancesRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUtterancesRequest]
  }
  
  @scala.inline
  implicit class DeleteUtterancesRequestMutableBuilder[Self <: DeleteUtterancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

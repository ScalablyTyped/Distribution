package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostTextRequest extends StObject {
  
  /**
    * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by including the context in the request, If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you specify an empty list, all contexts for the session are cleared.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.undefined
  
  /**
    * The alias of the Amazon Lex bot.
    */
  var botAlias: BotAlias
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName
  
  /**
    * The text that the user entered (Amazon Lex interprets this text).
    */
  var inputText: Text
  
  /**
    * Request-specific information passed between Amazon Lex and a client application. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:. For more information, see Setting Request Attributes.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * Application-specific information passed between Amazon Lex and a client application. For more information, see Setting Session Attributes.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At runtime, each request must contain the userID field. To decide the user ID to use for your application, consider the following factors.   The userID field must not contain any personally identifiable information of the user, for example, name, personal identification numbers, or other end user personal information.   If you want a user to start a conversation on one device and continue on another device, use a user-specific identifier.   If you want the same user to be able to have two independent conversations on two different devices, choose a device-specific identifier.   A user can't have two independent conversations with two different versions of the same bot. For example, a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will need to have conversation with two different versions, for example, while testing, include the bot alias in the user ID to separate the two conversations.  
    */
  var userId: UserId
}
object PostTextRequest {
  
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, inputText: Text, userId: UserId): PostTextRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostTextRequest]
  }
  
  @scala.inline
  implicit class PostTextRequestMutableBuilder[Self <: PostTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsList): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    @scala.inline
    def setActiveContextsVarargs(value: ActiveContext*): Self = StObject.set(x, "activeContexts", js.Array(value :_*))
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputText(value: Text): Self = StObject.set(x, "inputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributes(value: StringMap): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    @scala.inline
    def setSessionAttributes(value: StringMap): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    
    @scala.inline
    def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

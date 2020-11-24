package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostTextRequest extends js.Object {
  
  /**
    * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by including the context in the request, If you don't specify a list of contexts, Amazon Lex will use the current list of contexts for the session. If you specify an empty list, all contexts for the session are cleared.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.native
  
  /**
    * The alias of the Amazon Lex bot.
    */
  var botAlias: BotAlias = js.native
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  
  /**
    * The text that the user entered (Amazon Lex interprets this text).
    */
  var inputText: Text = js.native
  
  /**
    * Request-specific information passed between Amazon Lex and a client application. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:. For more information, see Setting Request Attributes.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.native
  
  /**
    * Application-specific information passed between Amazon Lex and a client application. For more information, see Setting Session Attributes.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At runtime, each request must contain the userID field. To decide the user ID to use for your application, consider the following factors.   The userID field must not contain any personally identifiable information of the user, for example, name, personal identification numbers, or other end user personal information.   If you want a user to start a conversation on one device and continue on another device, use a user-specific identifier.   If you want the same user to be able to have two independent conversations on two different devices, choose a device-specific identifier.   A user can't have two independent conversations with two different versions of the same bot. For example, a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will need to have conversation with two different versions, for example, while testing, include the bot alias in the user ID to separate the two conversations.  
    */
  var userId: UserId = js.native
}
object PostTextRequest {
  
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, inputText: Text, userId: UserId): PostTextRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostTextRequest]
  }
  
  @scala.inline
  implicit class PostTextRequestOps[Self <: PostTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBotAlias(value: BotAlias): Self = this.set("botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputText(value: Text): Self = this.set("inputText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: UserId): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContextsVarargs(value: ActiveContext*): Self = this.set("activeContexts", js.Array(value :_*))
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsList): Self = this.set("activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveContexts: Self = this.set("activeContexts", js.undefined)
    
    @scala.inline
    def setRequestAttributes(value: StringMap): Self = this.set("requestAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestAttributes: Self = this.set("requestAttributes", js.undefined)
    
    @scala.inline
    def setSessionAttributes(value: StringMap): Self = this.set("sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAttributes: Self = this.set("sessionAttributes", js.undefined)
  }
}

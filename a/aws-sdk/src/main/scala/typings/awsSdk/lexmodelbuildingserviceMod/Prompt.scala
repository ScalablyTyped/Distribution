package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prompt extends js.Object {
  
  /**
    * The number of times to prompt the user for information.
    */
  var maxAttempts: PromptMaxAttempts = js.native
  
  /**
    * An array of objects, each of which provides a message string and its type. You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
    */
  var messages: MessageList = js.native
  
  /**
    * A response card. Amazon Lex uses this prompt at runtime, in the PostText API response. It substitutes session attributes and slot values for placeholders in the response card. For more information, see ex-resp-card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.native
}
object Prompt {
  
  @scala.inline
  def apply(maxAttempts: PromptMaxAttempts, messages: MessageList): Prompt = {
    val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  
  @scala.inline
  implicit class PromptOps[Self <: Prompt] (val x: Self) extends AnyVal {
    
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
    def setMaxAttempts(value: PromptMaxAttempts): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: MessageList): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = this.set("responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCard: Self = this.set("responseCard", js.undefined)
  }
}

package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement extends StObject {
  
  /**
    * A collection of message objects.
    */
  var messages: MessageList
  
  /**
    *  At runtime, if the client is using the PostText API, Amazon Lex includes the response card in the response. It substitutes all of the session attributes and slot values for placeholders in the response card. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.undefined
}
object Statement {
  
  @scala.inline
  def apply(messages: MessageList): Statement = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  
  @scala.inline
  implicit class StatementMutableBuilder[Self <: Statement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: MessageList): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setResponseCard(value: ResponseCard): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
  }
}

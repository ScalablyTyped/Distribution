package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLexBotRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The Amazon Lex box to associate with the instance.
    */
  var LexBot: typings.awsSdk.connectMod.LexBot
}
object AssociateLexBotRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, LexBot: LexBot): AssociateLexBotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LexBot = LexBot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLexBotRequest]
  }
  
  @scala.inline
  implicit class AssociateLexBotRequestMutableBuilder[Self <: AssociateLexBotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexBot(value: LexBot): Self = StObject.set(x, "LexBot", value.asInstanceOf[js.Any])
  }
}

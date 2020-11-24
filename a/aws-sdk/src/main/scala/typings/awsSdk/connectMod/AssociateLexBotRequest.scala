package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateLexBotRequest extends js.Object {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The Amazon Lex box to associate with the instance.
    */
  var LexBot: typings.awsSdk.connectMod.LexBot = js.native
}
object AssociateLexBotRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, LexBot: LexBot): AssociateLexBotRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LexBot = LexBot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateLexBotRequest]
  }
  
  @scala.inline
  implicit class AssociateLexBotRequestOps[Self <: AssociateLexBotRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexBot(value: LexBot): Self = this.set("LexBot", value.asInstanceOf[js.Any])
  }
}

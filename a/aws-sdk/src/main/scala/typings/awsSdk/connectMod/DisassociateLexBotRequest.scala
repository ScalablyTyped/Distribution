package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateLexBotRequest extends js.Object {
  
  /**
    * The name of the Amazon Lex bot. Maximum character limit of 50.
    */
  var BotName: typings.awsSdk.connectMod.BotName = js.native
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The Region in which the Amazon Lex bot has been created.
    */
  var LexRegion: typings.awsSdk.connectMod.LexRegion = js.native
}
object DisassociateLexBotRequest {
  
  @scala.inline
  def apply(BotName: BotName, InstanceId: InstanceId, LexRegion: LexRegion): DisassociateLexBotRequest = {
    val __obj = js.Dynamic.literal(BotName = BotName.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], LexRegion = LexRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLexBotRequest]
  }
  
  @scala.inline
  implicit class DisassociateLexBotRequestOps[Self <: DisassociateLexBotRequest] (val x: Self) extends AnyVal {
    
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
    def setBotName(value: BotName): Self = this.set("BotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexRegion(value: LexRegion): Self = this.set("LexRegion", value.asInstanceOf[js.Any])
  }
}

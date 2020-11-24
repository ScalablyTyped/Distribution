package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexBot extends js.Object {
  
  /**
    * The Region the Amazon Lex bot was created in.
    */
  var LexRegion: js.UndefOr[typings.awsSdk.connectMod.LexRegion] = js.native
  
  /**
    * The name of the Amazon Lex bot.
    */
  var Name: js.UndefOr[BotName] = js.native
}
object LexBot {
  
  @scala.inline
  def apply(): LexBot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexBot]
  }
  
  @scala.inline
  implicit class LexBotOps[Self <: LexBot] (val x: Self) extends AnyVal {
    
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
    def setLexRegion(value: LexRegion): Self = this.set("LexRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexRegion: Self = this.set("LexRegion", js.undefined)
    
    @scala.inline
    def setName(value: BotName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}

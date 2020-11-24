package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotRequest extends js.Object {
  
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName = js.native
  
  /**
    * The version or alias of the bot.
    */
  var versionOrAlias: String = js.native
}
object GetBotRequest {
  
  @scala.inline
  def apply(name: BotName, versionOrAlias: String): GetBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versionOrAlias = versionOrAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotRequest]
  }
  
  @scala.inline
  implicit class GetBotRequestOps[Self <: GetBotRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: BotName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOrAlias(value: String): Self = this.set("versionOrAlias", value.asInstanceOf[js.Any])
  }
}

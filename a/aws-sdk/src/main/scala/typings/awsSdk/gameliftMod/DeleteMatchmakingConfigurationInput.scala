package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMatchmakingConfigurationInput extends js.Object {
  
  /**
    * A unique identifier for a matchmaking configuration. You can use either the configuration name or ARN value.
    */
  var Name: MatchmakingConfigurationName = js.native
}
object DeleteMatchmakingConfigurationInput {
  
  @scala.inline
  def apply(Name: MatchmakingConfigurationName): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
  
  @scala.inline
  implicit class DeleteMatchmakingConfigurationInputOps[Self <: DeleteMatchmakingConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: MatchmakingConfigurationName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}

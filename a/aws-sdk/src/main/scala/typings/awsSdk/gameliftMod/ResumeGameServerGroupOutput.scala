package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResumeGameServerGroupOutput extends js.Object {
  
  /**
    * An object that describes the game server group resource, with the SuspendedActions property updated to reflect the resumed activity.
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.native
}
object ResumeGameServerGroupOutput {
  
  @scala.inline
  def apply(): ResumeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeGameServerGroupOutput]
  }
  
  @scala.inline
  implicit class ResumeGameServerGroupOutputOps[Self <: ResumeGameServerGroupOutput] (val x: Self) extends AnyVal {
    
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
    def setGameServerGroup(value: GameServerGroup): Self = this.set("GameServerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerGroup: Self = this.set("GameServerGroup", js.undefined)
  }
}

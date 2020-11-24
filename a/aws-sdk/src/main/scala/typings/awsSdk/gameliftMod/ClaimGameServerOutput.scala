package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimGameServerOutput extends js.Object {
  
  /**
    * Object that describes the newly claimed game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.gameliftMod.GameServer] = js.native
}
object ClaimGameServerOutput {
  
  @scala.inline
  def apply(): ClaimGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimGameServerOutput]
  }
  
  @scala.inline
  implicit class ClaimGameServerOutputOps[Self <: ClaimGameServerOutput] (val x: Self) extends AnyVal {
    
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
    def setGameServer(value: GameServer): Self = this.set("GameServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServer: Self = this.set("GameServer", js.undefined)
  }
}

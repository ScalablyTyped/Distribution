package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlayerSessionsOutput extends js.Object {
  
  /**
    * A collection of player session objects created for the added players.
    */
  var PlayerSessions: js.UndefOr[PlayerSessionList] = js.native
}
object CreatePlayerSessionsOutput {
  
  @scala.inline
  def apply(): CreatePlayerSessionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionsOutput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionsOutputOps[Self <: CreatePlayerSessionsOutput] (val x: Self) extends AnyVal {
    
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
    def setPlayerSessionsVarargs(value: PlayerSession*): Self = this.set("PlayerSessions", js.Array(value :_*))
    
    @scala.inline
    def setPlayerSessions(value: PlayerSessionList): Self = this.set("PlayerSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessions: Self = this.set("PlayerSessions", js.undefined)
  }
}

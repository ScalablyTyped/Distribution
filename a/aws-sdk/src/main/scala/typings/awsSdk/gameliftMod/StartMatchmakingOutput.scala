package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMatchmakingOutput extends js.Object {
  
  /**
    * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
    */
  var MatchmakingTicket: js.UndefOr[typings.awsSdk.gameliftMod.MatchmakingTicket] = js.native
}
object StartMatchmakingOutput {
  
  @scala.inline
  def apply(): StartMatchmakingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMatchmakingOutput]
  }
  
  @scala.inline
  implicit class StartMatchmakingOutputOps[Self <: StartMatchmakingOutput] (val x: Self) extends AnyVal {
    
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
    def setMatchmakingTicket(value: MatchmakingTicket): Self = this.set("MatchmakingTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchmakingTicket: Self = this.set("MatchmakingTicket", js.undefined)
  }
}

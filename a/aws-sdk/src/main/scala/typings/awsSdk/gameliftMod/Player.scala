package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends js.Object {
  
  /**
    * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS Regions. If this property is present, FlexMatch considers placing the match only in Regions for which latency is reported.  If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If no latency is reported in this scenario, FlexMatch assumes that no Regions are available to the player and the ticket is not matchable. 
    */
  var LatencyInMs: js.UndefOr[LatencyMap] = js.native
  
  /**
    * A collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must match the playerAttributes used in a matchmaking rule set. Example: "PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}.
    */
  var PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.native
  
  /**
    * A unique identifier for a player
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
    */
  var Team: js.UndefOr[NonZeroAndMaxString] = js.native
}
object Player {
  
  @scala.inline
  def apply(): Player = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Player]
  }
  
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    
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
    def setLatencyInMs(value: LatencyMap): Self = this.set("LatencyInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyInMs: Self = this.set("LatencyInMs", js.undefined)
    
    @scala.inline
    def setPlayerAttributes(value: PlayerAttributeMap): Self = this.set("PlayerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerAttributes: Self = this.set("PlayerAttributes", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = this.set("PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerId: Self = this.set("PlayerId", js.undefined)
    
    @scala.inline
    def setTeam(value: NonZeroAndMaxString): Self = this.set("Team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeam: Self = this.set("Team", js.undefined)
  }
}

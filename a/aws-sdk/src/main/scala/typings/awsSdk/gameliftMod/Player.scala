package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Player extends StObject {
  
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
  implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatencyInMs(value: LatencyMap): Self = StObject.set(x, "LatencyInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyInMsUndefined: Self = StObject.set(x, "LatencyInMs", js.undefined)
    
    @scala.inline
    def setPlayerAttributes(value: PlayerAttributeMap): Self = StObject.set(x, "PlayerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerAttributesUndefined: Self = StObject.set(x, "PlayerAttributes", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    @scala.inline
    def setTeam(value: NonZeroAndMaxString): Self = StObject.set(x, "Team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamUndefined: Self = StObject.set(x, "Team", js.undefined)
  }
}

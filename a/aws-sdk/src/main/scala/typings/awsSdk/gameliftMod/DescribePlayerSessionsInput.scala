package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlayerSessionsInput extends StObject {
  
  /**
    * A unique identifier for the game session to retrieve player sessions for.
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.native
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. If a player session ID is specified, this parameter is ignored.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value. If a player session ID is specified, this parameter is ignored.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a player to retrieve player sessions for.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a player session to retrieve.
    */
  var PlayerSessionId: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSessionId] = js.native
  
  /**
    * Player session status to filter results on. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
    */
  var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribePlayerSessionsInput {
  
  @scala.inline
  def apply(): DescribePlayerSessionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlayerSessionsInput]
  }
  
  @scala.inline
  implicit class DescribePlayerSessionsInputMutableBuilder[Self <: DescribePlayerSessionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionId(value: ArnStringModel): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionIdUndefined: Self = StObject.set(x, "GameSessionId", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    @scala.inline
    def setPlayerSessionId(value: PlayerSessionId): Self = StObject.set(x, "PlayerSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionIdUndefined: Self = StObject.set(x, "PlayerSessionId", js.undefined)
    
    @scala.inline
    def setPlayerSessionStatusFilter(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerSessionStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionStatusFilterUndefined: Self = StObject.set(x, "PlayerSessionStatusFilter", js.undefined)
  }
}

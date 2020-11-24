package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlayerSessionsInput extends js.Object {
  
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
  implicit class DescribePlayerSessionsInputOps[Self <: DescribePlayerSessionsInput] (val x: Self) extends AnyVal {
    
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
    def setGameSessionId(value: ArnStringModel): Self = this.set("GameSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionId: Self = this.set("GameSessionId", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPlayerId(value: NonZeroAndMaxString): Self = this.set("PlayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerId: Self = this.set("PlayerId", js.undefined)
    
    @scala.inline
    def setPlayerSessionId(value: PlayerSessionId): Self = this.set("PlayerSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessionId: Self = this.set("PlayerSessionId", js.undefined)
    
    @scala.inline
    def setPlayerSessionStatusFilter(value: NonZeroAndMaxString): Self = this.set("PlayerSessionStatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayerSessionStatusFilter: Self = this.set("PlayerSessionStatusFilter", js.undefined)
  }
}

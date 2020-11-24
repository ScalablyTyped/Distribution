package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionDetailsInput extends js.Object {
  
  /**
    * A unique identifier for an alias associated with the fleet to retrieve all game sessions for. You can use either the alias ID or ARN value.
    */
  var AliasId: js.UndefOr[AliasIdOrArn] = js.native
  
  /**
    * A unique identifier for a fleet to retrieve all game sessions active on the fleet. You can use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[FleetIdOrArn] = js.native
  
  /**
    * A unique identifier for the game session to retrieve. 
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.native
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Game session status to filter results on. Possible game session statuses include ACTIVE, TERMINATED, ACTIVATING and TERMINATING (the last two are transitory). 
    */
  var StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameSessionDetailsInput {
  
  @scala.inline
  def apply(): DescribeGameSessionDetailsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionDetailsInput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionDetailsInputOps[Self <: DescribeGameSessionDetailsInput] (val x: Self) extends AnyVal {
    
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
    def setAliasId(value: AliasIdOrArn): Self = this.set("AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasId: Self = this.set("AliasId", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
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
    def setStatusFilter(value: NonZeroAndMaxString): Self = this.set("StatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusFilter: Self = this.set("StatusFilter", js.undefined)
  }
}

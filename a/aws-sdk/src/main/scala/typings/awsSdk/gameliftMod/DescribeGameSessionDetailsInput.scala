package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionDetailsInput extends StObject {
  
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
  implicit class DescribeGameSessionDetailsInputMutableBuilder[Self <: DescribeGameSessionDetailsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
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
    def setStatusFilter(value: NonZeroAndMaxString): Self = StObject.set(x, "StatusFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusFilterUndefined: Self = StObject.set(x, "StatusFilter", js.undefined)
  }
}

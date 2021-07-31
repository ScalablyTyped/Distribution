package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServerGroupsInput extends StObject {
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential segments.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * A token that indicates the start of the next sequential segment of results. Use the token returned with the previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListGameServerGroupsInput {
  
  @scala.inline
  def apply(): ListGameServerGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerGroupsInput]
  }
  
  @scala.inline
  implicit class ListGameServerGroupsInputMutableBuilder[Self <: ListGameServerGroupsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

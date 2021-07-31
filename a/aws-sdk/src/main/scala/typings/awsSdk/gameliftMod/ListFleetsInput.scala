package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFleetsInput extends StObject {
  
  /**
    * A unique identifier for a build to return fleets for. Use this parameter to return only fleets using a specified build. Use either the build ID or ARN value. To retrieve all fleets, do not include either a BuildId and ScriptID parameter.
    */
  var BuildId: js.UndefOr[BuildIdOrArn] = js.undefined
  
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this operation. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a Realtime script to return fleets for. Use this parameter to return only fleets using a specified script. Use either the script ID or ARN value. To retrieve all fleets, leave this parameter empty.
    */
  var ScriptId: js.UndefOr[ScriptIdOrArn] = js.undefined
}
object ListFleetsInput {
  
  @scala.inline
  def apply(): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFleetsInput]
  }
  
  @scala.inline
  implicit class ListFleetsInputMutableBuilder[Self <: ListFleetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildIdUndefined: Self = StObject.set(x, "BuildId", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptIdOrArn): Self = StObject.set(x, "ScriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptIdUndefined: Self = StObject.set(x, "ScriptId", js.undefined)
  }
}

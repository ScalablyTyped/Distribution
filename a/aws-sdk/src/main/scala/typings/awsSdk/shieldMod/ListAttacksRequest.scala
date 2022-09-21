package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttacksRequest extends StObject {
  
  /**
    * The end of the time period for the attacks. This is a timestamp type. The request syntax listing for this call indicates a number type, but you can provide the time in any valid timestamp format setting. 
    */
  var EndTime: js.UndefOr[TimeRange] = js.undefined
  
  /**
    * The greatest number of objects that you want Shield Advanced to return to the list request. Shield Advanced might return fewer objects than you indicate in this setting, even if more objects are available. If there are more objects remaining, Shield Advanced will always also return a NextToken value in the response. The default setting is 20.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.undefined
  
  /**
    * When you request a list of objects from Shield Advanced, if the response does not include all of the remaining available objects, Shield Advanced includes a NextToken value in the response. You can retrieve the next batch of objects by requesting the list again and providing the token that was returned by the prior call in your request.  You can indicate the maximum number of objects that you want Shield Advanced to return for a single call with the MaxResults setting. Shield Advanced will not return more than MaxResults objects, but may return fewer, even if more objects are still available. Whenever more objects remain that Shield Advanced has not yet returned to you, the response will include a NextToken value. On your first call to a list operation, leave this setting empty.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ARNs (Amazon Resource Names) of the resources that were attacked. If you leave this blank, all applicable resources for this account will be included.
    */
  var ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined
  
  /**
    * The start of the time period for the attacks. This is a timestamp type. The request syntax listing for this call indicates a number type, but you can provide the time in any valid timestamp format setting. 
    */
  var StartTime: js.UndefOr[TimeRange] = js.undefined
}
object ListAttacksRequest {
  
  inline def apply(): ListAttacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksRequest]
  }
  
  extension [Self <: ListAttacksRequest](x: Self) {
    
    inline def setEndTime(value: TimeRange): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceArns(value: ResourceArnFilterList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setStartTime(value: TimeRange): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}

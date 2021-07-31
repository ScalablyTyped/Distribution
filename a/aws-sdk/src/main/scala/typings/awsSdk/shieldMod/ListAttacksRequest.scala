package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttacksRequest extends StObject {
  
  /**
    * The end of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var EndTime: js.UndefOr[TimeRange] = js.undefined
  
  /**
    * The maximum number of AttackSummary objects to return. If you leave this blank, Shield Advanced returns the first 20 results. This is a maximum value. Shield Advanced might return the results in smaller batches. That is, the number of objects returned could be less than MaxResults, even if there are still more objects yet to return. If there are more objects to return, Shield Advanced returns a value in NextToken that you can use in your next request, to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.shieldMod.MaxResults] = js.undefined
  
  /**
    * The ListAttacksRequest.NextMarker value from a previous call to ListAttacksRequest. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked. If this is left blank, all applicable resources for this account will be included.
    */
  var ResourceArns: js.UndefOr[ResourceArnFilterList] = js.undefined
  
  /**
    * The start of the time period for the attacks. This is a timestamp type. The sample request above indicates a number type because the default used by WAF is Unix time in seconds. However any valid timestamp format is allowed. 
    */
  var StartTime: js.UndefOr[TimeRange] = js.undefined
}
object ListAttacksRequest {
  
  @scala.inline
  def apply(): ListAttacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAttacksRequest]
  }
  
  @scala.inline
  implicit class ListAttacksRequestMutableBuilder[Self <: ListAttacksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: TimeRange): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceArns(value: ResourceArnFilterList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    @scala.inline
    def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value :_*))
    
    @scala.inline
    def setStartTime(value: TimeRange): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}

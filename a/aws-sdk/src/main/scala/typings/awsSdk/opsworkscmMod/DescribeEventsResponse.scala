package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsResponse extends StObject {
  
  /**
    * NextToken is a string that is returned in some command responses. It indicates that not all entries have been returned, and that you must run at least one more request to get remaining items. To get remaining results, call DescribeEvents again, and assign the token from the previous results as the value of the nextToken parameter. If there are no more results, the response object's nextToken parameter value is null. Setting a nextToken value that was not returned in your previous results causes an InvalidNextTokenException to occur. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the response to a DescribeEvents request. 
    */
  var ServerEvents: js.UndefOr[typings.awsSdk.opsworkscmMod.ServerEvents] = js.undefined
}
object DescribeEventsResponse {
  
  inline def apply(): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsResponse]
  }
  
  extension [Self <: DescribeEventsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServerEvents(value: ServerEvents): Self = StObject.set(x, "ServerEvents", value.asInstanceOf[js.Any])
    
    inline def setServerEventsUndefined: Self = StObject.set(x, "ServerEvents", js.undefined)
    
    inline def setServerEventsVarargs(value: ServerEvent*): Self = StObject.set(x, "ServerEvents", js.Array(value :_*))
  }
}

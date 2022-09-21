package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventAggregatesResponse extends StObject {
  
  /**
    * The number of events in each category that meet the optional filter criteria.
    */
  var eventAggregates: js.UndefOr[EventAggregateList] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
}
object DescribeEventAggregatesResponse {
  
  inline def apply(): DescribeEventAggregatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventAggregatesResponse]
  }
  
  extension [Self <: DescribeEventAggregatesResponse](x: Self) {
    
    inline def setEventAggregates(value: EventAggregateList): Self = StObject.set(x, "eventAggregates", value.asInstanceOf[js.Any])
    
    inline def setEventAggregatesUndefined: Self = StObject.set(x, "eventAggregates", js.undefined)
    
    inline def setEventAggregatesVarargs(value: EventAggregate*): Self = StObject.set(x, "eventAggregates", js.Array(value*))
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

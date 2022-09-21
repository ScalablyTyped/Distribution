package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOptedOutNumbersRequest extends StObject {
  
  /**
    * An array of OptedOutFilter objects to filter the results on.
    */
  var Filters: js.UndefOr[OptedOutFilterList] = js.undefined
  
  /**
    * The maximum number of results to return per each request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results. You don't need to supply a value for this field in the initial request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * The OptOutListName or OptOutListArn of the OptOutList. You can use DescribeOptOutLists to find the values for OptOutListName and OptOutListArn.
    */
  var OptOutListName: OptOutListNameOrArn
  
  /**
    * An array of phone numbers to search for in the OptOutList.
    */
  var OptedOutNumbers: js.UndefOr[OptedOutNumberList] = js.undefined
}
object DescribeOptedOutNumbersRequest {
  
  inline def apply(OptOutListName: OptOutListNameOrArn): DescribeOptedOutNumbersRequest = {
    val __obj = js.Dynamic.literal(OptOutListName = OptOutListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOptedOutNumbersRequest]
  }
  
  extension [Self <: DescribeOptedOutNumbersRequest](x: Self) {
    
    inline def setFilters(value: OptedOutFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: OptedOutFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumbers(value: OptedOutNumberList): Self = StObject.set(x, "OptedOutNumbers", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumbersUndefined: Self = StObject.set(x, "OptedOutNumbers", js.undefined)
    
    inline def setOptedOutNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "OptedOutNumbers", js.Array(value*))
  }
}

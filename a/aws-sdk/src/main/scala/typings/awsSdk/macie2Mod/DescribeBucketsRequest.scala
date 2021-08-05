package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBucketsRequest extends StObject {
  
  /**
    * The criteria to use to filter the query results.
    */
  var criteria: js.UndefOr[BucketCriteria] = js.undefined
  
  /**
    * The maximum number of items to include in each page of the response. The default value is 50.
    */
  var maxResults: js.UndefOr[integer] = js.undefined
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The criteria to use to sort the query results.
    */
  var sortCriteria: js.UndefOr[BucketSortCriteria] = js.undefined
}
object DescribeBucketsRequest {
  
  inline def apply(): DescribeBucketsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBucketsRequest]
  }
  
  extension [Self <: DescribeBucketsRequest](x: Self) {
    
    inline def setCriteria(value: BucketCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortCriteria(value: BucketSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}

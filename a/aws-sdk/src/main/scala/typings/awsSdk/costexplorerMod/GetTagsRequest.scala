package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTagsRequest extends StObject {
  
  /**
    * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The value that you want to search for.
    */
  var SearchString: js.UndefOr[typings.awsSdk.costexplorerMod.SearchString] = js.undefined
  
  /**
    * The key of the tag that you want to return values for.
    */
  var TagKey: js.UndefOr[typings.awsSdk.costexplorerMod.TagKey] = js.undefined
  
  /**
    * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is exclusive. For example, if start is 2017-01-01 and end is 2017-05-01, then the cost and usage data is retrieved from 2017-01-01 up to and including 2017-04-30 but not including 2017-05-01.
    */
  var TimePeriod: DateInterval
}
object GetTagsRequest {
  
  inline def apply(TimePeriod: DateInterval): GetTagsRequest = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  
  extension [Self <: GetTagsRequest](x: Self) {
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setSearchString(value: SearchString): Self = StObject.set(x, "SearchString", value.asInstanceOf[js.Any])
    
    inline def setSearchStringUndefined: Self = StObject.set(x, "SearchString", js.undefined)
    
    inline def setTagKey(value: TagKey): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
    
    inline def setTagKeyUndefined: Self = StObject.set(x, "TagKey", js.undefined)
    
    inline def setTimePeriod(value: DateInterval): Self = StObject.set(x, "TimePeriod", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDestinationsRequest extends StObject {
  
  /**
    * The prefix to match. If you don't specify a value, no prefix filter is applied.
    */
  var DestinationNamePrefix: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeDestinationsRequest {
  
  @scala.inline
  def apply(): DescribeDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDestinationsRequest]
  }
  
  @scala.inline
  implicit class DescribeDestinationsRequestMutableBuilder[Self <: DescribeDestinationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationNamePrefix(value: DestinationName): Self = StObject.set(x, "DestinationNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNamePrefixUndefined: Self = StObject.set(x, "DestinationNamePrefix", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

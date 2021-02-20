package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedElasticsearchInstancesRequest extends StObject {
  
  /**
    * Set this value to limit the number of results returned. If not specified, defaults to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
  
  /**
    * The reserved instance identifier filter value. Use this parameter to show only the reservation that matches the specified reserved Elasticsearch instance ID.
    */
  var ReservedElasticsearchInstanceId: js.UndefOr[GUID] = js.native
}
object DescribeReservedElasticsearchInstancesRequest {
  
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesRequest]
  }
  
  @scala.inline
  implicit class DescribeReservedElasticsearchInstancesRequestMutableBuilder[Self <: DescribeReservedElasticsearchInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceId(value: GUID): Self = StObject.set(x, "ReservedElasticsearchInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstanceIdUndefined: Self = StObject.set(x, "ReservedElasticsearchInstanceId", js.undefined)
  }
}

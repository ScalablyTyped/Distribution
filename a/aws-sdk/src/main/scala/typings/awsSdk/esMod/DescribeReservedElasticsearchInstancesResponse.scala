package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedElasticsearchInstancesResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.native
}
object DescribeReservedElasticsearchInstancesResponse {
  
  @scala.inline
  def apply(): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
  
  @scala.inline
  implicit class DescribeReservedElasticsearchInstancesResponseMutableBuilder[Self <: DescribeReservedElasticsearchInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstances(value: ReservedElasticsearchInstanceList): Self = StObject.set(x, "ReservedElasticsearchInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedElasticsearchInstancesUndefined: Self = StObject.set(x, "ReservedElasticsearchInstances", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstancesVarargs(value: ReservedElasticsearchInstance*): Self = StObject.set(x, "ReservedElasticsearchInstances", js.Array(value :_*))
  }
}

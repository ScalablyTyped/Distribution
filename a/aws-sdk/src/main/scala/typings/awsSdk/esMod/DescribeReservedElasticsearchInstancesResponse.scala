package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReservedElasticsearchInstancesResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of reserved Elasticsearch instances.
    */
  var ReservedElasticsearchInstances: js.UndefOr[ReservedElasticsearchInstanceList] = js.undefined
}
object DescribeReservedElasticsearchInstancesResponse {
  
  inline def apply(): DescribeReservedElasticsearchInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedElasticsearchInstancesResponse]
  }
  
  extension [Self <: DescribeReservedElasticsearchInstancesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReservedElasticsearchInstances(value: ReservedElasticsearchInstanceList): Self = StObject.set(x, "ReservedElasticsearchInstances", value.asInstanceOf[js.Any])
    
    inline def setReservedElasticsearchInstancesUndefined: Self = StObject.set(x, "ReservedElasticsearchInstances", js.undefined)
    
    inline def setReservedElasticsearchInstancesVarargs(value: ReservedElasticsearchInstance*): Self = StObject.set(x, "ReservedElasticsearchInstances", js.Array(value*))
  }
}

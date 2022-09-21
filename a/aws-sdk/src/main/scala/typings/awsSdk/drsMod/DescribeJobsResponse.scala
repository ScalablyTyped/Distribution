package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobsResponse extends StObject {
  
  /**
    * An array of Jobs.
    */
  var items: js.UndefOr[JobsList] = js.undefined
  
  /**
    * The token of the next Job to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeJobsResponse {
  
  inline def apply(): DescribeJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobsResponse]
  }
  
  extension [Self <: DescribeJobsResponse](x: Self) {
    
    inline def setItems(value: JobsList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Job*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobLogItemsResponse extends StObject {
  
  /**
    * An array of Job log items.
    */
  var items: js.UndefOr[JobLogs] = js.undefined
  
  /**
    * The token of the next Job log items to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeJobLogItemsResponse {
  
  inline def apply(): DescribeJobLogItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobLogItemsResponse]
  }
  
  extension [Self <: DescribeJobLogItemsResponse](x: Self) {
    
    inline def setItems(value: JobLogs): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: JobLog*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

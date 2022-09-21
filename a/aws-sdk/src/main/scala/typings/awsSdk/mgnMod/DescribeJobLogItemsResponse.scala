package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobLogItemsResponse extends StObject {
  
  /**
    * Request to describe Job log response items.
    */
  var items: js.UndefOr[JobLogs] = js.undefined
  
  /**
    * Request to describe Job log response next token.
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

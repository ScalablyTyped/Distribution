package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoveryInstancesResponse extends StObject {
  
  /**
    * An array of Recovery Instances.
    */
  var items: js.UndefOr[DescribeRecoveryInstancesItems] = js.undefined
  
  /**
    * The token of the next Recovery Instance to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeRecoveryInstancesResponse {
  
  inline def apply(): DescribeRecoveryInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRecoveryInstancesResponse]
  }
  
  extension [Self <: DescribeRecoveryInstancesResponse](x: Self) {
    
    inline def setItems(value: DescribeRecoveryInstancesItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RecoveryInstance*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

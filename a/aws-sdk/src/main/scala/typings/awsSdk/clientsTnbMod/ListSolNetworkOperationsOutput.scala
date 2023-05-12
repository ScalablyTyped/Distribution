package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolNetworkOperationsOutput extends StObject {
  
  /**
    * Lists network operation occurrences. Lifecycle management operations are deploy, update, or delete operations.
    */
  var networkOperations: js.UndefOr[ListSolNetworkOperationsResources] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSolNetworkOperationsOutput {
  
  inline def apply(): ListSolNetworkOperationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolNetworkOperationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolNetworkOperationsOutput] (val x: Self) extends AnyVal {
    
    inline def setNetworkOperations(value: ListSolNetworkOperationsResources): Self = StObject.set(x, "networkOperations", value.asInstanceOf[js.Any])
    
    inline def setNetworkOperationsUndefined: Self = StObject.set(x, "networkOperations", js.undefined)
    
    inline def setNetworkOperationsVarargs(value: ListSolNetworkOperationsInfo*): Self = StObject.set(x, "networkOperations", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

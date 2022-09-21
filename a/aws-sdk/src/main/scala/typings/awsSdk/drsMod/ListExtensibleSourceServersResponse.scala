package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExtensibleSourceServersResponse extends StObject {
  
  /**
    * A list of source servers on a staging Account that are extensible.
    */
  var items: js.UndefOr[StagingSourceServersList] = js.undefined
  
  /**
    * The token of the next extensible source server to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExtensibleSourceServersResponse {
  
  inline def apply(): ListExtensibleSourceServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExtensibleSourceServersResponse]
  }
  
  extension [Self <: ListExtensibleSourceServersResponse](x: Self) {
    
    inline def setItems(value: StagingSourceServersList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: StagingSourceServer*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}

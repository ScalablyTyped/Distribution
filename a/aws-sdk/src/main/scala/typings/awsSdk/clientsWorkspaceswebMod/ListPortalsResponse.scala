package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPortalsResponse extends StObject {
  
  /**
    * The pagination token used to retrieve the next page of results for this operation. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The portals in the list.
    */
  var portals: js.UndefOr[PortalList] = js.undefined
}
object ListPortalsResponse {
  
  inline def apply(): ListPortalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortalsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPortalsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPortals(value: PortalList): Self = StObject.set(x, "portals", value.asInstanceOf[js.Any])
    
    inline def setPortalsUndefined: Self = StObject.set(x, "portals", js.undefined)
    
    inline def setPortalsVarargs(value: PortalSummary*): Self = StObject.set(x, "portals", js.Array(value*))
  }
}

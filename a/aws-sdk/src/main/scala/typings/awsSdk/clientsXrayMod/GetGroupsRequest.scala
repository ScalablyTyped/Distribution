package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupsRequest extends StObject {
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined
}
object GetGroupsRequest {
  
  inline def apply(): GetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: GetGroupsNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

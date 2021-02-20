package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLunaClientsRequest extends StObject {
  
  /**
    * The NextToken value from a previous call to ListLunaClients. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListLunaClientsRequest {
  
  @scala.inline
  def apply(): ListLunaClientsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLunaClientsRequest]
  }
  
  @scala.inline
  implicit class ListLunaClientsRequestMutableBuilder[Self <: ListLunaClientsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

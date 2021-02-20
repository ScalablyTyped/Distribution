package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateServiceRoleFromAccountResponse extends StObject {
  
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[string] = js.native
}
object DisassociateServiceRoleFromAccountResponse {
  
  @scala.inline
  def apply(): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
  
  @scala.inline
  implicit class DisassociateServiceRoleFromAccountResponseMutableBuilder[Self <: DisassociateServiceRoleFromAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisassociatedAt(value: string): Self = StObject.set(x, "DisassociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisassociatedAtUndefined: Self = StObject.set(x, "DisassociatedAt", js.undefined)
  }
}

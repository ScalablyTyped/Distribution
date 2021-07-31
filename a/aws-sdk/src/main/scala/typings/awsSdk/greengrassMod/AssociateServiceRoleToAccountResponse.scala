package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateServiceRoleToAccountResponse extends StObject {
  
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[string] = js.undefined
}
object AssociateServiceRoleToAccountResponse {
  
  @scala.inline
  def apply(): AssociateServiceRoleToAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
  }
  
  @scala.inline
  implicit class AssociateServiceRoleToAccountResponseMutableBuilder[Self <: AssociateServiceRoleToAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedAt(value: string): Self = StObject.set(x, "AssociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedAtUndefined: Self = StObject.set(x, "AssociatedAt", js.undefined)
  }
}

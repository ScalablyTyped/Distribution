package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAttributesMessage extends StObject {
  
  /**
    * A list of AccountQuota objects. Within this list, each quota has a name, a count of usage toward the quota maximum, and a maximum value for the quota.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.native
}
object AccountAttributesMessage {
  
  @scala.inline
  def apply(): AccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributesMessage]
  }
  
  @scala.inline
  implicit class AccountAttributesMessageMutableBuilder[Self <: AccountAttributesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountQuotas(value: AccountQuotaList): Self = StObject.set(x, "AccountQuotas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountQuotasUndefined: Self = StObject.set(x, "AccountQuotas", js.undefined)
    
    @scala.inline
    def setAccountQuotasVarargs(value: AccountQuota*): Self = StObject.set(x, "AccountQuotas", js.Array(value :_*))
  }
}

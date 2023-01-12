package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualStudioCodeCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions {
  
  /**
    * Optionally pass in a Tenant ID to be used as part of the credential
    */
  var tenantId: js.UndefOr[String] = js.undefined
}
object VisualStudioCodeCredentialOptions {
  
  inline def apply(): VisualStudioCodeCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualStudioCodeCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualStudioCodeCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}

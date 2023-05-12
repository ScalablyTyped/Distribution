package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AzureDeveloperCliCredential")
@js.native
/**
  * Creates an instance of the {@link AzureDeveloperCliCredential}.
  *
  * To use this credential, ensure that you have already logged
  * in via the 'azd' tool using the command "azd auth login" from the commandline.
  *
  * @param options - Options, to optionally allow multi-tenant requests.
  */
open class AzureDeveloperCliCredential ()
  extends StObject
     with TokenCredential {
  def this(options: AzureDeveloperCliCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var tenantId: Any = js.native
  
  /* private */ var timeout: Any = js.native
}

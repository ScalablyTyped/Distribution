package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AzureCliCredential")
@js.native
/**
  * Creates an instance of the {@link AzureCliCredential}.
  *
  * To use this credential, ensure that you have already logged
  * in via the 'az' tool using the command "az login" from the commandline.
  *
  * @param options - Options, to optionally allow multi-tenant requests.
  */
open class AzureCliCredential ()
  extends StObject
     with TokenCredential {
  def this(options: AzureCliCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}

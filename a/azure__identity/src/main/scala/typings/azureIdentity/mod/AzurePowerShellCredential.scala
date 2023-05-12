package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AzurePowerShellCredential")
@js.native
/**
  * Creates an instance of the {@link AzurePowerShellCredential}.
  *
  * To use this credential:
  * - Install the Azure Az PowerShell module with:
  *   `Install-Module -Name Az -Scope CurrentUser -Repository PSGallery -Force`.
  * - You have already logged in to Azure PowerShell using the command
  * `Connect-AzAccount` from the command line.
  *
  * @param options - Options, to optionally allow multi-tenant requests.
  */
open class AzurePowerShellCredential ()
  extends StObject
     with TokenCredential {
  def this(options: AzurePowerShellCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /**
    * Gets the access token from Azure PowerShell
    * @param resource - The resource to use when getting the token
    */
  /* private */ var getAzurePowerShellAccessToken: Any = js.native
  
  /* private */ var tenantId: Any = js.native
  
  /* private */ var timeout: Any = js.native
}

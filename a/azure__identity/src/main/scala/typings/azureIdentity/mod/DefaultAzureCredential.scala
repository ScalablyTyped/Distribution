package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "DefaultAzureCredential")
@js.native
/**
  * Creates an instance of the DefaultAzureCredential class with {@link DefaultAzureCredentialClientIdOptions}
  *
  * This credential provides a default {@link ChainedTokenCredential} configuration that should
  * work for most applications that use the Azure SDK.
  *
  * The following credential types will be tried, in order:
  *
  * - {@link EnvironmentCredential}
  * - {@link WorkloadIdentityCredential}
  * - {@link ManagedIdentityCredential}
  * - {@link AzureDeveloperCliCredential}
  * - {@link AzureCliCredential}
  * - {@link AzurePowerShellCredential}
  *
  * Consult the documentation of these credential types for more information
  * on how they attempt authentication.
  *
  * @param options - Optional parameters. See {@link DefaultAzureCredentialClientIdOptions}.
  */
open class DefaultAzureCredential () extends ChainedTokenCredential {
  def this(options: DefaultAzureCredentialClientIdOptions) = this()
  def this(options: DefaultAzureCredentialOptions) = this()
  def this(options: DefaultAzureCredentialResourceIdOptions) = this()
}

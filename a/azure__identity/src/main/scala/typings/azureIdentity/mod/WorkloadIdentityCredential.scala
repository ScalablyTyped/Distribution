package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "WorkloadIdentityCredential")
@js.native
open class WorkloadIdentityCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * WorkloadIdentityCredential supports Azure workload identity on Kubernetes.
    *
    * @param options - The identity client options to use for authentication.
    */
  def this(options: WorkloadIdentityCredentialOptions) = this()
  
  /* private */ var azureFederatedTokenFileContent: Any = js.native
  
  /* private */ var cacheDate: Any = js.native
  
  /* private */ var client: Any = js.native
  
  /* private */ var federatedTokenFilePath: Any = js.native
  
  /* private */ var readFileContents: Any = js.native
}

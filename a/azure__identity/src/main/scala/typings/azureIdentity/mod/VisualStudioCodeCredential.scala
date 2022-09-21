package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "VisualStudioCodeCredential")
@js.native
/**
  * Creates an instance of VisualStudioCodeCredential to use for automatically authenticating via VSCode.
  *
  * **Note**: `VisualStudioCodeCredential` is provided by a plugin package:
  * `@azure/identity-vscode`. If this package is not installed and registered
  * using the plugin API (`useIdentityPlugin`), then authentication using
  * `VisualStudioCodeCredential` will not be available.
  *
  * @param options - Options for configuring the client which makes the authentication request.
  */
open class VisualStudioCodeCredential ()
  extends StObject
     with TokenCredential {
  def this(options: VisualStudioCodeCredentialOptions) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var cloudName: Any = js.native
  
  /* private */ var identityClient: Any = js.native
  
  /**
    * Runs preparations for any further getToken request.
    */
  /* private */ var prepare: Any = js.native
  
  /**
    * Runs preparations for any further getToken, but only once.
    */
  /* private */ var prepareOnce: Any = js.native
  
  /**
    * The promise of the single preparation that will be executed at the first getToken request for an instance of this class.
    */
  /* private */ var preparePromise: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}

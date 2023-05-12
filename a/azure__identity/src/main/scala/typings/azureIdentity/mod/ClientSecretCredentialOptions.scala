package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSecretCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions
     with CredentialPersistenceOptions
     with AuthorityValidationOptions
object ClientSecretCredentialOptions {
  
  inline def apply(): ClientSecretCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSecretCredentialOptions]
  }
}

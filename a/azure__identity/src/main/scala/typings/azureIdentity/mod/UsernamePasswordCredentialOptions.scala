package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernamePasswordCredentialOptions
  extends StObject
     with MultiTenantTokenCredentialOptions
     with CredentialPersistenceOptions
     with AuthorityValidationOptions
object UsernamePasswordCredentialOptions {
  
  inline def apply(): UsernamePasswordCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsernamePasswordCredentialOptions]
  }
}

package typings.azureKeyvaultKeys.mod

import typings.azureCoreHttpCompat.mod.ExtendedCommonClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyClientOptions
  extends StObject
     with ExtendedCommonClientOptions {
  
  /**
    * Whether to disable verification that the authentication challenge resource matches the Key Vault or Managed HSM domain.
    * Defaults to false.
    */
  var disableChallengeResourceVerification: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the KeyVault's service API to make calls against.
    */
  var serviceVersion: js.UndefOr[String] = js.undefined
}
object KeyClientOptions {
  
  inline def apply(): KeyClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyClientOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableChallengeResourceVerification(value: Boolean): Self = StObject.set(x, "disableChallengeResourceVerification", value.asInstanceOf[js.Any])
    
    inline def setDisableChallengeResourceVerificationUndefined: Self = StObject.set(x, "disableChallengeResourceVerification", js.undefined)
    
    inline def setServiceVersion(value: String): Self = StObject.set(x, "serviceVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionUndefined: Self = StObject.set(x, "serviceVersion", js.undefined)
  }
}

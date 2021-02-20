package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSecurityOptions extends StObject {
  
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Describes the SAML application configured for a domain.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsOutput] = js.native
}
object AdvancedSecurityOptions {
  
  @scala.inline
  def apply(): AdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptions]
  }
  
  @scala.inline
  implicit class AdvancedSecurityOptionsMutableBuilder[Self <: AdvancedSecurityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "InternalUserDatabaseEnabled", js.undefined)
    
    @scala.inline
    def setSAMLOptions(value: SAMLOptionsOutput): Self = StObject.set(x, "SAMLOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMLOptionsUndefined: Self = StObject.set(x, "SAMLOptions", js.undefined)
  }
}

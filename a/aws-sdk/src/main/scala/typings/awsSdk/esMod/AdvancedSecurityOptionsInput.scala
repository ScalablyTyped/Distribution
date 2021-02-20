package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedSecurityOptionsInput extends StObject {
  
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  var MasterUserOptions: js.UndefOr[typings.awsSdk.esMod.MasterUserOptions] = js.native
  
  /**
    * Specifies the SAML application configuration for the domain.
    */
  var SAMLOptions: js.UndefOr[SAMLOptionsInput] = js.native
}
object AdvancedSecurityOptionsInput {
  
  @scala.inline
  def apply(): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
  
  @scala.inline
  implicit class AdvancedSecurityOptionsInputMutableBuilder[Self <: AdvancedSecurityOptionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "InternalUserDatabaseEnabled", js.undefined)
    
    @scala.inline
    def setMasterUserOptions(value: MasterUserOptions): Self = StObject.set(x, "MasterUserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserOptionsUndefined: Self = StObject.set(x, "MasterUserOptions", js.undefined)
    
    @scala.inline
    def setSAMLOptions(value: SAMLOptionsInput): Self = StObject.set(x, "SAMLOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAMLOptionsUndefined: Self = StObject.set(x, "SAMLOptions", js.undefined)
  }
}

package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoftwareTokenMfaSettingsType extends StObject {
  
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  
  /**
    * Specifies whether software token MFA is the preferred MFA method.
    */
  var PreferredMfa: js.UndefOr[BooleanType] = js.native
}
object SoftwareTokenMfaSettingsType {
  
  @scala.inline
  def apply(): SoftwareTokenMfaSettingsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareTokenMfaSettingsType]
  }
  
  @scala.inline
  implicit class SoftwareTokenMfaSettingsTypeMutableBuilder[Self <: SoftwareTokenMfaSettingsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    @scala.inline
    def setPreferredMfa(value: BooleanType): Self = StObject.set(x, "PreferredMfa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMfaUndefined: Self = StObject.set(x, "PreferredMfa", js.undefined)
  }
}

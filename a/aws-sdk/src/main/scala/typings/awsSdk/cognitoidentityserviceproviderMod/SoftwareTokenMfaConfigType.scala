package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareTokenMfaConfigType extends StObject {
  
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
}
object SoftwareTokenMfaConfigType {
  
  @scala.inline
  def apply(): SoftwareTokenMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareTokenMfaConfigType]
  }
  
  @scala.inline
  implicit class SoftwareTokenMfaConfigTypeMutableBuilder[Self <: SoftwareTokenMfaConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}

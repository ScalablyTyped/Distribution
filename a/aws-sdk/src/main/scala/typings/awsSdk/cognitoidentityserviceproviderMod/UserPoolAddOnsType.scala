package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolAddOnsType extends StObject {
  
  /**
    * The advanced security mode.
    */
  var AdvancedSecurityMode: AdvancedSecurityModeType
}
object UserPoolAddOnsType {
  
  @scala.inline
  def apply(AdvancedSecurityMode: AdvancedSecurityModeType): UserPoolAddOnsType = {
    val __obj = js.Dynamic.literal(AdvancedSecurityMode = AdvancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAddOnsType]
  }
  
  @scala.inline
  implicit class UserPoolAddOnsTypeMutableBuilder[Self <: UserPoolAddOnsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedSecurityMode(value: AdvancedSecurityModeType): Self = StObject.set(x, "AdvancedSecurityMode", value.asInstanceOf[js.Any])
  }
}

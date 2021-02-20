package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRecoverySettingType extends StObject {
  
  /**
    * The list of RecoveryOptionTypes.
    */
  var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.native
}
object AccountRecoverySettingType {
  
  @scala.inline
  def apply(): AccountRecoverySettingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRecoverySettingType]
  }
  
  @scala.inline
  implicit class AccountRecoverySettingTypeMutableBuilder[Self <: AccountRecoverySettingType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecoveryMechanisms(value: RecoveryMechanismsType): Self = StObject.set(x, "RecoveryMechanisms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecoveryMechanismsUndefined: Self = StObject.set(x, "RecoveryMechanisms", js.undefined)
    
    @scala.inline
    def setRecoveryMechanismsVarargs(value: RecoveryOptionType*): Self = StObject.set(x, "RecoveryMechanisms", js.Array(value :_*))
  }
}

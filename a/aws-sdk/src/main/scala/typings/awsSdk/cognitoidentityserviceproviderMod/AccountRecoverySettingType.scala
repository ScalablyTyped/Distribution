package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRecoverySettingType extends StObject {
  
  /**
    * The list of RecoveryOptionTypes.
    */
  var RecoveryMechanisms: js.UndefOr[RecoveryMechanismsType] = js.undefined
}
object AccountRecoverySettingType {
  
  inline def apply(): AccountRecoverySettingType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRecoverySettingType]
  }
  
  extension [Self <: AccountRecoverySettingType](x: Self) {
    
    inline def setRecoveryMechanisms(value: RecoveryMechanismsType): Self = StObject.set(x, "RecoveryMechanisms", value.asInstanceOf[js.Any])
    
    inline def setRecoveryMechanismsUndefined: Self = StObject.set(x, "RecoveryMechanisms", js.undefined)
    
    inline def setRecoveryMechanismsVarargs(value: RecoveryOptionType*): Self = StObject.set(x, "RecoveryMechanisms", js.Array(value*))
  }
}

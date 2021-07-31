package typings.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterUsageResult extends StObject {
  
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.undefined
}
object RegisterUsageResult {
  
  @scala.inline
  def apply(): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUsageResult]
  }
  
  @scala.inline
  implicit class RegisterUsageResultMutableBuilder[Self <: RegisterUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublicKeyRotationTimestamp(value: Timestamp): Self = StObject.set(x, "PublicKeyRotationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyRotationTimestampUndefined: Self = StObject.set(x, "PublicKeyRotationTimestamp", js.undefined)
    
    @scala.inline
    def setSignature(value: NonEmptyString): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
  }
}

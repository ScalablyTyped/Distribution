package typings.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterUsageResult extends js.Object {
  
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.native
}
object RegisterUsageResult {
  
  @scala.inline
  def apply(): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUsageResult]
  }
  
  @scala.inline
  implicit class RegisterUsageResultOps[Self <: RegisterUsageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPublicKeyRotationTimestamp(value: Timestamp): Self = this.set("PublicKeyRotationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicKeyRotationTimestamp: Self = this.set("PublicKeyRotationTimestamp", js.undefined)
    
    @scala.inline
    def setSignature(value: NonEmptyString): Self = this.set("Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("Signature", js.undefined)
  }
}

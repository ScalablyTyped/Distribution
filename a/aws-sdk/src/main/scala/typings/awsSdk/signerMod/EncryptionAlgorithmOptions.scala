package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAlgorithmOptions extends js.Object {
  
  /**
    * The set of accepted encryption algorithms that are allowed in a code signing job.
    */
  var allowedValues: EncryptionAlgorithms = js.native
  
  /**
    * The default encryption algorithm that is used by a code signing job.
    */
  var defaultValue: EncryptionAlgorithm = js.native
}
object EncryptionAlgorithmOptions {
  
  @scala.inline
  def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
  
  @scala.inline
  implicit class EncryptionAlgorithmOptionsOps[Self <: EncryptionAlgorithmOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: EncryptionAlgorithm*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: EncryptionAlgorithms): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: EncryptionAlgorithm): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
  }
}

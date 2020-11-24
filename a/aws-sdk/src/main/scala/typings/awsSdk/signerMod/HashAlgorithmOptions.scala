package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashAlgorithmOptions extends js.Object {
  
  /**
    * The set of accepted hash algorithms allowed in a code signing job.
    */
  var allowedValues: HashAlgorithms = js.native
  
  /**
    * The default hash algorithm that is used in a code signing job.
    */
  var defaultValue: HashAlgorithm = js.native
}
object HashAlgorithmOptions {
  
  @scala.inline
  def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmOptions]
  }
  
  @scala.inline
  implicit class HashAlgorithmOptionsOps[Self <: HashAlgorithmOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedValuesVarargs(value: HashAlgorithm*): Self = this.set("allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setAllowedValues(value: HashAlgorithms): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: HashAlgorithm): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
  }
}

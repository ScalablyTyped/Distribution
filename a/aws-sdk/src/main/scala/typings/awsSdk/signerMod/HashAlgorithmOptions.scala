package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashAlgorithmOptions extends StObject {
  
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
  implicit class HashAlgorithmOptionsMutableBuilder[Self <: HashAlgorithmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: HashAlgorithms): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesVarargs(value: HashAlgorithm*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: HashAlgorithm): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}

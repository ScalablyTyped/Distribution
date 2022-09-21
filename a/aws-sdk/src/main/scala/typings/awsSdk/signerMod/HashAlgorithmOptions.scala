package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlgorithmOptions extends StObject {
  
  /**
    * The set of accepted hash algorithms allowed in a code signing job.
    */
  var allowedValues: HashAlgorithms
  
  /**
    * The default hash algorithm that is used in a code signing job.
    */
  var defaultValue: HashAlgorithm
}
object HashAlgorithmOptions {
  
  inline def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithmOptions]
  }
  
  extension [Self <: HashAlgorithmOptions](x: Self) {
    
    inline def setAllowedValues(value: HashAlgorithms): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: HashAlgorithm*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDefaultValue(value: HashAlgorithm): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterConstraints extends StObject {
  
  /**
    * The values that the administrator has allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsSdk.servicecatalogMod.AllowedValues] = js.undefined
}
object ParameterConstraints {
  
  inline def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  extension [Self <: ParameterConstraints](x: Self) {
    
    inline def setAllowedValues(value: AllowedValues): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: AllowedValue*): Self = StObject.set(x, "AllowedValues", js.Array(value :_*))
  }
}

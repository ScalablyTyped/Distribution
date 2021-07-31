package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterConstraints extends StObject {
  
  /**
    * A list of values that are permitted for a parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsSdk.cloudformationMod.AllowedValues] = js.undefined
}
object ParameterConstraints {
  
  @scala.inline
  def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  @scala.inline
  implicit class ParameterConstraintsMutableBuilder[Self <: ParameterConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: AllowedValues): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setAllowedValuesVarargs(value: AllowedValue*): Self = StObject.set(x, "AllowedValues", js.Array(value :_*))
  }
}

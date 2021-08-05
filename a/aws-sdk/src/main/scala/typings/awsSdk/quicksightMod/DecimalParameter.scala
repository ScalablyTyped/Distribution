package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalParameter extends StObject {
  
  /**
    * A display name for the decimal parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values for the decimal parameter.
    */
  var Values: DoubleList
}
object DecimalParameter {
  
  inline def apply(Name: NonEmptyString, Values: DoubleList): DecimalParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalParameter]
  }
  
  extension [Self <: DecimalParameter](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: DoubleList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}

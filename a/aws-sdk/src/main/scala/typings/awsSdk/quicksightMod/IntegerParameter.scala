package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParameter extends StObject {
  
  /**
    * The name of the integer parameter.
    */
  var Name: NonEmptyString
  
  /**
    * The values for the integer parameter.
    */
  var Values: LongList
}
object IntegerParameter {
  
  inline def apply(Name: NonEmptyString, Values: LongList): IntegerParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameter]
  }
  
  extension [Self <: IntegerParameter](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: LongList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Long*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}

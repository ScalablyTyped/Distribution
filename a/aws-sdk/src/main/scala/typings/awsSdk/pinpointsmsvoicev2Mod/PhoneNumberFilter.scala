package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: PhoneNumberFilterName
  
  /**
    * An array values to filter for.
    */
  var Values: FilterValueList
}
object PhoneNumberFilter {
  
  inline def apply(Name: PhoneNumberFilterName, Values: FilterValueList): PhoneNumberFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberFilter]
  }
  
  extension [Self <: PhoneNumberFilter](x: Self) {
    
    inline def setName(value: PhoneNumberFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}

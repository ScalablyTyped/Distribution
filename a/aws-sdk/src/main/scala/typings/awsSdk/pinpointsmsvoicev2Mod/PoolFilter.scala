package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolFilter extends StObject {
  
  /**
    * The name of the attribute to filter on.
    */
  var Name: PoolFilterName
  
  /**
    * An array values to filter for.
    */
  var Values: FilterValueList
}
object PoolFilter {
  
  inline def apply(Name: PoolFilterName, Values: FilterValueList): PoolFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolFilter]
  }
  
  extension [Self <: PoolFilter](x: Self) {
    
    inline def setName(value: PoolFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}

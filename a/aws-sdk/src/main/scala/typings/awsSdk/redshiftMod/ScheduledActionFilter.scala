package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledActionFilter extends StObject {
  
  /**
    * The type of element to filter. 
    */
  var Name: ScheduledActionFilterName
  
  /**
    * List of values. Compare if the value (of type defined by Name) equals an item in the list of scheduled actions. 
    */
  var Values: ValueStringList
}
object ScheduledActionFilter {
  
  inline def apply(Name: ScheduledActionFilterName, Values: ValueStringList): ScheduledActionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionFilter]
  }
  
  extension [Self <: ScheduledActionFilter](x: Self) {
    
    inline def setName(value: ScheduledActionFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}

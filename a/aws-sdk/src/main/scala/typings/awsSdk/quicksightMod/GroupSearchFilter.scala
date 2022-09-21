package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupSearchFilter extends StObject {
  
  /**
    * The name of the value that you want to use as a filter, for example "Name": "GROUP_NAME". Currently, the only supported name is GROUP_NAME.
    */
  var Name: GroupFilterAttribute
  
  /**
    * The comparison operator that you want to use as a filter, for example "Operator": "StartsWith". Currently, the only supported operator is StartsWith.
    */
  var Operator: GroupFilterOperator
  
  /**
    * The value of the named item, in this case GROUP_NAME, that you want to use as a filter.
    */
  var Value: String
}
object GroupSearchFilter {
  
  inline def apply(Name: GroupFilterAttribute, Operator: GroupFilterOperator, Value: String): GroupSearchFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSearchFilter]
  }
  
  extension [Self <: GroupSearchFilter](x: Self) {
    
    inline def setName(value: GroupFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: GroupFilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

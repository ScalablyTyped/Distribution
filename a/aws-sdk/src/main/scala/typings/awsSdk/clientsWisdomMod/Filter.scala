package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The field on which to filter.
    */
  var field: FilterField
  
  /**
    * The operator to use for comparing the field’s value with the provided value.
    */
  var operator: FilterOperator
  
  /**
    * The desired field value on which to filter.
    */
  var value: NonEmptyString
}
object Filter {
  
  inline def apply(field: FilterField, operator: FilterOperator, value: NonEmptyString): Filter = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setField(value: FilterField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

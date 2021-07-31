package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The condition to apply. To include the objects that match the statement, specify IS. To exclude matching objects, specify IS_NOT.
    */
  var Condition: FilterConditionString
  
  /**
    * The name of the parameter to filter on.
    */
  var Key: String
  
  /**
    * The value to match.
    */
  var Value: Arn
}
object Filter {
  
  @scala.inline
  def apply(Condition: FilterConditionString, Key: String, Value: Arn): Filter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: FilterConditionString): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Arn): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

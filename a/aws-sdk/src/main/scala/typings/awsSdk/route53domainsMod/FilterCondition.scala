package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCondition extends StObject {
  
  /**
    * Name of the field which should be used for filtering the list of domains.
    */
  var Name: ListDomainsAttributeName
  
  /**
    * The operator values for filtering domain names. The values can be:    LE: Less than, or equal to    GE: Greater than, or equal to    BEGINS_WITH: Begins with  
    */
  var Operator: typings.awsSdk.route53domainsMod.Operator
  
  /**
    *  An array of strings presenting values to compare. Only 1 item in the list is currently supported.
    */
  var Values: typings.awsSdk.route53domainsMod.Values
}
object FilterCondition {
  
  inline def apply(Name: ListDomainsAttributeName, Operator: Operator, Values: Values): FilterCondition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterCondition]
  }
  
  extension [Self <: FilterCondition](x: Self) {
    
    inline def setName(value: ListDomainsAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}

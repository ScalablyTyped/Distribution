package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardSearchFilter extends StObject {
  
  /**
    * The name of the value that you want to use as a filter, for example, "Name": "QUICKSIGHT_USER". 
    */
  var Name: js.UndefOr[DashboardFilterAttribute] = js.undefined
  
  /**
    * The comparison operator that you want to use as a filter, for example, "Operator": "StringEquals".
    */
  var Operator: FilterOperator
  
  /**
    * The value of the named item, in this case QUICKSIGHT_USER, that you want to use as a filter, for example, "Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1". 
    */
  var Value: js.UndefOr[String] = js.undefined
}
object DashboardSearchFilter {
  
  inline def apply(Operator: FilterOperator): DashboardSearchFilter = {
    val __obj = js.Dynamic.literal(Operator = Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSearchFilter]
  }
  
  extension [Self <: DashboardSearchFilter](x: Self) {
    
    inline def setName(value: DashboardFilterAttribute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperator(value: FilterOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}

package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotificationRulesFilter extends StObject {
  
  /**
    * The name of the attribute you want to use to filter the returned notification rules.
    */
  var Name: ListNotificationRulesFilterName
  
  /**
    * The value of the attribute you want to use to filter the returned notification rules. For example, if you specify filtering by RESOURCE in Name, you might specify the ARN of a pipeline in CodePipeline for the value.
    */
  var Value: ListNotificationRulesFilterValue
}
object ListNotificationRulesFilter {
  
  inline def apply(Name: ListNotificationRulesFilterName, Value: ListNotificationRulesFilterValue): ListNotificationRulesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotificationRulesFilter]
  }
  
  extension [Self <: ListNotificationRulesFilter](x: Self) {
    
    inline def setName(value: ListNotificationRulesFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ListNotificationRulesFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}

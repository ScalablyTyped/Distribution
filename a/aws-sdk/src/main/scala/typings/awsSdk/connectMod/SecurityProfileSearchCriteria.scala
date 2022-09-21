package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileSearchCriteria extends StObject {
  
  /**
    * A list of conditions which would be applied together with an AND condition.
    */
  var AndConditions: js.UndefOr[SecurityProfileSearchConditionList] = js.undefined
  
  /**
    * A list of conditions which would be applied together with an OR condition.
    */
  var OrConditions: js.UndefOr[SecurityProfileSearchConditionList] = js.undefined
  
  var StringCondition: js.UndefOr[typings.awsSdk.connectMod.StringCondition] = js.undefined
}
object SecurityProfileSearchCriteria {
  
  inline def apply(): SecurityProfileSearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileSearchCriteria]
  }
  
  extension [Self <: SecurityProfileSearchCriteria](x: Self) {
    
    inline def setAndConditions(value: SecurityProfileSearchConditionList): Self = StObject.set(x, "AndConditions", value.asInstanceOf[js.Any])
    
    inline def setAndConditionsUndefined: Self = StObject.set(x, "AndConditions", js.undefined)
    
    inline def setAndConditionsVarargs(value: SecurityProfileSearchCriteria*): Self = StObject.set(x, "AndConditions", js.Array(value*))
    
    inline def setOrConditions(value: SecurityProfileSearchConditionList): Self = StObject.set(x, "OrConditions", value.asInstanceOf[js.Any])
    
    inline def setOrConditionsUndefined: Self = StObject.set(x, "OrConditions", js.undefined)
    
    inline def setOrConditionsVarargs(value: SecurityProfileSearchCriteria*): Self = StObject.set(x, "OrConditions", js.Array(value*))
    
    inline def setStringCondition(value: StringCondition): Self = StObject.set(x, "StringCondition", value.asInstanceOf[js.Any])
    
    inline def setStringConditionUndefined: Self = StObject.set(x, "StringCondition", js.undefined)
  }
}

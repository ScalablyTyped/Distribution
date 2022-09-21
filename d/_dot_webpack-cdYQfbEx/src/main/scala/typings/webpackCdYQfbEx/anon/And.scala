package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditionOrConditions
import typings.webpackCdYQfbEx.webpackOptionsDTsMod.RuleSetConditions
import typings.webpackCdYQfbEx.webpackOptionsDTsMod._RuleSetCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And
  extends StObject
     with _RuleSetCondition {
  
  /**
  			 * Logical AND
  			 */
  var and: js.UndefOr[RuleSetConditions] = js.undefined
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var exclude: js.UndefOr[RuleSetConditionOrConditions] = js.undefined
  
  /**
  			 * Exclude all modules matching not any of these conditions
  			 */
  var include: js.UndefOr[RuleSetConditionOrConditions] = js.undefined
  
  /**
  			 * Logical NOT
  			 */
  var not: js.UndefOr[RuleSetConditions] = js.undefined
  
  /**
  			 * Logical OR
  			 */
  var or: js.UndefOr[RuleSetConditions] = js.undefined
  
  /**
  			 * Exclude all modules matching any of these conditions
  			 */
  var test: js.UndefOr[RuleSetConditionOrConditions] = js.undefined
}
object And {
  
  inline def apply(): And = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[And]
  }
  
  extension [Self <: And](x: Self) {
    
    inline def setAnd(value: RuleSetConditions): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "and", js.undefined)
    
    inline def setExclude(value: RuleSetConditionOrConditions): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setInclude(value: RuleSetConditionOrConditions): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setNot(value: RuleSetConditions): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOr(value: RuleSetConditions): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "or", js.undefined)
    
    inline def setTest(value: RuleSetConditionOrConditions): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}

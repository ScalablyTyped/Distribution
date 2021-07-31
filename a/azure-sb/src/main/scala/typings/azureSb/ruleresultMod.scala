package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.CreateRuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait RuleResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object]
          
          def serialize(rule: CreateRuleOptions): String
        }
        object RuleResult {
          
          @scala.inline
          def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: CreateRuleOptions => String): RuleResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[RuleResult]
          }
          
          @scala.inline
          implicit class RuleResultMutableBuilder[Self <: RuleResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSerialize(value: CreateRuleOptions => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}

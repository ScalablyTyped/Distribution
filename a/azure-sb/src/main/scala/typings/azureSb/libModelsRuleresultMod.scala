package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.CreateRuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsRuleresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait RuleResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object]
          
          def serialize(rule: CreateRuleOptions): String
        }
        object RuleResult {
          
          inline def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: CreateRuleOptions => String): RuleResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[RuleResult]
          }
          
          extension [Self <: RuleResult](x: Self) {
            
            inline def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            inline def setSerialize(value: CreateRuleOptions => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}

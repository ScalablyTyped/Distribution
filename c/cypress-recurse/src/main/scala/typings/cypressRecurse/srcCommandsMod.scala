package typings.cypressRecurse

import typings.cypress.Chai.Assertion
import typings.cypressRecurse.anon.FnCall
import typings.cypressRecurse.mod.RecurseOptions
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandsMod {
  
  object global {
    
    object Cypress {
      
      trait Chainable extends StObject {
        
        def recurse[T](
          commandsFn: js.Function0[this.type],
          checkFn: js.Function2[/* x */ T, /* reducedValue */ js.UndefOr[Any], Boolean | Unit | Assertion]
        ): Chainable
        def recurse[T](
          commandsFn: js.Function0[this.type],
          checkFn: js.Function2[/* x */ T, /* reducedValue */ js.UndefOr[Any], Boolean | Unit | Assertion],
          options: Partial[RecurseOptions[T]]
        ): Chainable
        @JSName("recurse")
        var recurse_Original: FnCall
      }
      object Chainable {
        
        inline def apply(recurse: FnCall): Chainable = {
          val __obj = js.Dynamic.literal(recurse = recurse.asInstanceOf[js.Any])
          __obj.asInstanceOf[Chainable]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Chainable] (val x: Self) extends AnyVal {
          
          inline def setRecurse(value: FnCall): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}

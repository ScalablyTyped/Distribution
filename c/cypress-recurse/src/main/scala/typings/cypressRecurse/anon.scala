package typings.cypressRecurse

import typings.cypress.Chai.Assertion
import typings.cypressRecurse.mod.RecurseOptions
import typings.cypressRecurse.srcCommandsMod.global.Cypress.Chainable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](
      commandsFn: js.Function0[this.type],
      checkFn: js.Function2[/* x */ T, /* reducedValue */ js.UndefOr[Any], Boolean | Unit | Assertion]
    ): Chainable = js.native
    def apply[T](
      commandsFn: js.Function0[this.type],
      checkFn: js.Function2[/* x */ T, /* reducedValue */ js.UndefOr[Any], Boolean | Unit | Assertion],
      options: Partial[RecurseOptions[T]]
    ): Chainable = js.native
  }
}

package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.CommandOptions & {  prevSubject :false} */
trait CommandOptionsprevSubject extends StObject {
  
  var prevSubject: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
}
object CommandOptionsprevSubject {
  
  inline def apply(
    prevSubject: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
  ): CommandOptionsprevSubject = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionsprevSubject]
  }
  
  extension [Self <: CommandOptionsprevSubject](x: Self) {
    
    inline def setPrevSubject(
      value: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
    ): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: typings.cypress.Cypress.PrevSubject*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

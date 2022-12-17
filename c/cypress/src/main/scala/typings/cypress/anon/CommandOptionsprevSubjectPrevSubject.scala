package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.CommandOptions & {  prevSubject :true} */
trait CommandOptionsprevSubjectPrevSubject extends StObject {
  
  var prevSubject: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
}
object CommandOptionsprevSubjectPrevSubject {
  
  inline def apply(
    prevSubject: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
  ): CommandOptionsprevSubjectPrevSubject = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptionsprevSubjectPrevSubject]
  }
  
  extension [Self <: CommandOptionsprevSubjectPrevSubject](x: Self) {
    
    inline def setPrevSubject(
      value: Boolean | typings.cypress.Cypress.PrevSubject | js.Array[typings.cypress.Cypress.PrevSubject]
    ): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: typings.cypress.Cypress.PrevSubject*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

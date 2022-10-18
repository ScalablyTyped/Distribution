package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandOptions extends StObject {
  
  var prevSubject: Boolean | PrevSubject | js.Array[PrevSubject]
}
object CommandOptions {
  
  inline def apply(prevSubject: Boolean | PrevSubject | js.Array[PrevSubject]): CommandOptions = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
  
  extension [Self <: CommandOptions](x: Self) {
    
    inline def setPrevSubject(value: Boolean | PrevSubject | js.Array[PrevSubject]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: PrevSubject*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

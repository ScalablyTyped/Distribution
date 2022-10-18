package typings.cypress.anon

import typings.cypress.cypressStrings.optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevSubject extends StObject {
  
  var prevSubject: optional | js.Array[optional]
}
object PrevSubject {
  
  inline def apply(prevSubject: optional | js.Array[optional]): PrevSubject = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevSubject]
  }
  
  extension [Self <: PrevSubject](x: Self) {
    
    inline def setPrevSubject(value: optional | js.Array[optional]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: optional*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

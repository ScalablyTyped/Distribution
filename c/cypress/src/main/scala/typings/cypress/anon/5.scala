package typings.cypress.anon

import typings.cypress.cypressStrings.document
import typings.cypress.cypressStrings.optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var prevSubject: document | js.Array[optional]
}
object `5` {
  
  inline def apply(prevSubject: document | js.Array[optional]): `5` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setPrevSubject(value: document | js.Array[optional]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: optional*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

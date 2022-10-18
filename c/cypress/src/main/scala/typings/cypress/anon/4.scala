package typings.cypress.anon

import typings.cypress.cypressStrings.element
import typings.cypress.cypressStrings.optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var prevSubject: element | js.Array[optional]
}
object `4` {
  
  inline def apply(prevSubject: element | js.Array[optional]): `4` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setPrevSubject(value: element | js.Array[optional]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: optional*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

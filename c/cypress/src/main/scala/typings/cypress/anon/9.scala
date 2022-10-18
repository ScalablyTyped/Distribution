package typings.cypress.anon

import typings.cypress.cypressStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var prevSubject: js.Array[window]
}
object `9` {
  
  inline def apply(prevSubject: js.Array[window]): `9` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setPrevSubject(value: js.Array[window]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: window*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

package typings.cypress.anon

import typings.cypress.cypressStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var prevSubject: js.Array[document]
}
object `8` {
  
  inline def apply(prevSubject: js.Array[document]): `8` = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setPrevSubject(value: js.Array[document]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: document*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

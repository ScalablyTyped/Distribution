package typings.cypress.anon

import typings.cypress.cypressStrings.optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevSubjectArray extends StObject {
  
  var prevSubject: js.Array[optional]
}
object PrevSubjectArray {
  
  inline def apply(prevSubject: js.Array[optional]): PrevSubjectArray = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevSubjectArray]
  }
  
  extension [Self <: PrevSubjectArray](x: Self) {
    
    inline def setPrevSubject(value: js.Array[optional]): Self = StObject.set(x, "prevSubject", value.asInstanceOf[js.Any])
    
    inline def setPrevSubjectVarargs(value: optional*): Self = StObject.set(x, "prevSubject", js.Array(value*))
  }
}

package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseValues extends StObject {
  
  var expected: Boolean
  
  var subject: Boolean
}
object CaseValues {
  
  inline def apply(expected: Boolean, subject: Boolean): CaseValues = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseValues]
  }
  
  extension [Self <: CaseValues](x: Self) {
    
    inline def setExpected(value: Boolean): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}

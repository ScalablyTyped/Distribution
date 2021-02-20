package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseValues extends StObject {
  
  var expected: Boolean = js.native
  
  var subject: Boolean = js.native
}
object CaseValues {
  
  @scala.inline
  def apply(expected: Boolean, subject: Boolean): CaseValues = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseValues]
  }
  
  @scala.inline
  implicit class CaseValuesMutableBuilder[Self <: CaseValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpected(value: Boolean): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Boolean): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}

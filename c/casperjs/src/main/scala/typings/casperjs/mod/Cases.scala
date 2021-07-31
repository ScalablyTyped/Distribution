package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cases extends StObject {
  
  var cases: js.Array[Case]
  
  var length: Double
}
object Cases {
  
  @scala.inline
  def apply(cases: js.Array[Case], length: Double): Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cases]
  }
  
  @scala.inline
  implicit class CasesMutableBuilder[Self <: Cases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCases(value: js.Array[Case]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesVarargs(value: Case*): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}

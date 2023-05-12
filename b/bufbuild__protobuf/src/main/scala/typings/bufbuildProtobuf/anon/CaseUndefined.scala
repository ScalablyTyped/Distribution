package typings.bufbuildProtobuf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseUndefined extends StObject {
  
  var `case`: Unit
  
  var value: Unit
}
object CaseUndefined {
  
  inline def apply(`case`: Unit, value: Unit): CaseUndefined = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseUndefined] (val x: Self) extends AnyVal {
    
    inline def setCase(value: Unit): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

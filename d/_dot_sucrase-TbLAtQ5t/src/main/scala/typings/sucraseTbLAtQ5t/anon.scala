package typings.sucraseTbLAtQ5t

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NameStringCode extends StObject {
    
    var nameStringCode: String
    
    var variableName: String | Null
  }
  object NameStringCode {
    
    inline def apply(nameStringCode: String): NameStringCode = {
      val __obj = js.Dynamic.literal(nameStringCode = nameStringCode.asInstanceOf[js.Any], variableName = null)
      __obj.asInstanceOf[NameStringCode]
    }
    
    extension [Self <: NameStringCode](x: Self) {
      
      inline def setNameStringCode(value: String): Self = StObject.set(x, "nameStringCode", value.asInstanceOf[js.Any])
      
      inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
      
      inline def setVariableNameNull: Self = StObject.set(x, "variableName", null)
    }
  }
}

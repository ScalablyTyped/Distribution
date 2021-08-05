package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Case extends StObject {
  
  var file: String
  
  var standard: String
  
  var success: Boolean
  
  var `type`: String
  
  var values: CaseValues
}
object Case {
  
  inline def apply(file: String, standard: String, success: Boolean, `type`: String, values: CaseValues): Case = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Case]
  }
  
  extension [Self <: Case](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CaseValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}

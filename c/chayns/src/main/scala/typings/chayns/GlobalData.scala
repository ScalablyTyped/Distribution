package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalData extends StObject {
  
  var _result: Any
}
object GlobalData {
  
  inline def apply(_result: Any): GlobalData = {
    val __obj = js.Dynamic.literal(_result = _result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalData] (val x: Self) extends AnyVal {
    
    inline def set_result(value: Any): Self = StObject.set(x, "_result", value.asInstanceOf[js.Any])
  }
}

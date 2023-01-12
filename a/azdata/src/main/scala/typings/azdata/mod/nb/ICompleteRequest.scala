package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompleteRequest extends StObject {
  
  var code: String
  
  var cursor_pos: Double
}
object ICompleteRequest {
  
  inline def apply(code: String, cursor_pos: Double): ICompleteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cursor_pos = cursor_pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompleteRequest] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCursor_pos(value: Double): Self = StObject.set(x, "cursor_pos", value.asInstanceOf[js.Any])
  }
}

package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53, starting with typings.dashjs.dashjsInts.`10`, typings.dashjs.dashjsInts.`11`, typings.dashjs.dashjsInts.`12` */ Any
  
  var data: js.Object
  
  var message: String
}
object Code {
  
  inline def apply(
    code: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53, starting with typings.dashjs.dashjsInts.`10`, typings.dashjs.dashjsInts.`11`, typings.dashjs.dashjsInts.`12` */ Any,
    data: js.Object,
    message: String
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53, starting with typings.dashjs.dashjsInts.`10`, typings.dashjs.dashjsInts.`11`, typings.dashjs.dashjsInts.`12` */ Any
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

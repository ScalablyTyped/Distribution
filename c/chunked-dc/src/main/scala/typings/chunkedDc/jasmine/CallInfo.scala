package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInfo extends StObject {
  
  /** All arguments passed to the call */
  var args: js.Array[scala.Any]
  
  /** The context (the this) for the call */
  var `object`: scala.Any
  
  /** The return value of the call */
  var returnValue: scala.Any
}
object CallInfo {
  
  inline def apply(args: js.Array[scala.Any], `object`: scala.Any, returnValue: scala.Any): CallInfo = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInfo]
  }
  
  extension [Self <: CallInfo](x: Self) {
    
    inline def setArgs(value: js.Array[scala.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: scala.Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setObject(value: scala.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: scala.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

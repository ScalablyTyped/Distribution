package typings.chunkedDc.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInfo extends StObject {
  
  /** All arguments passed to the call */
  var args: js.Array[js.Any]
  
  /** The context (the this) for the call */
  var `object`: js.Any
  
  /** The return value of the call */
  var returnValue: js.Any
}
object CallInfo {
  
  @scala.inline
  def apply(args: js.Array[js.Any], `object`: js.Any, returnValue: js.Any): CallInfo = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInfo]
  }
  
  @scala.inline
  implicit class CallInfoMutableBuilder[Self <: CallInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

package typings.babylonjs.BABYLON

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeError
  extends StObject
     with Error {
  
  /**
    * The error code
    */
  var errorCode: ErrorCodesType
  
  /**
    * The error that caused this outer error
    */
  var innerError: js.UndefOr[js.Error] = js.undefined
}
object RuntimeError {
  
  inline def apply(errorCode: ErrorCodesType, message: String, name: String): RuntimeError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: ErrorCodesType): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setInnerError(value: js.Error): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
  }
}

package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError extends StObject {
  
  /**
    * The error code that indicates why the parameter or parameter combination is not valid. For more information about error codes, see Error Codes.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The error message that describes why the parameter or parameter combination is not valid. For more information about error messages, see Error Codes.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ValidationError {
  
  inline def apply(): ValidationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationError]
  }
  
  extension [Self <: ValidationError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}

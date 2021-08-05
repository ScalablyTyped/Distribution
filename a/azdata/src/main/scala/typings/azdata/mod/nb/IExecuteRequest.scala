package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteRequest
  extends StObject
     with IExecuteOptions {
  
  var code: String | js.Array[String]
}
object IExecuteRequest {
  
  inline def apply(code: String | js.Array[String]): IExecuteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequest]
  }
  
  extension [Self <: IExecuteRequest](x: Self) {
    
    inline def setCode(value: String | js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
  }
}

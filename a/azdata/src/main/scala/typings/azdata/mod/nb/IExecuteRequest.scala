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
  
  @scala.inline
  def apply(code: String | js.Array[String]): IExecuteRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequest]
  }
  
  @scala.inline
  implicit class IExecuteRequestMutableBuilder[Self <: IExecuteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String | js.Array[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeVarargs(value: String*): Self = StObject.set(x, "code", js.Array(value :_*))
  }
}

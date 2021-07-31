package typings.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var code: js.UndefOr[java.lang.String] = js.undefined
  
  var httpStatusCode: js.UndefOr[scala.Double] = js.undefined
  
  var senderFault: js.UndefOr[scala.Boolean] = js.undefined
}
object Error {
  
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: java.lang.String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setHttpStatusCode(value: scala.Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
    
    @scala.inline
    def setSenderFault(value: scala.Boolean): Self = StObject.set(x, "senderFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderFaultUndefined: Self = StObject.set(x, "senderFault", js.undefined)
  }
}

package typings.casperjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSettings extends StObject {
  
  var data: js.Any
  
  var headers: js.Any
  
  var method: String
}
object OpenSettings {
  
  @scala.inline
  def apply(data: js.Any, headers: js.Any, method: String): OpenSettings = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettings]
  }
  
  @scala.inline
  implicit class OpenSettingsMutableBuilder[Self <: OpenSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}

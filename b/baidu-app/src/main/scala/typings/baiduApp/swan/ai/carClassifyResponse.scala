package typings.baiduApp.swan.ai

import typings.baiduApp.anon.Height
import typings.baiduApp.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait carClassifyResponse extends StObject {
  
  var location_result: Height = js.native
  
  var log_id: Double = js.native
  
  //     唯一的log id，用于问题定位。
  var result: js.Array[Name] = js.native
}
object carClassifyResponse {
  
  @scala.inline
  def apply(location_result: Height, log_id: Double, result: js.Array[Name]): carClassifyResponse = {
    val __obj = js.Dynamic.literal(location_result = location_result.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[carClassifyResponse]
  }
  
  @scala.inline
  implicit class carClassifyResponseMutableBuilder[Self <: carClassifyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation_result(value: Height): Self = StObject.set(x, "location_result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Array[Name]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Name*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}

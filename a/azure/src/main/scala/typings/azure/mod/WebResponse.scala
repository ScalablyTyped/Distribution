package typings.azure.mod

import typings.azure.anon.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponse extends StObject {
  
  var body: Entry = js.native
  
  var headers: js.Any = js.native
  
  var isSuccessful: Boolean = js.native
  
  var md5: js.Any = js.native
  
  var statusCode: Double = js.native
}
object WebResponse {
  
  @scala.inline
  def apply(body: Entry, headers: js.Any, isSuccessful: Boolean, md5: js.Any, statusCode: Double): WebResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], isSuccessful = isSuccessful.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebResponse]
  }
  
  @scala.inline
  implicit class WebResponseMutableBuilder[Self <: WebResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Entry): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccessful(value: Boolean): Self = StObject.set(x, "isSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: js.Any): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}

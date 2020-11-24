package typings.blissfuljs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequestUpload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data
  extends /* propertyName */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var onreadystatechange: js.UndefOr[js.Function1[/* ev */ ProgressEvent[EventTarget], _]] = js.native
  
  var readyState: js.UndefOr[Double] = js.native
  
  var response: js.UndefOr[js.Any] = js.native
  
  var responseBody: js.UndefOr[js.Any] = js.native
  
  var responseText: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var responseXML: js.UndefOr[js.Any] = js.native
  
  var status: js.UndefOr[Double] = js.native
  
  var statusText: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var upload: js.UndefOr[XMLHttpRequestUpload] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOnreadystatechange(value: /* ev */ ProgressEvent[EventTarget] => _): Self = this.set("onreadystatechange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnreadystatechange: Self = this.set("onreadystatechange", js.undefined)
    
    @scala.inline
    def setReadyState(value: Double): Self = this.set("readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyState: Self = this.set("readyState", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    
    @scala.inline
    def setResponseBody(value: js.Any): Self = this.set("responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBody: Self = this.set("responseBody", js.undefined)
    
    @scala.inline
    def setResponseText(value: String): Self = this.set("responseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseText: Self = this.set("responseText", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setResponseXML(value: js.Any): Self = this.set("responseXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseXML: Self = this.set("responseXML", js.undefined)
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUpload(value: XMLHttpRequestUpload): Self = this.set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}

package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Http extends StObject {
  
  def http(config: AxiosRequestConfig): AxiosPromise[js.Any]
  def http(url: String): AxiosPromise[js.Any]
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[js.Any]
  @JSName("http")
  var http_Original: AxiosInstance
}
object Http {
  
  @scala.inline
  def apply(http: AxiosInstance): Http = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttp(value: AxiosInstance): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}

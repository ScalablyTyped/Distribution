package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUpload extends StObject {
  
  def http(config: AxiosRequestConfig): AxiosPromise[js.Any]
  def http(url: String): AxiosPromise[js.Any]
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[js.Any]
  
  def httpUpload(config: AxiosRequestConfig): AxiosPromise[js.Any]
  def httpUpload(url: String): AxiosPromise[js.Any]
  def httpUpload(url: String, config: AxiosRequestConfig): AxiosPromise[js.Any]
  @JSName("httpUpload")
  var httpUpload_Original: AxiosInstance
  
  @JSName("http")
  var http_Original: AxiosInstance
}
object HttpUpload {
  
  inline def apply(http: AxiosInstance, httpUpload: AxiosInstance): HttpUpload = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], httpUpload = httpUpload.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUpload]
  }
  
  extension [Self <: HttpUpload](x: Self) {
    
    inline def setHttp(value: AxiosInstance): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUpload(value: AxiosInstance): Self = StObject.set(x, "httpUpload", value.asInstanceOf[js.Any])
  }
}

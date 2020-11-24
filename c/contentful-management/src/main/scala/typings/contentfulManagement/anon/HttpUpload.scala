package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUpload extends js.Object {
  
  def http(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def http(url: String): AxiosPromise[_] = js.native
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  
  def httpUpload(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def httpUpload(url: String): AxiosPromise[_] = js.native
  def httpUpload(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  @JSName("httpUpload")
  var httpUpload_Original: AxiosInstance = js.native
  
  @JSName("http")
  var http_Original: AxiosInstance = js.native
}

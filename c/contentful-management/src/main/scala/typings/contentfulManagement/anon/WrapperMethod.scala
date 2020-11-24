package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperMethod[T] extends js.Object {
  
  var entityPath: String = js.native
  
  def http(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def http(url: String): AxiosPromise[_] = js.native
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  @JSName("http")
  var http_Original: AxiosInstance = js.native
  
  def wrapperMethod(http: AxiosInstance, data: js.Any): T = js.native
  @JSName("wrapperMethod")
  var wrapperMethod_Original: typings.contentfulManagement.instanceActionsMod.WrapperMethod[T, AxiosInstance] = js.native
}

package typings.axios.mod

import typings.axios.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axios", "Axios")
@js.native
open class Axios () extends StObject {
  def this(config: AxiosRequestConfig[Any]) = this()
  
  var defaults: AxiosDefaults[Any] = js.native
  
  def delete[T, R, D](url: String): js.Promise[R] = js.native
  def delete[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def get[T, R, D](url: String): js.Promise[R] = js.native
  def get[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def getUri(): String = js.native
  def getUri(config: AxiosRequestConfig[Any]): String = js.native
  
  def head[T, R, D](url: String): js.Promise[R] = js.native
  def head[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  var interceptors: Request = js.native
  
  def options[T, R, D](url: String): js.Promise[R] = js.native
  def options[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def patch[T, R, D](url: String): js.Promise[R] = js.native
  def patch[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def patch[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def patch[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def patchForm[T, R, D](url: String): js.Promise[R] = js.native
  def patchForm[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def patchForm[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def patchForm[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def post[T, R, D](url: String): js.Promise[R] = js.native
  def post[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def post[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def post[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def postForm[T, R, D](url: String): js.Promise[R] = js.native
  def postForm[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def postForm[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def postForm[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def put[T, R, D](url: String): js.Promise[R] = js.native
  def put[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def put[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def put[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def putForm[T, R, D](url: String): js.Promise[R] = js.native
  def putForm[T, R, D](url: String, data: D): js.Promise[R] = js.native
  def putForm[T, R, D](url: String, data: D, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def putForm[T, R, D](url: String, data: Unit, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  def request[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R] = js.native
}

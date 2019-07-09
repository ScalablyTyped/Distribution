package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosInstance extends js.Object {
  var defaults: AxiosRequestConfig = js.native
  var interceptors: axiosLib.Anon_Request = js.native
  def apply(config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def apply(url: java.lang.String): AxiosPromise[_] = js.native
  def apply(url: java.lang.String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def delete[T, R](url: java.lang.String): js.Promise[R] = js.native
  def delete[T, R](url: java.lang.String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def get[T, R](url: java.lang.String): js.Promise[R] = js.native
  def get[T, R](url: java.lang.String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def getUri(): java.lang.String = js.native
  def getUri(config: AxiosRequestConfig): java.lang.String = js.native
  def head[T, R](url: java.lang.String): js.Promise[R] = js.native
  def head[T, R](url: java.lang.String, config: AxiosRequestConfig): js.Promise[R] = js.native
  def patch[T, R](url: java.lang.String): js.Promise[R] = js.native
  def patch[T, R](url: java.lang.String, data: js.Any): js.Promise[R] = js.native
  def patch[T, R](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def post[T, R](url: java.lang.String): js.Promise[R] = js.native
  def post[T, R](url: java.lang.String, data: js.Any): js.Promise[R] = js.native
  def post[T, R](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def put[T, R](url: java.lang.String): js.Promise[R] = js.native
  def put[T, R](url: java.lang.String, data: js.Any): js.Promise[R] = js.native
  def put[T, R](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): js.Promise[R] = js.native
  def request[T, R](config: AxiosRequestConfig): js.Promise[R] = js.native
}


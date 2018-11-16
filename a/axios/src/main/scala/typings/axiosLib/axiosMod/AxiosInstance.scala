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
  def delete(url: java.lang.String): AxiosPromise[_] = js.native
  def delete(url: java.lang.String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def get[T](url: java.lang.String): AxiosPromise[T] = js.native
  def get[T](url: java.lang.String, config: AxiosRequestConfig): AxiosPromise[T] = js.native
  def head(url: java.lang.String): AxiosPromise[_] = js.native
  def head(url: java.lang.String, config: AxiosRequestConfig): AxiosPromise[_] = js.native
  def patch[T](url: java.lang.String): AxiosPromise[T] = js.native
  def patch[T](url: java.lang.String, data: js.Any): AxiosPromise[T] = js.native
  def patch[T](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): AxiosPromise[T] = js.native
  def post[T](url: java.lang.String): AxiosPromise[T] = js.native
  def post[T](url: java.lang.String, data: js.Any): AxiosPromise[T] = js.native
  def post[T](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): AxiosPromise[T] = js.native
  def put[T](url: java.lang.String): AxiosPromise[T] = js.native
  def put[T](url: java.lang.String, data: js.Any): AxiosPromise[T] = js.native
  def put[T](url: java.lang.String, data: js.Any, config: AxiosRequestConfig): AxiosPromise[T] = js.native
  def request[T](config: AxiosRequestConfig): AxiosPromise[T] = js.native
}


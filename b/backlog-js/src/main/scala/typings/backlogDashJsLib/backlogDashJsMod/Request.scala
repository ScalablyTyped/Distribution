package typings
package backlogDashJsLib.backlogDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var configure: js.Any = js.native
  var restBaseURL: java.lang.String = js.native
  var webAppBaseURL: java.lang.String = js.native
  def checkStatus(response: stdLib.Response): js.Promise[stdLib.Response] = js.native
  def delete[T](path: java.lang.String): js.Promise[T] = js.native
  def delete[T](path: java.lang.String, params: js.Any): js.Promise[T] = js.native
  def get[T](path: java.lang.String): js.Promise[T] = js.native
  def get[T](path: java.lang.String, params: js.Any): js.Promise[T] = js.native
  def parseJSON[T](response: stdLib.Response): js.Promise[T] = js.native
  def patch[T](path: java.lang.String, params: js.Any): js.Promise[T] = js.native
  def post[T](path: java.lang.String): js.Promise[T] = js.native
  def post[T](path: java.lang.String, params: js.Any): js.Promise[T] = js.native
  def put[T](path: java.lang.String, params: js.Any): js.Promise[T] = js.native
  def request(options: backlogDashJsLib.Anon_Method): js.Promise[stdLib.Response] = js.native
  /* private */ def toFormData(params: js.Any): js.Any = js.native
  /* private */ def toQueryString(params: js.Any): js.Any = js.native
}


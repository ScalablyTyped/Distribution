package typings.backlogJs.mod

import typings.backlogJs.AnonMethod
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var configure: js.Any = js.native
  var restBaseURL: String = js.native
  var webAppBaseURL: String = js.native
  def checkStatus(response: Response): js.Promise[Response] = js.native
  def delete[T](path: String): js.Promise[T] = js.native
  def delete[T](path: String, params: js.Any): js.Promise[T] = js.native
  def get[T](path: String): js.Promise[T] = js.native
  def get[T](path: String, params: js.Any): js.Promise[T] = js.native
  def parseJSON[T](response: Response): js.Promise[T] = js.native
  def patch[T](path: String, params: js.Any): js.Promise[T] = js.native
  def post[T](path: String): js.Promise[T] = js.native
  def post[T](path: String, params: js.Any): js.Promise[T] = js.native
  def put[T](path: String, params: js.Any): js.Promise[T] = js.native
  def request(options: AnonMethod): js.Promise[Response] = js.native
  /* private */ def toFormData(params: js.Any): js.Any = js.native
  /* private */ def toQueryString(params: js.Any): js.Any = js.native
}


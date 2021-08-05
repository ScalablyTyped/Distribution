package typings.backlogJs.mod

import typings.backlogJs.anon.Method
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  def checkStatus(response: Response): js.Promise[Response] = js.native
  
  /* private */ var configure: js.Any = js.native
  
  def delete[T](path: String): js.Promise[T] = js.native
  def delete[T](path: String, params: js.Any): js.Promise[T] = js.native
  
  def get[T](path: String): js.Promise[T] = js.native
  def get[T](path: String, params: js.Any): js.Promise[T] = js.native
  
  def parseJSON[T](response: Response): js.Promise[T] = js.native
  
  def patch[T](path: String, params: js.Any): js.Promise[T] = js.native
  
  def post[T](path: String): js.Promise[T] = js.native
  def post[T](path: String, params: js.Any): js.Promise[T] = js.native
  
  def put[T](path: String, params: js.Any): js.Promise[T] = js.native
  
  def request(options: Method): js.Promise[Response] = js.native
  
  var restBaseURL: String = js.native
  
  /* private */ def toFormData(params: js.Any): js.Any = js.native
  
  /* private */ def toQueryString(params: js.Any): js.Any = js.native
  
  var webAppBaseURL: String = js.native
}

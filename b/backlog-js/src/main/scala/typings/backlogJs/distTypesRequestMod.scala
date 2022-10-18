package typings.backlogJs

import org.scalablytyped.runtime.StringDictionary
import typings.backlogJs.anon.AccessToken
import typings.backlogJs.anon.Method
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRequestMod {
  
  @JSImport("backlog-js/dist/types/request", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Request {
    def this(configure: AccessToken) = this()
  }
  
  type Params = StringDictionary[Double | String | (js.Array[Double | String])]
  
  @js.native
  trait Request extends StObject {
    
    def checkStatus(response: Response): js.Promise[Response] = js.native
    
    /* private */ var configure: Any = js.native
    
    def delete[T](path: String): js.Promise[T] = js.native
    def delete[T](path: String, params: Any): js.Promise[T] = js.native
    
    def get[T](path: String): js.Promise[T] = js.native
    def get[T](path: String, params: Any): js.Promise[T] = js.native
    
    def parseJSON[T](response: Response): js.Promise[T] = js.native
    
    def patch[T](path: String, params: Any): js.Promise[T] = js.native
    
    def post[T](path: String): js.Promise[T] = js.native
    def post[T](path: String, params: Any): js.Promise[T] = js.native
    
    def put[T](path: String, params: Any): js.Promise[T] = js.native
    
    def request(options: Method): js.Promise[Response] = js.native
    
    def restBaseURL: String = js.native
    
    /* private */ var toQueryString: Any = js.native
    
    def webAppBaseURL: String = js.native
  }
}

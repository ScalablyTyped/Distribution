package typings.basicAuth

import typings.node.http2Mod.Http2ServerRequest
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("basic-auth", JSImport.Namespace)
  @js.native
  def apply(req: Http2ServerRequest): js.UndefOr[BasicAuthResult] = js.native
  // See https://github.com/jshttp/basic-auth/blob/v1.1.0/index.js#L49
  @JSImport("basic-auth", JSImport.Namespace)
  @js.native
  def apply(req: IncomingMessage): js.UndefOr[BasicAuthResult] = js.native
  
  /**
    * Parse basic auth to object.
    */
  @JSImport("basic-auth", "parse")
  @js.native
  def parse(authorizationHeader: String): js.UndefOr[BasicAuthResult] = js.native
  
  @js.native
  trait BasicAuthResult extends StObject {
    
    var name: String = js.native
    
    var pass: String = js.native
  }
  object BasicAuthResult {
    
    @scala.inline
    def apply(name: String, pass: String): BasicAuthResult = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicAuthResult]
    }
    
    @scala.inline
    implicit class BasicAuthResultMutableBuilder[Self <: BasicAuthResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}

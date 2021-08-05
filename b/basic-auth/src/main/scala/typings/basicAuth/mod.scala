package typings.basicAuth

import typings.node.http2Mod.Http2ServerRequest
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(req: Http2ServerRequest): js.UndefOr[BasicAuthResult] = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[BasicAuthResult]]
  // See https://github.com/jshttp/basic-auth/blob/v1.1.0/index.js#L49
  inline def apply(req: IncomingMessage): js.UndefOr[BasicAuthResult] = ^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[BasicAuthResult]]
  
  @JSImport("basic-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse basic auth to object.
    */
  inline def parse(authorizationHeader: String): js.UndefOr[BasicAuthResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(authorizationHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[BasicAuthResult]]
  
  trait BasicAuthResult extends StObject {
    
    var name: String
    
    var pass: String
  }
  object BasicAuthResult {
    
    inline def apply(name: String, pass: String): BasicAuthResult = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicAuthResult]
    }
    
    extension [Self <: BasicAuthResult](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
}

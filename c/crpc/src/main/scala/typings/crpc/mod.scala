package typings.crpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(baseUrl: String): Client = ^.asInstanceOf[js.Dynamic].apply(baseUrl.asInstanceOf[js.Any]).asInstanceOf[Client]
  inline def apply(baseUrl: String, options: js.Object): Client = (^.asInstanceOf[js.Dynamic].apply(baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Client]
  
  @JSImport("crpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Client = js.Function3[
    /* path */ String, 
    /* body */ Any, 
    /* options */ js.UndefOr[js.Object | Null], 
    js.Promise[Any]
  ]
}

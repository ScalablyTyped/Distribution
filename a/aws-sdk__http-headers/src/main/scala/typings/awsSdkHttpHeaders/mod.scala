package typings.awsSdkHttpHeaders

import typings.awsSdkHttpHeaders.awsSdkHttpHeadersStrings.Map
import typings.awsSdkTypes.distTypesHttpMod.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/http-headers", "HttpHeaders")
  @js.native
  open class HttpHeaders ()
    extends StObject
       with Headers {
    def this(entries: js.Iterable[js.Tuple2[String, String]]) = this()
    
    /* private */ @JSName("clone")
    var clone_FHttpHeaders: Any = js.native
    
    /* private */ var originalHeaders: Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_HttpHeaders: Map = js.native
  }
}

package typings.cucumberCucumber

import typings.node.bufferMod.global.BufferEncoding
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPublishHttpStreamMod {
  
  @JSImport("@cucumber/cucumber/lib/publish/http_stream", JSImport.Default)
  @js.native
  open class default protected () extends HttpStream {
    def this(url: String, method: HttpMethod, headers: OutgoingHttpHeaders) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cucumberCucumber.cucumberCucumberStrings.GET
    - typings.cucumberCucumber.cucumberCucumberStrings.POST
    - typings.cucumberCucumber.cucumberCucumberStrings.PUT
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def GET: typings.cucumberCucumber.cucumberCucumberStrings.GET = "GET".asInstanceOf[typings.cucumberCucumber.cucumberCucumberStrings.GET]
    
    inline def POST: typings.cucumberCucumber.cucumberCucumberStrings.POST = "POST".asInstanceOf[typings.cucumberCucumber.cucumberCucumberStrings.POST]
    
    inline def PUT: typings.cucumberCucumber.cucumberCucumberStrings.PUT = "PUT".asInstanceOf[typings.cucumberCucumber.cucumberCucumberStrings.PUT]
  }
  
  @js.native
  trait HttpStream extends Transform {
    
    def _final(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def _write(
      chunk: Any,
      encoding: BufferEncoding,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    /* private */ var emitErrorUnlessHttp2xx: Any = js.native
    
    /* private */ val headers: Any = js.native
    
    /* private */ val method: Any = js.native
    
    /* private */ var pushResponseBody: Any = js.native
    
    /* private */ var sendHttpRequest: Any = js.native
    
    /* private */ var tempFile: Any = js.native
    
    /* private */ var tempFilePath: Any = js.native
    
    /* private */ val url: Any = js.native
  }
}

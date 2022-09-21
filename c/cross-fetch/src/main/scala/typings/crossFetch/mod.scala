package typings.crossFetch

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cross-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(input: RequestInfo): js.Promise[typings.std.Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Response]]
    inline def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Response]]
    inline def apply(input: URL): js.Promise[typings.std.Response] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Response]]
    inline def apply(input: URL, init: RequestInit): js.Promise[typings.std.Response] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Response]]
    
    @JSImport("cross-fetch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  @JSImport("cross-fetch", "Headers")
  @js.native
  val Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Headers */ Any = js.native
  
  @JSImport("cross-fetch", "Request")
  @js.native
  val Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Request */ Any = js.native
  
  object Response {
    
    @JSImport("cross-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard dom */
    inline def error(): typings.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.std.Response]
    
    /* standard dom */
    inline def redirect(url: String): typings.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.std.Response]
    inline def redirect(url: String, status: Double): typings.std.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.std.Response]
    inline def redirect(url: URL): typings.std.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[typings.std.Response]
    inline def redirect(url: URL, status: Double): typings.std.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.std.Response]
  }
  
  inline def fetch(input: RequestInfo): js.Promise[typings.std.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Response]]
  inline def fetch(input: URL): js.Promise[typings.std.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.std.Response]]
  inline def fetch(input: URL, init: RequestInit): js.Promise[typings.std.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.std.Response]]
}

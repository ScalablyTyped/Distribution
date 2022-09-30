package typings.crossFetch

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* was `typeof Response` */
  object Response {
    
    @JSGlobal("_Response")
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
  
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo): js.Promise[Response] = js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: URL): js.Promise[Response] = js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  /* was `typeof fetch` */
  inline def fetch(input: URL, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("_fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}

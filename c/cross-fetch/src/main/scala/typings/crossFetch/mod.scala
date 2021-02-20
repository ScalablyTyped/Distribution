package typings.crossFetch

import typings.std.RequestInfo
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("cross-fetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
    @JSImport("cross-fetch", JSImport.Default)
    @js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
  }
  
  @JSImport("cross-fetch", "Headers")
  @js.native
  val Headers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Headers */ js.Any = js.native
  
  @JSImport("cross-fetch", "Request")
  @js.native
  val Request: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _Request */ js.Any = js.native
  
  object Response {
    
    @JSImport("cross-fetch", "Response.error")
    @js.native
    def error(): typings.std.Response = js.native
    
    @JSImport("cross-fetch", "Response.redirect")
    @js.native
    def redirect(url: String): typings.std.Response = js.native
    @JSImport("cross-fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typings.std.Response = js.native
  }
  
  @JSImport("cross-fetch", "fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[typings.std.Response] = js.native
  @JSImport("cross-fetch", "fetch")
  @js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
}

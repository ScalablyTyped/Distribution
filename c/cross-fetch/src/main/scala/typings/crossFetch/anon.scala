package typings.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BodyInit
import typings.std.Headers
import typings.std.HeadersInit
import typings.std.Request
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Error
    extends Instantiable0[Response]
       with Instantiable1[/* body */ BodyInit, Response]
       with Instantiable2[
          js.UndefOr[(/* body */ BodyInit) | (/* body */ Null)], 
          /* init */ ResponseInit, 
          Response
        ] {
    
    def error(): Response = js.native
    
    def redirect(url: String): Response = js.native
    def redirect(url: String, status: Double): Response = js.native
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* input */ RequestInfo, Request]
       with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, Request]
  
  @js.native
  trait InstantiableHeaders
    extends Instantiable0[Headers]
       with Instantiable1[/* init */ HeadersInit, Headers]
}

package typings.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.crossFetch.anon.Error
import typings.crossFetch.anon.Instantiable
import typings.crossFetch.anon.InstantiableHeaders
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Headers ()
    extends typings.std.Headers {
    def this(init: HeadersInit) = this()
  }
  @js.native
  object Headers
    extends TopLevel[InstantiableHeaders with Instantiable0[typings.std.global.Headers]]
  
  @js.native
  class Request protected ()
    extends typings.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  @js.native
  object Request
    extends TopLevel[
          Instantiable with (Instantiable1[/* input */ RequestInfo, typings.std.global.Request])
        ]
  
  @js.native
  class Response ()
    extends typings.std.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  @js.native
  object Response
    extends TopLevel[Error with Instantiable0[typings.std.global.Response]]
  
  @js.native
  object default extends js.Object {
    
    def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    
    def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
  }
}

package typings.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.crossFetch.anon.Error
import typings.crossFetch.anon.Instantiable
import typings.crossFetch.anon.InstantiableHeaders
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
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class headers () extends Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class req protected () extends Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class res () extends Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  
  @js.native
  object fet extends js.Object {
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  object headers
    extends TopLevel[InstantiableHeaders with Instantiable0[typings.std.global.Headers]]
  
  @js.native
  object req
    extends TopLevel[
          Instantiable with (Instantiable1[/* input */ RequestInfo, typings.std.global.Request])
        ]
  
  @js.native
  object res
    extends TopLevel[Error with Instantiable0[typings.std.global.Response]]
  
}


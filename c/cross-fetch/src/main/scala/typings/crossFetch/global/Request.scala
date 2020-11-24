package typings.crossFetch.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.crossFetch.anon.Instantiable
import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_Request")
@js.native
class Request protected ()
  extends typings.std.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}
@JSGlobal("_Request")
@js.native
object Request
  extends TopLevel[
      Instantiable with (Instantiable1[/* input */ RequestInfo, typings.std.global.Request])
    ]

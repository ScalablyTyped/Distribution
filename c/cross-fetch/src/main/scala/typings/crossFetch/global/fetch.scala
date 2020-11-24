package typings.crossFetch.global

import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_fetch")
@js.native
object fetch extends js.Object {
  
  def apply(input: RequestInfo): js.Promise[typings.std.Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.std.Response] = js.native
}

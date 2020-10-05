package typings.d3.mod

import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "json")
@js.native
object json extends js.Object {
  def apply[ParsedJSONObject /* <: js.Any */](url: String): js.Promise[ParsedJSONObject] = js.native
  def apply[ParsedJSONObject /* <: js.Any */](url: String, init: RequestInit): js.Promise[ParsedJSONObject] = js.native
}


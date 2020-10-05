package typings.d3.mod

import typings.std.ArrayBuffer
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "buffer")
@js.native
object buffer extends js.Object {
  def apply(url: String): js.Promise[ArrayBuffer] = js.native
  def apply(url: String, init: RequestInit): js.Promise[ArrayBuffer] = js.native
}


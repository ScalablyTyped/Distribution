package typings.d3.d3Mod

import typings.std.Blob
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "blob")
@js.native
object blob extends js.Object {
  def apply(url: String): js.Promise[Blob] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Blob] = js.native
}


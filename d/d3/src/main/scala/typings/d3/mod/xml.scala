package typings.d3.mod

import typings.std.RequestInit
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "xml")
@js.native
object xml extends js.Object {
  def apply(url: String): js.Promise[XMLDocument] = js.native
  def apply(url: String, init: RequestInit): js.Promise[XMLDocument] = js.native
}


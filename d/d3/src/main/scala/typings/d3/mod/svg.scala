package typings.d3.mod

import typings.std.Document
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "svg")
@js.native
object svg extends js.Object {
  def apply(url: String): js.Promise[Document] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Document] = js.native
}


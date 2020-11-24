package typings.d3.mod

import typings.std.Document
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "html")
@js.native
object html extends js.Object {
  
  def apply(url: String): js.Promise[Document] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Document] = js.native
}

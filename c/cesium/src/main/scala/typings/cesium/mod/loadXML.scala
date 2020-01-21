package typings.cesium.mod

import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "loadXML")
@js.native
object loadXML extends js.Object {
  def apply(url: String): js.Promise[XMLDocument] = js.native
  def apply(url: String, headers: js.Any): js.Promise[XMLDocument] = js.native
  def apply(url: js.Promise[String]): js.Promise[XMLDocument] = js.native
  def apply(url: js.Promise[String], headers: js.Any): js.Promise[XMLDocument] = js.native
}


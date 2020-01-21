package typings.cesium.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "loadArrayBuffer")
@js.native
object loadArrayBuffer extends js.Object {
  def apply(url: String): js.Promise[ArrayBuffer] = js.native
  def apply(url: String, headers: js.Any): js.Promise[ArrayBuffer] = js.native
  def apply(url: js.Promise[String]): js.Promise[ArrayBuffer] = js.native
  def apply(url: js.Promise[String], headers: js.Any): js.Promise[ArrayBuffer] = js.native
}


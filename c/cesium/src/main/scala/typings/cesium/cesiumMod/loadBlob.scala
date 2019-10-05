package typings.cesium.cesiumMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "loadBlob")
@js.native
object loadBlob extends js.Object {
  def apply(url: String): js.Promise[Blob] = js.native
  def apply(url: String, headers: js.Any): js.Promise[Blob] = js.native
  def apply(url: js.Promise[String]): js.Promise[Blob] = js.native
  def apply(url: js.Promise[String], headers: js.Any): js.Promise[Blob] = js.native
}


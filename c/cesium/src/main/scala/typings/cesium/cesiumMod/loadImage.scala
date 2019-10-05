package typings.cesium.cesiumMod

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "loadImage")
@js.native
object loadImage extends js.Object {
  def apply(url: String): js.Promise[HTMLImageElement] = js.native
  def apply(url: String, allowCrossOrigin: Boolean): js.Promise[HTMLImageElement] = js.native
  def apply(url: js.Promise[String]): js.Promise[HTMLImageElement] = js.native
  def apply(url: js.Promise[String], allowCrossOrigin: Boolean): js.Promise[HTMLImageElement] = js.native
}


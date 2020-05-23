package typings.cesium.mod

import typings.cesium.anon.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "SkyBox")
@js.native
class SkyBox protected () extends js.Object {
  def this(options: Sources) = this()
  var show: Boolean = js.native
  var sources: js.Any = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}


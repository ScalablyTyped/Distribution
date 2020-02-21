package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Cesium3DTileFeature")
@js.native
class Cesium3DTileFeature () extends js.Object {
  var color: Color = js.native
  val primitive: Cesium3DTileset = js.native
  var show: Boolean = js.native
  val tileset: Cesium3DTileset = js.native
  def getProperty(name: String): js.Any = js.native
  def getPropertyNames(results: js.Array[String]): js.Array[String] = js.native
  def hasProperty(name: String): Boolean = js.native
  def setProperty(name: String, value: js.Any): Unit = js.native
}


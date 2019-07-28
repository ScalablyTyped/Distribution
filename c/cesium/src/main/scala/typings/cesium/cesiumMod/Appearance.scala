package typings.cesium.cesiumMod

import typings.cesium.Anon_Closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Appearance")
@js.native
class Appearance () extends js.Object {
  def this(options: Anon_Closed) = this()
  val closed: Boolean = js.native
  val fragmentShaderSource: String = js.native
  var material: Material = js.native
  val renderState: js.Any = js.native
  var translucent: Boolean = js.native
  val vertexShaderSource: String = js.native
  def getFragmentShaderSource(): String = js.native
  def getRenderState(): js.Any = js.native
  def isTranslucent(): Boolean = js.native
}


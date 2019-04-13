package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Appearance")
@js.native
class Appearance () extends js.Object {
  def this(options: cesiumLib.Anon_Closed) = this()
  val closed: scala.Boolean = js.native
  val fragmentShaderSource: java.lang.String = js.native
  var material: Material = js.native
  val renderState: js.Any = js.native
  var translucent: scala.Boolean = js.native
  val vertexShaderSource: java.lang.String = js.native
  def getFragmentShaderSource(): java.lang.String = js.native
  def getRenderState(): js.Any = js.native
  def isTranslucent(): scala.Boolean = js.native
}


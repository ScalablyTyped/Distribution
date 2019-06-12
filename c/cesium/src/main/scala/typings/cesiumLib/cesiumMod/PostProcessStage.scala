package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PostProcessStage")
@js.native
class PostProcessStage () extends js.Object {
  def this(options: cesiumLib.Anon_ClearColor) = this()
  val clearColor: Color = js.native
  var enabled: scala.Boolean = js.native
  val forcePowerOfTwo: scala.Boolean = js.native
  val fragmentShader: java.lang.String = js.native
  val name: java.lang.String = js.native
  val pixelFormat: PixelFormat = js.native
  val ready: scala.Boolean = js.native
  val scissorRectangle: BoundingRectangle = js.native
  var selected: js.Array[_] = js.native
  val textureScale: scala.Double = js.native
  val uniforms: js.Object = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
}


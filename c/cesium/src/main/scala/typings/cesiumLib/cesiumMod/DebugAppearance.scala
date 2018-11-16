package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "DebugAppearance")
@js.native
class DebugAppearance protected ()
  extends cesiumLib.cesiumMod.CesiumNs.DebugAppearance {
  def this(options: cesiumLib.Anon_VertexShaderSourceAttributeName) = this()
  /* CompleteClass */
  override val attributeName: java.lang.String = js.native
  /* CompleteClass */
  override val closed: scala.Boolean = js.native
  /* CompleteClass */
  override val fragmentShaderSource: java.lang.String = js.native
  /* CompleteClass */
  override val glslDatatype: java.lang.String = js.native
  /* CompleteClass */
  override var material: cesiumLib.cesiumMod.CesiumNs.Material = js.native
  /* CompleteClass */
  override val renderState: js.Any = js.native
  /* CompleteClass */
  override var translucent: scala.Boolean = js.native
  /* CompleteClass */
  override val vertexShaderSource: java.lang.String = js.native
  /* CompleteClass */
  override def getFragmentShaderSource(): java.lang.String = js.native
  /* CompleteClass */
  override def getRenderState(): js.Any = js.native
  /* CompleteClass */
  override def isTranslucent(): scala.Boolean = js.native
}


package typings.cesium.mod

import typings.cesium.anon.Far
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerspectiveFrustum")
@js.native
class PerspectiveFrustum () extends Frustum {
  def this(options: Far) = this()
  
  var aspectRatio: Double = js.native
  
  def clone(result: PerspectiveFrustum): PerspectiveFrustum = js.native
  
  def equals(): Boolean = js.native
  def equals(other: PerspectiveFrustum): Boolean = js.native
  
  var fov: Double = js.native
  
  val fovy: Double = js.native
  
  val infiniteProjectionMatrix: Matrix4 = js.native
  
  def pack(value: PerspectiveFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def unpack(array: js.Array[Double], startingIndex: Double, result: PerspectiveFrustum): PerspectiveFrustum = js.native
  
  var xOffset: Double = js.native
  
  var yOffset: Double = js.native
}
object PerspectiveFrustum {
  
  @JSImport("cesium", "PerspectiveFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "PerspectiveFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  inline def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
}

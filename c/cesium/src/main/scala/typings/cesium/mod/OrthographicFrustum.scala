package typings.cesium.mod

import typings.cesium.anon.AspectRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "OrthographicFrustum")
@js.native
class OrthographicFrustum () extends Frustum {
  def this(options: AspectRatio) = this()
  
  var aspectRatio: Double = js.native
  
  def clone(result: OrthographicFrustum): OrthographicFrustum = js.native
  
  def equals(): Boolean = js.native
  def equals(other: OrthographicFrustum): Boolean = js.native
  
  def pack(value: OrthographicFrustum, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  def unpack(array: js.Array[Double], startingIndex: Double, result: OrthographicFrustum): OrthographicFrustum = js.native
  
  var width: Double = js.native
}
object OrthographicFrustum {
  
  @JSImport("cesium", "OrthographicFrustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "OrthographicFrustum.packedLength")
  @js.native
  def packedLength: Double = js.native
  @scala.inline
  def packedLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("packedLength")(x.asInstanceOf[js.Any])
}

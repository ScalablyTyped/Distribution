package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Frustum")
@js.native
abstract class Frustum () extends StObject {
  
  def computeCullingVolume(position: Cartesian3, direction: Cartesian3, up: Cartesian3): CullingVolume = js.native
  
  var far: Double = js.native
  
  def getPixelDimensions(
    drawingBufferWidth: Double,
    drawingBufferHeight: Double,
    distance: Double,
    pixelRatio: Double,
    result: Cartesian2
  ): Cartesian2 = js.native
  
  var near: Double = js.native
  
  val projectionMatrix: Matrix4 = js.native
}

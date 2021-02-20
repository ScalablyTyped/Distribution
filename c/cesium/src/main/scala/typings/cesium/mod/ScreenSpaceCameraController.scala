package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ScreenSpaceCameraController")
@js.native
class ScreenSpaceCameraController protected () extends StObject {
  def this(scene: Scene) = this()
  
  var bounceAnimationTime: Double = js.native
  
  def destroy(): Unit = js.native
  
  var enableCollisionDetection: Boolean = js.native
  
  var enableInputs: Boolean = js.native
  
  var enableLook: Boolean = js.native
  
  var enableRotate: Boolean = js.native
  
  var enableTilt: Boolean = js.native
  
  var enableTranslate: Boolean = js.native
  
  var enableZoom: Boolean = js.native
  
  var inertiaSpin: Double = js.native
  
  var inertiaTranslate: Double = js.native
  
  var inertiaZoom: Double = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var lookEventTypes: CameraEventType | js.Array[_] = js.native
  
  var maximumMovementRatio: Double = js.native
  
  var maximumZoomDistance: Double = js.native
  
  var minimumCollisionTerrainHeight: Double = js.native
  
  var minimumPickingTerrainHeight: Double = js.native
  
  var minimumTrackBallHeight: Double = js.native
  
  var minimumZoomDistance: Double = js.native
  
  var rotateEventTypes: CameraEventType | js.Array[_] = js.native
  
  var tiltEventTypes: CameraEventType | js.Array[_] = js.native
  
  var translateEventTypes: CameraEventType | js.Array[_] = js.native
  
  var zoomEventTypes: CameraEventType | js.Array[_] = js.native
}

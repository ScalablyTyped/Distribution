package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ScreenSpaceCameraController")
@js.native
open class ScreenSpaceCameraController protected () extends StObject {
  def this(scene: Scene) = this()
  
  /**
    * Sets the duration, in seconds, of the bounce back animations in 2D and Columbus view.
    */
  var bounceAnimationTime: Double = js.native
  
  /**
    * Removes mouse listeners held by this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * controller = controller && controller.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * When disabled, the values of <code>maximumZoomDistance</code> and <code>minimumZoomDistance</code> are ignored.
    */
  var enableCollisionDetection: Boolean = js.native
  
  /**
    * If true, inputs are allowed conditionally with the flags enableTranslate, enableZoom,
    * enableRotate, enableTilt, and enableLook.  If false, all inputs are disabled.
    *
    * NOTE: This setting is for temporary use cases, such as camera flights and
    * drag-selection of regions (see Picking demo).  It is typically set to false at the
    * start of such events, and set true on completion.  To keep inputs disabled
    * past the end of camera flights, you must use the other booleans (enableTranslate,
    * enableZoom, enableRotate, enableTilt, and enableLook).
    */
  var enableInputs: Boolean = js.native
  
  /**
    * If true, allows the user to use free-look. If false, the camera view direction can only be changed through translating
    * or rotating. This flag only applies in 3D and Columbus view modes.
    */
  var enableLook: Boolean = js.native
  
  /**
    * If true, allows the user to rotate the world which translates the user's position.
    * This flag only applies in 2D and 3D.
    */
  var enableRotate: Boolean = js.native
  
  /**
    * If true, allows the user to tilt the camera.  If false, the camera is locked to the current heading.
    * This flag only applies in 3D and Columbus view.
    */
  var enableTilt: Boolean = js.native
  
  /**
    * If true, allows the user to pan around the map.  If false, the camera stays locked at the current position.
    * This flag only applies in 2D and Columbus view modes.
    */
  var enableTranslate: Boolean = js.native
  
  /**
    * If true, allows the user to zoom in and out.  If false, the camera is locked to the current distance from the ellipsoid.
    */
  var enableZoom: Boolean = js.native
  
  /**
    * A parameter in the range <code>[0, 1)</code> used to determine how long
    * the camera will continue to spin because of inertia.
    * With value of zero, the camera will have no inertia.
    */
  var inertiaSpin: Double = js.native
  
  /**
    * A parameter in the range <code>[0, 1)</code> used to determine how long
    * the camera will continue to translate because of inertia.
    * With value of zero, the camera will have no inertia.
    */
  var inertiaTranslate: Double = js.native
  
  /**
    * A parameter in the range <code>[0, 1)</code> used to determine how long
    * the camera will continue to zoom because of inertia.
    * With value of zero, the camera will have no inertia.
    */
  var inertiaZoom: Double = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * The input that allows the user to change the direction the camera is viewing. This only applies in 3D and Columbus view modes.
    * <p>
    * The type came be a {@link CameraEventType}, <code>undefined</code>, an object with <code>eventType</code>
    * and <code>modifier</code> properties with types <code>CameraEventType</code> and {@link KeyboardEventModifier},
    * or an array of any of the preceding.
    * </p>
    */
  var lookEventTypes: js.UndefOr[CameraEventType | js.Array[Any]] = js.native
  
  /**
    * A parameter in the range <code>[0, 1)</code> used to limit the range
    * of various user inputs to a percentage of the window width/height per animation frame.
    * This helps keep the camera under control in low-frame-rate situations.
    */
  var maximumMovementRatio: Double = js.native
  
  /**
    * The maximum magnitude, in meters, of the camera position when zooming. Defaults to positive infinity.
    */
  var maximumZoomDistance: Double = js.native
  
  /**
    * The minimum height the camera must be before testing for collision with terrain.
    */
  var minimumCollisionTerrainHeight: Double = js.native
  
  /**
    * The minimum distance the camera must be before testing for collision with terrain when zoom with inertia.
    */
  var minimumPickingTerrainDistanceWithInertia: Double = js.native
  
  /**
    * The minimum height the camera must be before picking the terrain or scene content instead of the ellipsoid.
    */
  var minimumPickingTerrainHeight: Double = js.native
  
  /**
    * The minimum height the camera must be before switching from rotating a track ball to
    * free look when clicks originate on the sky or in space.
    */
  var minimumTrackBallHeight: Double = js.native
  
  /**
    * The minimum magnitude, in meters, of the camera position when zooming. Defaults to 1.0.
    */
  var minimumZoomDistance: Double = js.native
  
  /**
    * The input that allows the user to rotate around the globe or another object. This only applies in 3D and Columbus view modes.
    * <p>
    * The type came be a {@link CameraEventType}, <code>undefined</code>, an object with <code>eventType</code>
    * and <code>modifier</code> properties with types <code>CameraEventType</code> and {@link KeyboardEventModifier},
    * or an array of any of the preceding.
    * </p>
    */
  var rotateEventTypes: js.UndefOr[CameraEventType | js.Array[Any]] = js.native
  
  /**
    * The input that allows the user to tilt in 3D and Columbus view or twist in 2D.
    * <p>
    * The type came be a {@link CameraEventType}, <code>undefined</code>, an object with <code>eventType</code>
    * and <code>modifier</code> properties with types <code>CameraEventType</code> and {@link KeyboardEventModifier},
    * or an array of any of the preceding.
    * </p>
    */
  var tiltEventTypes: js.UndefOr[CameraEventType | js.Array[Any]] = js.native
  
  /**
    * The input that allows the user to pan around the map. This only applies in 2D and Columbus view modes.
    * <p>
    * The type came be a {@link CameraEventType}, <code>undefined</code>, an object with <code>eventType</code>
    * and <code>modifier</code> properties with types <code>CameraEventType</code> and {@link KeyboardEventModifier},
    * or an array of any of the preceding.
    * </p>
    */
  var translateEventTypes: js.UndefOr[CameraEventType | js.Array[Any]] = js.native
  
  /**
    * The input that allows the user to zoom in/out.
    * <p>
    * The type came be a {@link CameraEventType}, <code>undefined</code>, an object with <code>eventType</code>
    * and <code>modifier</code> properties with types <code>CameraEventType</code> and {@link KeyboardEventModifier},
    * or an array of any of the preceding.
    * </p>
    */
  var zoomEventTypes: js.UndefOr[CameraEventType | js.Array[Any]] = js.native
}

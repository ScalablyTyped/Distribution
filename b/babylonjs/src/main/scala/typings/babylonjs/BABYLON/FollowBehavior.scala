package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowBehavior
  extends StObject
     with Behavior[TransformNode] {
  
  /* private */ var _addObservables: Any = js.native
  
  /* private */ var _angleBetweenVectorAndPlane: Any = js.native
  
  /* private */ var _angularClamp: Any = js.native
  
  /* private */ var _applyPitchOffset: Any = js.native
  
  /* private */ var _applyVerticalClamp: Any = js.native
  
  /* private */ var _distanceClamp: Any = js.native
  
  /**
    * Enables/disables the behavior
    * @internal
    */
  var _enabled: Boolean = js.native
  
  /* private */ var _followedCamera: Any = js.native
  
  /* private */ var _lastTick: Any = js.native
  
  /* private */ var _length2D: Any = js.native
  
  /* private */ var _onBeforeRender: Any = js.native
  
  /* private */ var _orientationClamp: Any = js.native
  
  /* private */ var _passedOrientationDeadzone: Any = js.native
  
  /* private */ var _recenterNextUpdate: Any = js.native
  
  /* private */ var _removeObservables: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _tmpForward: Any = js.native
  
  /* private */ var _tmpInvertView: Any = js.native
  
  /* private */ var _tmpMatrix: Any = js.native
  
  /* private */ var _tmpNodeForward: Any = js.native
  
  /* private */ var _tmpPosition: Any = js.native
  
  /* private */ var _tmpQuaternion: Any = js.native
  
  /* private */ var _tmpVectors: Any = js.native
  
  /* private */ var _toOrientationQuatToRef: Any = js.native
  
  /* private */ var _updateLeashing: Any = js.native
  
  /* private */ var _updateTransformToGoal: Any = js.native
  
  /* private */ var _workingPosition: Any = js.native
  
  /* private */ var _workingQuaternion: Any = js.native
  
  def attach(ownerNode: TransformNode, followedCamera: Camera): Unit = js.native
  
  /**
    * Attached node of this behavior
    */
  var attachedNode: Nullable[TransformNode] = js.native
  
  /**
    *  Default distance from eye to attached node, i.e. the sphere radius
    */
  var defaultDistance: Double = js.native
  
  /**
    * Fixed vertical position offset distance.
    */
  var fixedVerticalOffset: Double = js.native
  
  /**
    * The camera that should be followed by this behavior
    */
  def followedCamera: Nullable[Camera] = js.native
  def followedCamera_=(camera: Nullable[Camera]): Unit = js.native
  
  /**
    * Option to ignore angle clamping
    */
  var ignoreAngleClamp: Boolean = js.native
  
  /**
    * If the behavior should ignore the pitch and roll of the camera.
    */
  var ignoreCameraPitchAndRoll: Boolean = js.native
  
  /**
    * Option to ignore distance clamping
    */
  var ignoreDistanceClamp: Boolean = js.native
  
  /**
    * Set to false if the node should strictly follow the camera without any interpolation time
    */
  var interpolatePose: Boolean = js.native
  
  /**
    * Rate of interpolation of position and rotation of the attached node.
    * Higher values will give a slower interpolation.
    */
  var lerpTime: Double = js.native
  
  /**
    * The horizontal angle from the camera forward axis to the owner will not exceed this value
    */
  var maxViewHorizontalDegrees: Double = js.native
  
  /**
    * The vertical angle from the camera forward axis to the owner will not exceed this value
    */
  var maxViewVerticalDegrees: Double = js.native
  
  /**
    *  Max distance from eye to attached node, i.e. the sphere radius
    */
  var maximumDistance: Double = js.native
  
  /**
    *  Min distance from eye to attached node, i.e. the sphere radius
    */
  var minimumDistance: Double = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MFollowBehavior: String = js.native
  
  /**
    * The attached node will not reorient until the angle between its forward vector and the vector to the camera is greater than this value
    */
  var orientToCameraDeadzoneDegrees: Double = js.native
  
  /**
    * Pitch offset from camera (relative to Max Distance)
    * Is only effective if `ignoreCameraPitchAndRoll` is set to `true`.
    */
  var pitchOffset: Double = js.native
  
  /**
    * Recenters the attached node in front of the camera on the next update
    */
  def recenter(): Unit = js.native
  
  /**
    * Ignore vertical movement and lock the Y position of the object.
    */
  var useFixedVerticalOffset: Boolean = js.native
  
  /**
    * Max vertical distance between the attachedNode and camera
    */
  var verticalMaxDistance: Double = js.native
}

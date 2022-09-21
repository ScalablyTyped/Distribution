package typings.babylonjs.BABYLON

import typings.babylonjs.XRHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandConstraintBehavior
  extends StObject
     with Behavior[TransformNode] {
  
  /* private */ var _eyeTracking: Any = js.native
  
  /* private */ var _getHandPose: Any = js.native
  
  /* private */ var _handTracking: Any = js.native
  
  /* private */ var _node: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _sceneRenderObserver: Any = js.native
  
  /* private */ var _setVisibility: Any = js.native
  
  /* private */ var _zoneAxis: Any = js.native
  
  /** Disable the behavior */
  def disable(): Unit = js.native
  
  /** Enable the behavior */
  def enable(): Unit = js.native
  
  /**
    * The radius in meters around the center of the hand that the user must gaze inside for the attached node to be enabled and appear.
    * Used with HandConstraintVisibility.GAZE_FOCUS
    */
  var gazeProximityRadius: Double = js.native
  
  /**
    * Sets the HandConstraintVisibility level for the hand constraint
    */
  var handConstraintVisibility: HandConstraintVisibility = js.native
  
  /**
    * Set the hand this behavior should follow. If set to "none", it will follow any visible hand (prioritising the left one).
    */
  var handedness: XRHandedness = js.native
  
  /**
    * Rate of interpolation of position and rotation of the attached node.
    * Higher values will give a slower interpolation.
    */
  var lerpTime: Double = js.native
  
  /**
    * Links the behavior to the XR experience in which to retrieve hand transform information.
    * @param xr xr experience
    */
  def linkToXRExperience(xr: WebXRExperienceHelper): Unit = js.native
  
  /** gets or sets behavior's name */
  @JSName("name")
  def name_MHandConstraintBehavior: String = js.native
  
  /**
    * Orientation mode of the node attached to this behavior
    */
  var nodeOrientationMode: HandConstraintOrientation = js.native
  
  /**
    * A number from 0.0 to 1.0, marking how restricted the direction the palm faces is for the attached node to be enabled.
    * A 1 means the palm must be directly facing the user before the node is enabled, a 0 means it is always enabled.
    * Used with HandConstraintVisibility.PALM_UP
    */
  var palmUpStrictness: Double = js.native
  
  /**
    * Offset distance from the hand in meters
    */
  var targetOffset: Double = js.native
  
  /**
    * Where to place the node regarding the center of the hand.
    */
  var targetZone: HandConstraintZone = js.native
  
  /**
    * Orientation mode of the 4 zones around the hand
    */
  var zoneOrientationMode: HandConstraintOrientation = js.native
}

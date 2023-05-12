package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoneIKController extends StObject {
  
  /* private */ var _adjustRoll: Any = js.native
  
  /* private */ var _bendAxis: Any = js.native
  
  /* private */ var _bone1: Any = js.native
  
  /* private */ var _bone1Length: Any = js.native
  
  /* private */ var _bone1Mat: Any = js.native
  
  /* private */ var _bone1Quat: Any = js.native
  
  /* private */ var _bone2: Any = js.native
  
  /* private */ var _bone2Ang: Any = js.native
  
  /* private */ var _bone2Length: Any = js.native
  
  /* private */ var _maxAngle: Any = js.native
  
  /* private */ var _maxReach: Any = js.native
  
  /* private */ var _notEnoughInformation: Any = js.native
  
  /* private */ var _rightHandedSystem: Any = js.native
  
  /* private */ var _setMaxAngle: Any = js.native
  
  /* private */ var _slerping: Any = js.native
  
  /* private */ var _updateLinkedTransformRotation: Any = js.native
  
  /**
    * Gets or sets maximum allowed angle
    */
  def maxAngle: Double = js.native
  def maxAngle_=(value: Double): Unit = js.native
  
  /**
    * Gets or sets the TransformNode associated with the controller
    * Name kept as mesh for back compatibility
    */
  var mesh: TransformNode = js.native
  
  /**
    * Gets or sets the pole angle
    */
  var poleAngle: Double = js.native
  
  /**
    * Gets or sets the bone used as pole
    */
  var poleTargetBone: Nullable[Bone] = js.native
  
  /**
    * Gets or sets the pole target local offset
    */
  var poleTargetLocalOffset: Vector3 = js.native
  
  /** Gets or sets the mesh used as pole */
  var poleTargetMesh: TransformNode = js.native
  
  /**
    * Gets or sets the pole target position
    */
  var poleTargetPosition: Vector3 = js.native
  
  /**
    * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp)
    */
  var slerpAmount: Double = js.native
  
  /**
    * Gets or sets the target TransformNode
    * Name kept as mesh for back compatibility
    */
  var targetMesh: TransformNode = js.native
  
  /**
    * Gets or sets the target position
    */
  var targetPosition: Vector3 = js.native
  
  /**
    * Force the controller to update the bones
    */
  def update(): Unit = js.native
}

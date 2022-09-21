package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AttachToBoxBehavior")
@js.native
open class AttachToBoxBehavior protected ()
  extends StObject
     with typings.babylonjs.BABYLON.AttachToBoxBehavior {
  /**
    * Creates the AttachToBoxBehavior, used to attach UI to the closest face of the box to a camera
    * @param _ui The transform node that should be attached to the mesh
    */
  def this(_ui: typings.babylonjs.BABYLON.TransformNode) = this()
  
  /* private */ /* CompleteClass */
  var _closestFace: Any = js.native
  
  /* private */ /* CompleteClass */
  var _faceVectors: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lookAtTmpMatrix: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lookAtToRef: Any = js.native
  
  /* private */ /* CompleteClass */
  var _onRenderObserver: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /* private */ /* CompleteClass */
  var _target: Any = js.native
  
  /* private */ /* CompleteClass */
  var _tmpMatrix: Any = js.native
  
  /* private */ /* CompleteClass */
  var _tmpVector: Any = js.native
  
  /* private */ /* CompleteClass */
  var _ui: Any = js.native
  
  /* private */ /* CompleteClass */
  var _zeroVector: Any = js.native
  
  /**
    * Called when the behavior is attached to a target
    * @param target defines the target where the behavior is attached to
    */
  /* CompleteClass */
  override def attach(target: typings.babylonjs.BABYLON.Mesh): Unit = js.native
  
  /**
    * Called when the behavior is detached from its target
    */
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /**
    * The distance from the bottom of the face that the UI should be attached to (default: 0.15)
    */
  /* CompleteClass */
  var distanceAwayFromBottomOfFace: Double = js.native
  
  /**
    * The distance away from the face of the mesh that the UI should be attached to (default: 0.15)
    */
  /* CompleteClass */
  var distanceAwayFromFace: Double = js.native
  
  /**
    * Function called when the behavior needs to be initialized (after attaching it to a target)
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  
  /** gets or sets behavior's name */
  /* CompleteClass */
  var name: String = js.native
}

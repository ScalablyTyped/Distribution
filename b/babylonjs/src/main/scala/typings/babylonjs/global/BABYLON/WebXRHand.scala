package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRHand")
@js.native
class WebXRHand protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXRHand {
  /**
    * Construct a new hand object
    * @param xrController the controller to which the hand correlates
    * @param trackedMeshes the meshes to be used to track the hand joints
    * @param _handMesh an optional hand mesh. if not provided, ours will be used
    * @param _rigMapping an optional rig mapping for the hand mesh. if not provided, ours will be used
    * @param disableDefaultHandMesh should the default mesh creation be disabled
    */
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: typings.babylonjs.BABYLON.AbstractMesh
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: Unit,
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: typings.babylonjs.BABYLON.AbstractMesh,
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: Unit,
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: Unit,
    _rigMapping: Unit,
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: typings.babylonjs.BABYLON.AbstractMesh,
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.BABYLON.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    _handMesh: typings.babylonjs.BABYLON.AbstractMesh,
    _rigMapping: Unit,
    disableDefaultHandMesh: Boolean
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

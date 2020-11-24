package typings.babylonjs.featuresIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/index", "WebXRHand")
@js.native
class WebXRHand protected ()
  extends typings.babylonjs.webXRHandTrackingMod.WebXRHand {
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
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.UndefOr[scala.Nothing],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.UndefOr[scala.Nothing],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
}

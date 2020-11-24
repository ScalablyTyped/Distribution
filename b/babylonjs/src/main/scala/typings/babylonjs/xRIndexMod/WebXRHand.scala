package typings.babylonjs.xRIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRHand")
@js.native
class WebXRHand protected ()
  extends typings.babylonjs.featuresIndexMod.WebXRHand {
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
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.Array[String]
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.UndefOr[scala.Nothing],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: js.UndefOr[scala.Nothing],
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.UndefOr[scala.Nothing],
    disableDefaultHandMesh: Boolean
  ) = this()
  def this(
    /** the controller to which the hand correlates */
  xrController: typings.babylonjs.webXRInputSourceMod.WebXRInputSource,
    /** the meshes to be used to track the hand joints */
  trackedMeshes: js.Array[AbstractMesh],
    _handMesh: AbstractMesh,
    _rigMapping: js.Array[String],
    disableDefaultHandMesh: Boolean
  ) = this()
}

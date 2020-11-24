package typings.babylonjs.webXRHandTrackingMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.XRFrame
import typings.babylonjs.XRReferenceSpace
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHand")
@js.native
class WebXRHand protected () extends IDisposable {
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
  
  var _defaultHandMesh: js.Any = js.native
  
  var _generateDefaultHandMesh: js.Any = js.native
  
  var _handMesh: js.Any = js.native
  
  var _rigMapping: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _transformNodeMapping: js.Any = js.native
  
  /**
    * Populate the HandPartsDefinition object.
    * This is called as a side effect since certain browsers don't have XRHand defined.
    */
  var generateHandPartsDefinition: js.Any = js.native
  
  /**
    * Get meshes of part of the hand
    * @param part the part of hand to get
    * @returns An array of meshes that correlate to the hand part requested
    */
  def getHandPartMeshes(part: HandPart): js.Array[AbstractMesh] = js.native
  
  /**
    * Hand-parts definition (key is HandPart)
    */
  var handPartsDefinition: StringDictionary[js.Array[Double]] = js.native
  
  /** the meshes to be used to track the hand joints */
  val trackedMeshes: js.Array[AbstractMesh] = js.native
  
  /**
    * Update this hand from the latest xr frame
    * @param xrFrame xrFrame to update from
    * @param referenceSpace The current viewer reference space
    * @param scaleFactor optional scale factor for the meshes
    */
  def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace): Unit = js.native
  def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace, scaleFactor: Double): Unit = js.native
  
  /** the controller to which the hand correlates */
  val xrController: WebXRInputSource = js.native
}

package typings.babylonjs.BABYLON

import typings.babylonjs.XRFrame
import typings.babylonjs.XRReferenceSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRHand
  extends StObject
     with IDisposable {
  
  /* private */ var _handMesh: Any = js.native
  
  /* private */ val _jointMeshes: Any = js.native
  
  /**
    * The float array that will directly receive the joint radii from WebXR.
    */
  /* private */ var _jointRadii: Any = js.native
  
  /* private */ val _jointScaleFactor: Any = js.native
  
  /**
    * The float array that will directly receive the transform matrix data from WebXR.
    */
  /* private */ var _jointTransformMatrices: Any = js.native
  
  /**
    * Transform nodes that will directly receive the transforms from the WebXR matrix data.
    */
  /* private */ var _jointTransforms: Any = js.native
  
  /* private */ val _jointsInvisible: Any = js.native
  
  /* private */ val _leftHandedMeshes: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _tempJointMatrix: Any = js.native
  
  /**
    * Get meshes of part of the hand.
    * @param part The part of hand to get.
    * @returns An array of meshes that correlate to the hand part requested.
    */
  def getHandPartMeshes(part: HandPart): js.Array[AbstractMesh] = js.native
  
  /**
    * Retrieves a mesh linked to a named joint in the hand.
    * @param jointName The name of the joint.
    * @returns An AbstractMesh whose position corresponds with the joint position.
    */
  def getJointMesh(jointName: WebXRHandJoint): AbstractMesh = js.native
  
  /**
    * Get the hand mesh.
    */
  def handMesh: Nullable[AbstractMesh] = js.native
  
  /** An optional rig mapping for the hand mesh. If not provided (but a hand mesh is provided),
    * it will be assumed that the hand mesh's bones are named directly after the WebXR bone names. */
  val rigMapping: Nullable[XRHandMeshRigMapping] = js.native
  
  /**
    * Sets the current hand mesh to render for the WebXRHand.
    * @param handMesh The rigged hand mesh that will be tracked to the user's hand.
    * @param rigMapping The mapping from XRHandJoint to bone names to use with the mesh.
    */
  def setHandMesh(handMesh: AbstractMesh, rigMapping: Nullable[XRHandMeshRigMapping]): Unit = js.native
  
  /**
    * Update this hand from the latest xr frame.
    * @param xrFrame The latest frame received from WebXR.
    * @param referenceSpace The current viewer reference space.
    */
  def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace): Unit = js.native
  
  /** The controller to which the hand correlates. */
  val xrController: WebXRInputSource = js.native
}

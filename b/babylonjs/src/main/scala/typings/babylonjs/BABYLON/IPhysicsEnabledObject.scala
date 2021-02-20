package typings.babylonjs.BABYLON

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPhysicsEnabledObject extends StObject {
  
  /**
    * Computes the world matrix
    * @param force Specifies if the world matrix should be computed by force
    * @returns A world matrix
    */
  def computeWorldMatrix(force: Boolean): Matrix = js.native
  
  /**
    * Gets the absolute pivot point from the mesh
    * @returns the absolute pivot point
    */
  def getAbsolutePivotPoint(): Vector3 = js.native
  
  /**
    * Gets the absolute position from the mesh
    * @returns the absolute position
    */
  def getAbsolutePosition(): Vector3 = js.native
  
  /**
    * The bounding info of the physics-enabled object
    * @returns The bounding info of the physics-enabled object
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * Gets the child meshes
    * @param directDescendantsOnly Specifies if only direct-descendants should be obtained
    * @returns An array of abstract meshes
    */
  var getChildMeshes: js.UndefOr[
    js.Function1[/* directDescendantsOnly */ js.UndefOr[Boolean], js.Array[AbstractMesh]]
  ] = js.native
  
  /**
    * Gets the class name of the mesh
    * @returns The class name
    */
  def getClassName(): String = js.native
  
  /**
    * Gets the indices from the mesh
    * @returns A nullable array of index arrays
    */
  var getIndices: js.UndefOr[js.Function0[Nullable[IndicesArray]]] = js.native
  
  /**
    * Gets the scene from the mesh
    * @returns the indices array or null
    */
  var getScene: js.UndefOr[js.Function0[Scene]] = js.native
  
  /**
    * Gets the vertex data
    * @param kind The type of vertex data
    * @returns A nullable array of numbers, or a float32 array
    */
  def getVerticesData(kind: String): Nullable[js.Array[Double] | Float32Array] = js.native
  
  /**
    * Gets the world matrix
    * @returns A world matrix
    */
  var getWorldMatrix: js.UndefOr[js.Function0[Matrix]] = js.native
  
  /**
    * The parent of the physics-enabled object
    */
  var parent: js.UndefOr[js.Any] = js.native
  
  /**
    * The position of the physics-enabled object
    */
  var position: Vector3 = js.native
  
  /**
    * Rotates the mesh
    * @param axis The axis of rotation
    * @param amount The amount of rotation
    * @param space The space of the rotation
    * @returns The rotation transform node
    */
  def rotate(axis: Vector3, amount: Double): TransformNode = js.native
  def rotate(axis: Vector3, amount: Double, space: Space): TransformNode = js.native
  
  /**
    * The rotation of the physics-enabled object
    */
  var rotation: js.UndefOr[Vector3] = js.native
  
  /**
    * The rotation of the physics-enabled object
    */
  var rotationQuaternion: Nullable[Quaternion] = js.native
  
  /**
    * The scale of the physics-enabled object
    */
  var scaling: Vector3 = js.native
  
  /**
    * Sets the absolute position of the mesh
    * @param absolutePosition The absolute position of the mesh
    * @returns The transform node
    */
  def setAbsolutePosition(absolutePosition: Vector3): TransformNode = js.native
  
  /**
    * Translates the mesh
    * @param axis The axis of translation
    * @param distance The distance of translation
    * @param space The space of the translation
    * @returns The transform node
    */
  def translate(axis: Vector3, distance: Double): TransformNode = js.native
  def translate(axis: Vector3, distance: Double, space: Space): TransformNode = js.native
}

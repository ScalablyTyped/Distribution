package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShadowLight
  extends StObject
     with Light {
  
  /**
    * Computes the transformed information (transformedPosition and transformedDirection in World space) of the current light
    * @returns true if the information has been computed, false if it does not need to (no parenting)
    */
  def computeTransformedInformation(): Boolean = js.native
  
  /**
    * Callback defining a custom Projection Matrix Builder.
    * This can be used to override the default projection matrix computation.
    */
  def customProjectionMatrixBuilder(viewMatrix: Matrix, renderList: js.Array[AbstractMesh], result: Matrix): Unit = js.native
  
  /**
    * In 2d mode (needCube being false), the direction used to cast the shadow.
    */
  var direction: Vector3 = js.native
  
  /**
    * Forces the shadow generator to recompute the projection matrix even if position and direction did not changed.
    */
  def forceProjectionMatrixCompute(): Unit = js.native
  
  /**
    * Gets the maxZ used for shadow according to both the scene and the light.
    * @param activeCamera The camera we are returning the max for
    * @returns the depth max z
    */
  def getDepthMaxZ(activeCamera: Camera): Double = js.native
  
  /**
    * Gets the minZ used for shadow according to both the scene and the light.
    * @param activeCamera The camera we are returning the min for
    * @returns the depth min z
    */
  def getDepthMinZ(activeCamera: Camera): Double = js.native
  
  /**
    * Gets the current depth scale used in ESM.
    * @returns The scale
    */
  def getDepthScale(): Double = js.native
  
  /**
    * Get the direction to use to render the shadow map. In case of cube texture, the face index can be passed.
    * @param faceIndex The index of the face we are computed the direction to generate shadow
    * @returns The set direction in 2d mode otherwise the direction to the cubemap face if needCube() is true
    */
  def getShadowDirection(): Vector3 = js.native
  def getShadowDirection(faceIndex: Double): Vector3 = js.native
  
  /**
    * Returns whether or not the shadow generation require a cube texture or a 2d texture.
    * @returns true if a cube texture needs to be use
    */
  def needCube(): Boolean = js.native
  
  /**
    * Detects if the projection matrix requires to be recomputed this frame.
    * @returns true if it requires to be recomputed otherwise, false.
    */
  def needProjectionMatrixCompute(): Boolean = js.native
  
  /**
    * The position the shadow will be casted from.
    */
  var position: Vector3 = js.native
  
  /**
    * Sets the shadow projection matrix in parameter to the generated projection matrix.
    * @param matrix The matrix to updated with the projection information
    * @param viewMatrix The transform matrix of the light
    * @param renderList The list of mesh to render in the map
    * @returns The current light
    */
  def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): IShadowLight = js.native
  
  /**
    * Defines the shadow projection clipping maximum z value.
    */
  var shadowMaxZ: Double = js.native
  
  /**
    * Defines the shadow projection clipping minimum z value.
    */
  var shadowMinZ: Double = js.native
  
  /**
    * The transformed direction. Direction of the light in world space taking parenting in account.
    */
  var transformedDirection: Vector3 = js.native
  
  /**
    * The transformed position. Position of the light in world space taking parenting in account.
    */
  var transformedPosition: Vector3 = js.native
}

package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryBufferRenderer extends js.Object {
  var _cachedDefines: String = js.native
  var _copyBonesTransformationMatrices: js.Any = js.native
  var _effect: Effect = js.native
  var _enablePosition: js.Any = js.native
  var _enableReflectivity: js.Any = js.native
  var _enableVelocity: js.Any = js.native
  var _multiRenderTarget: js.Any = js.native
  var _positionIndex: js.Any = js.native
  /**
    * Dictionary used to store the previous bones transformation matrices of each rendered mesh
    * in order to compute objects velocities when enableVelocity is set to "true"
    * @hidden
    */
  var _previousBonesTransformationMatrices: NumberDictionary[Float32Array] = js.native
  /**
    * Dictionary used to store the previous transformation matrices of each rendered mesh
    * in order to compute objects velocities when enableVelocity is set to "true"
    * @hidden
    */
  var _previousTransformationMatrices: NumberDictionary[ISavedTransformationMatrix] = js.native
  var _ratio: js.Any = js.native
  var _reflectivityIndex: js.Any = js.native
  var _scene: js.Any = js.native
  var _velocityIndex: js.Any = js.native
  /**
    * Array used to store the ignored skinned meshes while computing velocity map (typically used by the motion blur post-process).
    * Avoids computing bones velocities and computes only mesh's velocity itself (position, rotation, scaling).
    */
  var excludedSkinnedMeshesFromVelocity: js.Array[AbstractMesh] = js.native
  /** Gets or sets a boolean indicating if transparent meshes should be rendered */
  var renderTransparentMeshes: Boolean = js.native
  /* protected */ def _createRenderTargets(): Unit = js.native
  /**
    * Disposes the renderer and frees up associated resources.
    */
  def dispose(): Unit = js.native
  /**
    * Gets a boolean indicating if objects positions are enabled for the G buffer.
    */
  def enablePosition: Boolean = js.native
  /**
    * Sets whether or not objects positions are enabled for the G buffer.
    */
  def enablePosition(enable: Boolean): js.Any = js.native
  /**
    * Gets a boolean indicating if objects roughness are enabled in the G buffer.
    */
  def enableReflectivity: Boolean = js.native
  /**
    * Sets wether or not objects roughness are enabled for the G buffer.
    */
  def enableReflectivity(enable: Boolean): js.Any = js.native
  /**
    * Gets a boolean indicating if objects velocities are enabled for the G buffer.
    */
  def enableVelocity: Boolean = js.native
  /**
    * Sets wether or not objects velocities are enabled for the G buffer.
    */
  def enableVelocity(enable: Boolean): js.Any = js.native
  /**
    * Gets the current underlying G Buffer.
    * @returns the buffer
    */
  def getGBuffer(): MultiRenderTarget = js.native
  /**
    * Returns the index of the given texture type in the G-Buffer textures array
    * @param textureType The texture type constant. For example GeometryBufferRenderer.POSITION_TEXTURE_INDEX
    * @returns the index of the given texture type in the G-Buffer textures array
    */
  def getTextureIndex(textureType: Double): Double = js.native
  /**
    * Checks wether everything is ready to render a submesh to the G buffer.
    * @param subMesh the submesh to check readiness for
    * @param useInstances is the mesh drawn using instance or not
    * @returns true if ready otherwise false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  /**
    * Gets wether or not G buffer are supported by the running hardware.
    * This requires draw buffer supports
    */
  def isSupported: Boolean = js.native
  /**
    * Gets the ratio used by the buffer during its creation.
    * How big is the buffer related to the main canvas.
    */
  def ratio: Double = js.native
  /**
    * Set the render list (meshes to be rendered) used in the G buffer.
    */
  def renderList(meshes: js.Array[Mesh]): js.Any = js.native
  /**
    * Gets the number of samples used to render the buffer (anti aliasing).
    */
  def samples: Double = js.native
  /**
    * Sets the number of samples used to render the buffer (anti aliasing).
    */
  def samples(value: Double): js.Any = js.native
  /**
    * Gets the scene associated with the buffer.
    */
  def scene: Scene = js.native
}


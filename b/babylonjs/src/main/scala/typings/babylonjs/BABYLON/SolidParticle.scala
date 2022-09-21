package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolidParticle extends StObject {
  
  /* private */ var _boundingInfo: Any = js.native
  
  /**
    * @hidden Internal global position in the SPS.
    */
  var _globalPosition: Vector3 = js.native
  
  /**
    * @hidden Index of this particle in the global "indices" array (Internal use)
    */
  var _ind: Double = js.native
  
  /**
    * @hidden ModelShape of this particle (Internal use)
    */
  var _model: ModelShape = js.native
  
  /**
    * @hidden Reference to the shape model BoundingInfo object (Internal use)
    */
  var _modelBoundingInfo: BoundingInfo = js.native
  
  /**
    * Index of this particle in the global "positions" array (Internal use)
    * @hidden
    */
  var _pos: Double = js.native
  
  /**
    * @hidden Last computed particle rotation matrix
    */
  var _rotationMatrix: js.Array[Double] = js.native
  
  /**
    * @hidden Reference to the SPS what the particle belongs to (Internal use)
    */
  var _sps: SolidParticleSystem = js.native
  
  /**
    * @hidden Still set as invisible in order to skip useless computations (Internal use)
    */
  var _stillInvisible: Boolean = js.native
  
  /**
    * Is the particle active or not ?
    */
  var alive: Boolean = js.native
  
  /**
    * The color of the particle
    */
  var color: Nullable[Color4] = js.native
  
  /**
    * Copies the particle property values into the existing target : position, rotation, scaling, uvs, colors, pivot, parent, visibility, alive
    * @param target the particle target
    * @returns the current particle
    */
  def copyToRef(target: SolidParticle): SolidParticle = js.native
  
  /**
    * The culling strategy to use to check whether the solid particle must be culled or not when using isInFrustum().
    * The possible values are :
    * - AbstractMesh.CULLINGSTRATEGY_STANDARD
    * - AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY
    * The default value for solid particles is AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
    * Please read each static variable documentation in the class AbstractMesh to get details about the culling process.
    * */
  var cullingStrategy: Double = js.native
  
  /**
    * Particle BoundingInfo object
    * @returns a BoundingInfo
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * get the rotation matrix of the particle
    * @param m
    * @hidden
    */
  def getRotationMatrix(m: Matrix): Unit = js.native
  
  /**
    * Returns true if there is already a bounding info
    */
  def hasBoundingInfo: Boolean = js.native
  
  /**
    * particle identifier
    */
  var id: Double = js.native
  
  /**
    * particle global index
    */
  var idx: Double = js.native
  
  /**
    * Index of the particle in its shape id
    */
  var idxInShape: Double = js.native
  
  /**
    * Returns a boolean. True if the particle intersects another particle or another mesh, else false.
    * The intersection is computed on the particle bounding sphere and Axis Aligned Bounding Box (AABB)
    * @param target is the object (solid particle or mesh) what the intersection is computed against.
    * @returns true if it intersects
    */
  def intersectsMesh(target: Mesh): Boolean = js.native
  def intersectsMesh(target: SolidParticle): Boolean = js.native
  
  /**
    * Returns `true` if the solid particle is within the frustum defined by the passed array of planes.
    * A particle is in the frustum if its bounding box intersects the frustum
    * @param frustumPlanes defines the frustum to test
    * @returns true if the particle is in the frustum planes
    */
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  
  /**
    * Is the particle visible or not ?
    */
  var isVisible: Boolean = js.native
  
  /**
    * The particle material identifier (integer) when MultiMaterials are enabled in the SPS.
    */
  var materialIndex: Nullable[Double] = js.native
  
  /**
    * Parent particle Id, if any.
    * Default null.
    */
  var parentId: Nullable[Double] = js.native
  
  /**
    * The pivot point in the particle local space.
    */
  var pivot: Vector3 = js.native
  
  /**
    * The world space position of the particle.
    */
  var position: Vector3 = js.native
  
  /**
    * Custom object or properties.
    */
  var props: Nullable[Any] = js.native
  
  /**
    * Legacy support, changed quaternion to rotationQuaternion
    */
  def quaternion: Nullable[Quaternion] = js.native
  /**
    * Legacy support, changed quaternion to rotationQuaternion
    */
  def quaternion_=(q: Nullable[Quaternion]): Unit = js.native
  
  /**
    * The world space rotation of the particle. (Not use if rotationQuaternion is set)
    */
  var rotation: Vector3 = js.native
  
  /**
    * The world space rotation quaternion of the particle.
    */
  var rotationQuaternion: Nullable[Quaternion] = js.native
  
  /**
    * Legacy support, changed scale to scaling
    */
  def scale: Vector3 = js.native
  /**
    * Legacy support, changed scale to scaling
    */
  def scale_=(scale: Vector3): Unit = js.native
  
  /**
    * The scaling of the particle.
    */
  var scaling: Vector3 = js.native
  
  /**
    * ModelShape id of this particle
    */
  var shapeId: Double = js.native
  
  /**
    * Must the particle be translated from its pivot point in its local space ?
    * In this case, the pivot point is set at the origin of the particle local space and the particle is translated.
    * Default : false
    */
  var translateFromPivot: Boolean = js.native
  
  /**
    * The uvs of the particle.
    */
  var uvs: Vector4 = js.native
  
  /**
    * The current speed of the particle.
    */
  var velocity: Vector3 = js.native
}

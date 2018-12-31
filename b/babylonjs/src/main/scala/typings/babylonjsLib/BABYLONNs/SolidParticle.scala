package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents one particle of a solid particle system.
  */
@JSGlobal("BABYLON.SolidParticle")
@js.native
class SolidParticle protected () extends js.Object {
  /**
    * Creates a Solid Particle object.
    * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
    * @param particleIndex (integer) is the particle index in the Solid Particle System pool. It's also the particle identifier.
    * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
    * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
    * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
    * @param shapeId (integer) is the model shape identifier in the SPS.
    * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
    * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
    */
  def this(particleIndex: scala.Double, positionIndex: scala.Double, indiceIndex: scala.Double, model: Nullable[ModelShape], shapeId: scala.Double, idxInShape: scala.Double, sps: SolidParticleSystem) = this()
  def this(particleIndex: scala.Double, positionIndex: scala.Double, indiceIndex: scala.Double, model: Nullable[ModelShape], shapeId: scala.Double, idxInShape: scala.Double, sps: SolidParticleSystem, modelBoundingInfo: Nullable[BoundingInfo]) = this()
  /**
    * @hidden Particle BoundingInfo object (Internal use)
    */
  var _boundingInfo: BoundingInfo = js.native
  /**
    * @hidden Internal global position in the SPS.
    */
  var _globalPosition: Vector3 = js.native
  /**
    * @hidden Index of this particle in the global "indices" array (Internal use)
    */
  var _ind: scala.Double = js.native
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
  var _pos: scala.Double = js.native
  /**
    * @hidden Last computed particle rotation matrix
    */
  var _rotationMatrix: js.Array[scala.Double] = js.native
  /**
    * @hidden Reference to the SPS what the particle belongs to (Internal use)
    */
  var _sps: SolidParticleSystem = js.native
  /**
    * @hidden Still set as invisible in order to skip useless computations (Internal use)
    */
  var _stillInvisible: scala.Boolean = js.native
  /**
    * Is the particle active or not ?
    */
  var alive: scala.Boolean = js.native
  /**
    * The color of the particle
    */
  var color: Nullable[Color4] = js.native
  /**
    * particle global index
    */
  var idx: scala.Double = js.native
  /**
    * Index of the particle in its shape id (Internal use)
    */
  var idxInShape: scala.Double = js.native
  /**
    * Is the particle visible or not ?
    */
  var isVisible: scala.Boolean = js.native
  /**
    * Parent particle Id, if any.
    * Default null.
    */
  var parentId: Nullable[scala.Double] = js.native
  /**
    * The pivot point in the particle local space.
    */
  var pivot: Vector3 = js.native
  /**
    * The world space position of the particle.
    */
  var position: Vector3 = js.native
  /**
    * Legacy support, changed quaternion to rotationQuaternion
    */
  /**
    * Legacy support, changed quaternion to rotationQuaternion
    */
  var quaternion: Nullable[Quaternion] = js.native
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
  /**
    * Legacy support, changed scale to scaling
    */
  var scale: Vector3 = js.native
  /**
    * The scaling of the particle.
    */
  var scaling: Vector3 = js.native
  /**
    * ModelShape id of this particle
    */
  var shapeId: scala.Double = js.native
  /**
    * Must the particle be translated from its pivot point in its local space ?
    * In this case, the pivot point is set at the origin of the particle local space and the particle is translated.
    * Default : false
    */
  var translateFromPivot: scala.Boolean = js.native
  /**
    * The uvs of the particle.
    */
  var uvs: Vector4 = js.native
  /**
    * The current speed of the particle.
    */
  var velocity: Vector3 = js.native
  /**
    * Returns a boolean. True if the particle intersects another particle or another mesh, else false.
    * The intersection is computed on the particle bounding sphere and Axis Aligned Bounding Box (AABB)
    * @param target is the object (solid particle or mesh) what the intersection is computed against.
    * @returns true if it intersects
    */
  def intersectsMesh(target: Mesh): scala.Boolean = js.native
  def intersectsMesh(target: SolidParticle): scala.Boolean = js.native
}


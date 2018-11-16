package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a target to use with MorphTargetManager
     * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
     */
@JSGlobal("BABYLON.MorphTarget")
@js.native
class MorphTarget protected () extends IAnimatable {
  /**
           * Creates a new MorphTarget
           * @param name defines the name of the target
           * @param influence defines the influence to use
           */
  def this(/** defines the name of the target */
  name: java.lang.String) = this()
  /**
           * Creates a new MorphTarget
           * @param name defines the name of the target
           * @param influence defines the influence to use
           */
  def this(/** defines the name of the target */
  name: java.lang.String, influence: scala.Double) = this()
  /**
           * Creates a new MorphTarget
           * @param name defines the name of the target
           * @param influence defines the influence to use
           */
  def this(/** defines the name of the target */
  name: java.lang.String, influence: scala.Double, scene: Nullable[Scene]) = this()
  var _animationPropertiesOverride: js.Any = js.native
  var _influence: js.Any = js.native
  var _normals: js.Any = js.native
  /** @hidden */
  var _onDataLayoutChanged: Observable[scala.Unit] = js.native
  var _positions: js.Any = js.native
  var _scene: js.Any = js.native
  var _tangents: js.Any = js.native
  /**
           * Gets or sets the animation properties override
           */
  var animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  /**
           * Array of animations
           */
  /* CompleteClass */
  override var animations: js.Array[Animation] = js.native
  /**
           * Gets a boolean defining if the target contains normal data
           */
  val hasNormals: scala.Boolean = js.native
  /**
           * Gets a boolean defining if the target contains position data
           */
  val hasPositions: scala.Boolean = js.native
  /**
           * Gets a boolean defining if the target contains tangent data
           */
  val hasTangents: scala.Boolean = js.native
  /**
           * Gets or sets the influence of this target (ie. its weight in the overall morphing)
           */
  var influence: scala.Double = js.native
  /** defines the name of the target */
  var name: java.lang.String = js.native
  /**
           * Observable raised when the influence changes
           */
  var onInfluenceChanged: Observable[scala.Boolean] = js.native
  /**
           * Gets the normal data stored in this target
           * @returns a FloatArray containing the normal data (or null if not present)
           */
  def getNormals(): Nullable[FloatArray] = js.native
  /**
           * Gets the position data stored in this target
           * @returns a FloatArray containing the position data (or null if not present)
           */
  def getPositions(): Nullable[FloatArray] = js.native
  /**
           * Gets the tangent data stored in this target
           * @returns a FloatArray containing the tangent data (or null if not present)
           */
  def getTangents(): Nullable[FloatArray] = js.native
  /**
           * Serializes the current target into a Serialization object
           * @returns the serialized object
           */
  def serialize(): js.Any = js.native
  /**
           * Affects normal data to this target
           * @param data defines the normal data to use
           */
  def setNormals(data: Nullable[FloatArray]): scala.Unit = js.native
  /**
           * Affects position data to this target
           * @param data defines the position data to use
           */
  def setPositions(data: Nullable[FloatArray]): scala.Unit = js.native
  /**
           * Affects tangent data to this target
           * @param data defines the tangent data to use
           */
  def setTangents(data: Nullable[FloatArray]): scala.Unit = js.native
}

/**
     * Defines a target to use with MorphTargetManager
     * @see http://doc.babylonjs.com/how_to/how_to_use_morphtargets
     */
@JSGlobal("BABYLON.MorphTarget")
@js.native
object MorphTarget extends js.Object {
  /**
           * Creates a MorphTarget from mesh data
           * @param mesh defines the source mesh
           * @param name defines the name to use for the new target
           * @param influence defines the influence to attach to the target
           * @returns a new MorphTarget
           */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh): babylonjsLib.BABYLONNs.MorphTarget = js.native
  /**
           * Creates a MorphTarget from mesh data
           * @param mesh defines the source mesh
           * @param name defines the name to use for the new target
           * @param influence defines the influence to attach to the target
           * @returns a new MorphTarget
           */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh, name: java.lang.String): babylonjsLib.BABYLONNs.MorphTarget = js.native
  /**
           * Creates a MorphTarget from mesh data
           * @param mesh defines the source mesh
           * @param name defines the name to use for the new target
           * @param influence defines the influence to attach to the target
           * @returns a new MorphTarget
           */
  def FromMesh(mesh: babylonjsLib.BABYLONNs.AbstractMesh, name: java.lang.String, influence: scala.Double): babylonjsLib.BABYLONNs.MorphTarget = js.native
  /**
           * Creates a new target from serialized data
           * @param serializationObject defines the serialized data to use
           * @returns a new MorphTarget
           */
  def Parse(serializationObject: js.Any): babylonjsLib.BABYLONNs.MorphTarget = js.native
}


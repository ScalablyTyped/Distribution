package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphTarget extends IAnimatable {
  var _animationPropertiesOverride: js.Any = js.native
  var _influence: js.Any = js.native
  var _normals: js.Any = js.native
  /** @hidden */
  var _onDataLayoutChanged: Observable[Unit] = js.native
  var _positions: js.Any = js.native
  var _scene: js.Any = js.native
  var _tangents: js.Any = js.native
  var _uniqueId: js.Any = js.native
  var _uvs: js.Any = js.native
  /**
    * Gets or sets the list of animations
    */
  @JSName("animations")
  var animations_MorphTarget: js.Array[Animation] = js.native
  /**
    * Gets or sets the id of the morph Target
    */
  var id: String = js.native
  /** defines the name of the target */
  var name: String = js.native
  /**
    * Observable raised when the influence changes
    */
  var onInfluenceChanged: Observable[Boolean] = js.native
  /**
    * Gets or sets the animation properties override
    */
  def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
  def animationPropertiesOverride(value: Nullable[AnimationPropertiesOverride]): js.Any = js.native
  /**
    * Returns the string "MorphTarget"
    * @returns "MorphTarget"
    */
  def getClassName(): String = js.native
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
    * Gets the texture coordinates data stored in this target
    * @returns a FloatArray containing the texture coordinates data (or null if not present)
    */
  def getUVs(): Nullable[FloatArray] = js.native
  /**
    * Gets a boolean defining if the target contains normal data
    */
  def hasNormals: Boolean = js.native
  /**
    * Gets a boolean defining if the target contains position data
    */
  def hasPositions: Boolean = js.native
  /**
    * Gets a boolean defining if the target contains tangent data
    */
  def hasTangents: Boolean = js.native
  /**
    * Gets a boolean defining if the target contains texture coordinates data
    */
  def hasUVs: Boolean = js.native
  /**
    * Gets or sets the influence of this target (ie. its weight in the overall morphing)
    */
  def influence: Double = js.native
  def influence(influence: Double): js.Any = js.native
  /**
    * Serializes the current target into a Serialization object
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  /**
    * Affects normal data to this target
    * @param data defines the normal data to use
    */
  def setNormals(data: Nullable[FloatArray]): Unit = js.native
  /**
    * Affects position data to this target
    * @param data defines the position data to use
    */
  def setPositions(data: Nullable[FloatArray]): Unit = js.native
  /**
    * Affects tangent data to this target
    * @param data defines the tangent data to use
    */
  def setTangents(data: Nullable[FloatArray]): Unit = js.native
  /**
    * Affects texture coordinates data to this target
    * @param data defines the texture coordinates data to use
    */
  def setUVs(data: Nullable[FloatArray]): Unit = js.native
  /**
    * Gets the unique ID of this manager
    */
  def uniqueId: Double = js.native
}


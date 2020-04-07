package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.animationPropertiesOverrideMod.AnimationPropertiesOverride
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Morph/morphTarget", JSImport.Namespace)
@js.native
object morphTargetMod extends js.Object {
  @js.native
  class MorphTarget protected () extends IAnimatable {
    /**
      * Creates a new MorphTarget
      * @param name defines the name of the target
      * @param influence defines the influence to use
      * @param scene defines the scene the morphtarget belongs to
      */
    def this(/** defines the name of the target */
    name: String) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
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
      * Array of animations
      */
    /* CompleteClass */
    override var animations: Nullable[js.Array[Animation]] = js.native
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
    def animationPropertiesOverride(): Nullable[AnimationPropertiesOverride] = js.native
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
    def hasNormals(): Boolean = js.native
    /**
      * Gets a boolean defining if the target contains position data
      */
    def hasPositions(): Boolean = js.native
    /**
      * Gets a boolean defining if the target contains tangent data
      */
    def hasTangents(): Boolean = js.native
    /**
      * Gets a boolean defining if the target contains texture coordinates data
      */
    def hasUVs(): Boolean = js.native
    /**
      * Gets or sets the influence of this target (ie. its weight in the overall morphing)
      */
    def influence(): Double = js.native
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
    def uniqueId(): Double = js.native
  }
  
  /* static members */
  @js.native
  object MorphTarget extends js.Object {
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    def FromMesh(mesh: AbstractMesh): MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String): MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String, influence: Double): MorphTarget = js.native
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @returns a new MorphTarget
      */
    def Parse(serializationObject: js.Any): MorphTarget = js.native
  }
  
}


package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animatableInterfaceMod.IAnimatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.animationPropertiesOverrideMod.AnimationPropertiesOverride
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphTargetMod {
  
  @JSImport("babylonjs/Morph/morphTarget", "MorphTarget")
  @js.native
  open class MorphTarget protected ()
    extends StObject
       with IAnimatable {
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
    def this(/** defines the name of the target */
    name: String, influence: Unit, scene: Nullable[Scene]) = this()
    
    /* private */ var _animationPropertiesOverride: Any = js.native
    
    /* private */ var _influence: Any = js.native
    
    /* private */ var _normals: Any = js.native
    
    /** @internal */
    var _onDataLayoutChanged: Observable[Unit] = js.native
    
    /* private */ var _positions: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _tangents: Any = js.native
    
    /* private */ var _uniqueId: Any = js.native
    
    /* private */ var _uvs: Any = js.native
    
    /**
      * Gets or sets the animation properties override
      */
    def animationPropertiesOverride: Nullable[AnimationPropertiesOverride] = js.native
    def animationPropertiesOverride_=(value: Nullable[AnimationPropertiesOverride]): Unit = js.native
    
    /**
      * Array of animations
      */
    /* CompleteClass */
    var animations: Nullable[js.Array[Animation]] = js.native
    /**
      * Gets or sets the list of animations
      */
    @JSName("animations")
    var animations_MorphTarget: js.Array[Animation] = js.native
    
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
      * Gets or sets the id of the morph Target
      */
    var id: String = js.native
    
    /**
      * Gets or sets the influence of this target (ie. its weight in the overall morphing)
      */
    def influence: Double = js.native
    def influence_=(influence: Double): Unit = js.native
    
    /** defines the name of the target */
    var name: String = js.native
    
    /**
      * Observable raised when the influence changes
      */
    var onInfluenceChanged: Observable[Boolean] = js.native
    
    /**
      * Serializes the current target into a Serialization object
      * @returns the serialized object
      */
    def serialize(): Any = js.native
    
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
  /* static members */
  object MorphTarget {
    
    @JSImport("babylonjs/Morph/morphTarget", "MorphTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    inline def FromMesh(mesh: AbstractMesh): MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String): MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String, influence: Double): MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: Unit, influence: Double): MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[MorphTarget]
    
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @param scene defines the hosting scene
      * @returns a new MorphTarget
      */
    inline def Parse(serializationObject: Any): MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any]).asInstanceOf[MorphTarget]
    inline def Parse(serializationObject: Any, scene: Scene): MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[MorphTarget]
  }
}

package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsTexturesRawTexture2DArrayMod.RawTexture2DArray
import typings.babylonjs.morphMorphTargetMod.MorphTarget
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphMorphTargetManagerMod {
  
  @JSImport("babylonjs/Morph/morphTargetManager", "MorphTargetManager")
  @js.native
  /**
    * Creates a new MorphTargetManager
    * @param scene defines the current scene
    */
  open class MorphTargetManager ()
    extends StObject
       with IDisposable {
    def this(scene: Nullable[Scene]) = this()
    
    /* private */ var _activeTargets: Any = js.native
    
    /**
      * @internal
      */
    def _bind(effect: Effect): Unit = js.native
    
    /* private */ var _blockCounter: Any = js.native
    
    /* private */ var _canUseTextureForTargets: Any = js.native
    
    /* private */ var _influences: Any = js.native
    
    /* private */ var _morphTargetTextureIndices: Any = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _supportsNormals: Any = js.native
    
    /* private */ var _supportsTangents: Any = js.native
    
    /* private */ var _supportsUVs: Any = js.native
    
    /* private */ var _syncActiveTargets: Any = js.native
    
    /* private */ var _targetDataLayoutChangedObservers: Any = js.native
    
    /* private */ var _targetInfluenceChangedObservers: Any = js.native
    
    /** @internal */
    var _targetStoreTexture: Nullable[RawTexture2DArray] = js.native
    
    /* private */ var _targets: Any = js.native
    
    /* private */ var _tempInfluences: Any = js.native
    
    /* private */ var _textureHeight: Any = js.native
    
    /* private */ var _textureVertexStride: Any = js.native
    
    /* private */ var _textureWidth: Any = js.native
    
    /* private */ var _uniqueId: Any = js.native
    
    /* private */ var _useTextureToStoreTargets: Any = js.native
    
    /* private */ var _vertexCount: Any = js.native
    
    /**
      * Add a new target to this manager
      * @param target defines the target to add
      */
    def addTarget(target: MorphTarget): Unit = js.native
    
    def areUpdatesFrozen: Boolean = js.native
    /**
      * Sets a boolean indicating that adding new target or updating an existing target will not update the underlying data buffers
      */
    def areUpdatesFrozen_=(block: Boolean): Unit = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating if normals must be morphed
      */
    var enableNormalMorphing: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if tangents must be morphed
      */
    var enableTangentMorphing: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating if UV must be morphed
      */
    var enableUVMorphing: Boolean = js.native
    
    /**
      * Gets the active target at specified index. An active target is a target with an influence > 0
      * @param index defines the index to check
      * @returns the requested target
      */
    def getActiveTarget(index: Double): MorphTarget = js.native
    
    /**
      * Gets the target at specified index
      * @param index defines the index to check
      * @returns the requested target
      */
    def getTarget(index: Double): MorphTarget = js.native
    
    /**
      * Gets the list of influences (one per target)
      */
    def influences: js.typedarray.Float32Array = js.native
    
    /**
      * Gets a boolean indicating that the targets are stored into a texture (instead of as attributes)
      */
    def isUsingTextureForTargets: Boolean = js.native
    
    /**
      * Gets the number of influencers (ie. the number of targets with influences > 0)
      */
    def numInfluencers: Double = js.native
    
    /**
      * Gets the number of targets stored in this manager
      */
    def numTargets: Double = js.native
    
    /**
      * Gets or sets a boolean indicating if influencers must be optimized (eg. recompiling the shader if less influencers are used)
      */
    var optimizeInfluencers: Boolean = js.native
    
    /**
      * Removes a target from the manager
      * @param target defines the target to remove
      */
    def removeTarget(target: MorphTarget): Unit = js.native
    
    /**
      * Serializes the current manager into a Serialization object
      * @returns the serialized object
      */
    def serialize(): Any = js.native
    
    /**
      * Gets a boolean indicating if this manager supports morphing of normals
      */
    def supportsNormals: Boolean = js.native
    
    /**
      * Gets a boolean indicating if this manager supports morphing of tangents
      */
    def supportsTangents: Boolean = js.native
    
    /**
      * Gets a boolean indicating if this manager supports morphing of texture coordinates
      */
    def supportsUVs: Boolean = js.native
    
    /**
      * Synchronize the targets with all the meshes using this morph target manager
      */
    def synchronize(): Unit = js.native
    
    /**
      * Gets the unique ID of this manager
      */
    def uniqueId: Double = js.native
    
    /**
      * Gets or sets a boolean indicating that targets should be stored as a texture instead of using vertex attributes (default is true).
      * Please note that this option is not available if the hardware does not support it
      */
    def useTextureToStoreTargets: Boolean = js.native
    def useTextureToStoreTargets_=(value: Boolean): Unit = js.native
    
    /**
      * Gets the number of vertices handled by this manager
      */
    def vertexCount: Double = js.native
  }
  /* static members */
  object MorphTargetManager {
    
    @JSImport("babylonjs/Morph/morphTargetManager", "MorphTargetManager")
    @js.native
    val ^ : js.Any = js.native
    
    /** Enable storing morph target data into textures when set to true (true by default) */
    @JSImport("babylonjs/Morph/morphTargetManager", "MorphTargetManager.EnableTextureStorage")
    @js.native
    def EnableTextureStorage: Boolean = js.native
    inline def EnableTextureStorage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnableTextureStorage")(x.asInstanceOf[js.Any])
    
    /** Maximum number of active morph targets supported in the "vertex attribute" mode (i.e., not the "texture" mode) */
    @JSImport("babylonjs/Morph/morphTargetManager", "MorphTargetManager.MaxActiveMorphTargetsInVertexAttributeMode")
    @js.native
    def MaxActiveMorphTargetsInVertexAttributeMode: Double = js.native
    inline def MaxActiveMorphTargetsInVertexAttributeMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxActiveMorphTargetsInVertexAttributeMode")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    inline def Parse(serializationObject: Any, scene: Scene): MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[MorphTargetManager]
  }
}

package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.multiRenderTargetMod.MultiRenderTarget
import typings.babylonjs.prePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryBufferRendererMod {
  
  @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer")
  @js.native
  open class GeometryBufferRenderer protected () extends StObject {
    /**
      * Creates a new G Buffer for the scene
      * @param scene The scene the buffer belongs to
      * @param ratio How big is the buffer related to the main canvas (default: 1)
      * @param depthFormat Format of the depth texture (default: Constants.TEXTUREFORMAT_DEPTH16)
      */
    def this(scene: Scene) = this()
    def this(scene: Scene, ratio: Double) = this()
    def this(scene: Scene, ratio: Double, depthFormat: Double) = this()
    def this(scene: Scene, ratio: Unit, depthFormat: Double) = this()
    
    /* private */ var _assignRenderTargetIndices: Any = js.native
    
    /* private */ var _attachments: Any = js.native
    
    /* protected */ var _cachedDefines: String = js.native
    
    /* private */ var _copyBonesTransformationMatrices: Any = js.native
    
    /* protected */ def _createRenderTargets(): Unit = js.native
    
    /* private */ var _depthFormat: Any = js.native
    
    /* private */ var _depthIndex: Any = js.native
    
    /* private */ var _enablePosition: Any = js.native
    
    /* private */ var _enableReflectivity: Any = js.native
    
    /* private */ var _enableVelocity: Any = js.native
    
    /**
      * @internal
      * Replaces a texture in the geometry buffer renderer
      * Useful when linking textures of the prepass renderer
      */
    def _forceTextureType(geometryBufferType: Double, index: Double): Unit = js.native
    
    /**
      * @internal
      * Replaces the first texture which is hard coded as a depth texture in the geometry buffer
      * Useful when linking textures of the prepass renderer
      */
    def _linkInternalTexture(internalTexture: InternalTexture): Unit = js.native
    
    /**
      * @internal
      * Sets up internal structures to share outputs with PrePassRenderer
      * This method should only be called by the PrePassRenderer itself
      */
    def _linkPrePassRenderer(prePassRenderer: PrePassRenderer): Unit = js.native
    
    /* private */ var _linkedWithPrePass: Any = js.native
    
    /* private */ var _multiRenderTarget: Any = js.native
    
    /* private */ var _normalIndex: Any = js.native
    
    /* private */ var _positionIndex: Any = js.native
    
    /* private */ var _prePassRenderer: Any = js.native
    
    /**
      * Dictionary used to store the previous bones transformation matrices of each rendered mesh
      * in order to compute objects velocities when enableVelocity is set to "true"
      * @internal
      */
    var _previousBonesTransformationMatrices: NumberDictionary[js.typedarray.Float32Array] = js.native
    
    /**
      * Dictionary used to store the previous transformation matrices of each rendered mesh
      * in order to compute objects velocities when enableVelocity is set to "true"
      * @internal
      */
    var _previousTransformationMatrices: NumberDictionary[ISavedTransformationMatrix] = js.native
    
    /* private */ var _ratio: Any = js.native
    
    /* private */ var _reflectivityIndex: Any = js.native
    
    /**
      * @internal
      * Resets the geometry buffer layout
      */
    def _resetLayout(): Unit = js.native
    
    /* private */ var _resizeObserver: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /**
      * @internal
      * Sets texture attachments
      * Useful when linking textures of the prepass renderer
      */
    def _setAttachments(attachments: js.Array[Double]): Unit = js.native
    
    /**
      * @internal
      * Separates internal structures from PrePassRenderer so the geometry buffer can now operate by itself.
      * This method should only be called by the PrePassRenderer itself
      */
    def _unlinkPrePassRenderer(): Unit = js.native
    
    /* private */ var _useUbo: Any = js.native
    
    /* private */ var _velocityIndex: Any = js.native
    
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
    def enablePosition_=(enable: Boolean): Unit = js.native
    
    /**
      * Gets a boolean indicating if objects reflectivity are enabled in the G buffer.
      */
    def enableReflectivity: Boolean = js.native
    /**
      * Sets whether or not objects reflectivity are enabled for the G buffer.
      * For Metallic-Roughness workflow with ORM texture, we assume that ORM texture is defined according to the default layout:
      * pbr.useRoughnessFromMetallicTextureAlpha = false;
      * pbr.useRoughnessFromMetallicTextureGreen = true;
      * pbr.useMetallnessFromMetallicTextureBlue = true;
      */
    def enableReflectivity_=(enable: Boolean): Unit = js.native
    
    /**
      * Gets a boolean indicating if objects velocities are enabled for the G buffer.
      */
    def enableVelocity: Boolean = js.native
    /**
      * Sets whether or not objects velocities are enabled for the G buffer.
      */
    def enableVelocity_=(enable: Boolean): Unit = js.native
    
    /**
      * Array used to store the ignored skinned meshes while computing velocity map (typically used by the motion blur post-process).
      * Avoids computing bones velocities and computes only mesh's velocity itself (position, rotation, scaling).
      */
    var excludedSkinnedMeshesFromVelocity: js.Array[AbstractMesh] = js.native
    
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
      * Checks whether everything is ready to render a submesh to the G buffer.
      * @param subMesh the submesh to check readiness for
      * @param useInstances is the mesh drawn using instance or not
      * @returns true if ready otherwise false
      */
    def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
    
    /**
      * Gets whether or not G buffer are supported by the running hardware.
      * This requires draw buffer supports
      */
    def isSupported: Boolean = js.native
    
    /**
      * Gets the ratio used by the buffer during its creation.
      * How big is the buffer related to the main canvas.
      */
    def ratio: Double = js.native
    
    /**
      * Gets the render list (meshes to be rendered) used in the G buffer.
      */
    def renderList: Nullable[js.Array[AbstractMesh]] = js.native
    /**
      * Set the render list (meshes to be rendered) used in the G buffer.
      */
    def renderList_=(meshes: Nullable[js.Array[AbstractMesh]]): Unit = js.native
    
    /** Gets or sets a boolean indicating if transparent meshes should be rendered */
    var renderTransparentMeshes: Boolean = js.native
    
    /**
      * Gets the number of samples used to render the buffer (anti aliasing).
      */
    def samples: Double = js.native
    /**
      * Sets the number of samples used to render the buffer (anti aliasing).
      */
    def samples_=(value: Double): Unit = js.native
    
    /**
      * Gets the scene associated with the buffer.
      */
    def scene: Scene = js.native
  }
  /* static members */
  object GeometryBufferRenderer {
    
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constant used to retrieve the depth texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.DEPTH_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer.DEPTH_TEXTURE_TYPE")
    @js.native
    val DEPTH_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the normal texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.NORMAL_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer.NORMAL_TEXTURE_TYPE")
    @js.native
    val NORMAL_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the position texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer.POSITION_TEXTURE_TYPE")
    @js.native
    val POSITION_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
      * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
      */
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE")
    @js.native
    val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
    
    /**
      * Constant used to retrieve the velocity texture index in the G-Buffer textures array
      * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
      */
    @JSImport("babylonjs/Rendering/geometryBufferRenderer", "GeometryBufferRenderer.VELOCITY_TEXTURE_TYPE")
    @js.native
    val VELOCITY_TEXTURE_TYPE: Double = js.native
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** @internal */
  trait ISavedTransformationMatrix extends StObject {
    
    var viewProjection: Matrix
    
    var world: Matrix
  }
  object ISavedTransformationMatrix {
    
    inline def apply(viewProjection: Matrix, world: Matrix): ISavedTransformationMatrix = {
      val __obj = js.Dynamic.literal(viewProjection = viewProjection.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISavedTransformationMatrix]
    }
    
    extension [Self <: ISavedTransformationMatrix](x: Self) {
      
      inline def setViewProjection(value: Matrix): Self = StObject.set(x, "viewProjection", value.asInstanceOf[js.Any])
      
      inline def setWorld(value: Matrix): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    }
  }
}

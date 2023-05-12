package typings.babylonjs

import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.materialsTexturesBaseTextureMod.BaseTexture
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesMeshUVSpaceRendererMod {
  
  @JSImport("babylonjs/Meshes/meshUVSpaceRenderer", "MeshUVSpaceRenderer")
  @js.native
  open class MeshUVSpaceRenderer protected () extends StObject {
    /**
      * Creates a new MeshUVSpaceRenderer
      * @param mesh The mesh used for the source UV space
      * @param scene The scene the mesh belongs to
      * @param options The options to use when creating the texture
      */
    def this(mesh: AbstractMesh, scene: Scene) = this()
    def this(mesh: AbstractMesh, scene: Scene, options: IMeshUVSpaceRendererOptions) = this()
    
    /* private */ var _createDiffuseRTT: Any = js.native
    
    /* private */ var _createProjectionMatrix: Any = js.native
    
    /* private */ var _createRenderTargetTexture: Any = js.native
    
    /* private */ var _mesh: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _textureCreatedInternally: Any = js.native
    
    /**
      * Clears the texture map
      */
    def clear(): Unit = js.native
    
    /**
      * Clear color of the texture
      */
    var clearColor: Color4 = js.native
    
    /**
      * Disposes of the ressources
      */
    def dispose(): Unit = js.native
    
    /**
      * Checks if the texture is ready to be used
      * @returns true if the texture is ready to be used
      */
    def isReady(): Boolean = js.native
    
    /**
      * Projects and renders a texture in the mesh UV space
      * @param texture The texture
      * @param position The position of the center of projection (world space coordinates)
      * @param normal The direction of the projection (world space coordinates)
      * @param size The size of the projection
      * @param angle The rotation angle around the direction of the projection
      */
    def renderTexture(texture: BaseTexture, position: Vector3, normal: Vector3, size: Vector3): Unit = js.native
    def renderTexture(texture: BaseTexture, position: Vector3, normal: Vector3, size: Vector3, angle: Double): Unit = js.native
    
    /**
      * Target texture used for rendering
      * If you don't set the property, a RenderTargetTexture will be created internally given the options provided to the constructor.
      * If you provide a RenderTargetTexture, it will be used directly.
      */
    var texture: Texture = js.native
  }
  /* static members */
  object MeshUVSpaceRenderer {
    
    @JSImport("babylonjs/Meshes/meshUVSpaceRenderer", "MeshUVSpaceRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/meshUVSpaceRenderer", "MeshUVSpaceRenderer._GetShader")
    @js.native
    def _GetShader: Any = js.native
    inline def _GetShader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShader")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/meshUVSpaceRenderer", "MeshUVSpaceRenderer._IsRenderTargetTexture")
    @js.native
    def _IsRenderTargetTexture: Any = js.native
    inline def _IsRenderTargetTexture_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsRenderTargetTexture")(x.asInstanceOf[js.Any])
  }
  
  trait IMeshUVSpaceRendererOptions extends StObject {
    
    /**
      * Generate mip maps. Default: true
      */
    var generateMipMaps: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of the texture. Default: 1024
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Optimize UV allocation. Default: true
      * If you plan to use the texture as a decal map and rotate / offset the texture, you should set this to false
      */
    var optimizeUVAllocation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of the texture. Default: Constants.TEXTURETYPE_UNSIGNED_BYTE
      */
    var textureType: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the texture. Default: 1024
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object IMeshUVSpaceRendererOptions {
    
    inline def apply(): IMeshUVSpaceRendererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMeshUVSpaceRendererOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMeshUVSpaceRendererOptions] (val x: Self) extends AnyVal {
      
      inline def setGenerateMipMaps(value: Boolean): Self = StObject.set(x, "generateMipMaps", value.asInstanceOf[js.Any])
      
      inline def setGenerateMipMapsUndefined: Self = StObject.set(x, "generateMipMaps", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOptimizeUVAllocation(value: Boolean): Self = StObject.set(x, "optimizeUVAllocation", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUVAllocationUndefined: Self = StObject.set(x, "optimizeUVAllocation", js.undefined)
      
      inline def setTextureType(value: Double): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
      
      inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal */
      var _meshUVSpaceRendererShader: Nullable[ShaderMaterial]
    }
    object Scene {
      
      inline def apply(): typings.babylonjs.meshesMeshUVSpaceRendererMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_meshUVSpaceRendererShader = null)
        __obj.asInstanceOf[typings.babylonjs.meshesMeshUVSpaceRendererMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.babylonjs.meshesMeshUVSpaceRendererMod.babylonjsSceneAugmentingMod.Scene] (val x: Self) extends AnyVal {
        
        inline def set_meshUVSpaceRendererShader(value: Nullable[ShaderMaterial]): Self = StObject.set(x, "_meshUVSpaceRendererShader", value.asInstanceOf[js.Any])
        
        inline def set_meshUVSpaceRendererShaderNull: Self = StObject.set(x, "_meshUVSpaceRendererShader", null)
      }
    }
  }
}

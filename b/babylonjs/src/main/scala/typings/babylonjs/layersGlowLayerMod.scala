package typings.babylonjs

import typings.babylonjs.anon.PartialIGlowLayerOptions
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.layersEffectLayerMod.EffectLayer
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesSubMeshMod.SubMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersGlowLayerMod {
  
  @JSImport("babylonjs/Layers/glowLayer", "GlowLayer")
  @js.native
  open class GlowLayer protected () extends EffectLayer {
    /**
      * Instantiates a new glow Layer and references it to the scene.
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Unit, options: PartialIGlowLayerOptions) = this()
    def this(name: String, scene: Scene, options: PartialIGlowLayerOptions) = this()
    
    /* private */ var _blurTexture1: Any = js.native
    
    /* private */ var _blurTexture2: Any = js.native
    
    /* private */ var _excludedMeshes: Any = js.native
    
    /**
      * @returns The blur kernel size used by the glow.
      * Note: The value passed in the options is divided by 2 for back compatibility.
      */
    /* private */ var _getEffectiveBlurKernelSize: Any = js.native
    
    /* private */ var _horizontalBlurPostprocess1: Any = js.native
    
    /* private */ var _horizontalBlurPostprocess2: Any = js.native
    
    /* private */ var _includedOnlyMeshes: Any = js.native
    
    /* private */ var _intensity: Any = js.native
    
    /**
      * Implementation specific of rendering the generating effect on the main canvas.
      * @param effect The effect used to render through
      */
    /* protected */ def _internalRender(effect: Effect): Unit = js.native
    
    /* private */ var _meshesUsingTheirOwnMaterials: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _postProcesses1: Any = js.native
    
    /* private */ var _postProcesses2: Any = js.native
    
    /**
      * Returns true if the mesh should render, otherwise false.
      * @param mesh The mesh to render
      * @returns true if it should render otherwise false
      */
    /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
    
    /* private */ var _verticalBlurPostprocess1: Any = js.native
    
    /* private */ var _verticalBlurPostprocess2: Any = js.native
    
    /**
      * Add a mesh in the exclusion list to prevent it to impact or being impacted by the glow layer.
      * @param mesh The mesh to exclude from the glow layer
      */
    def addExcludedMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Add a mesh in the inclusion list to impact or being impacted by the glow layer.
      * @param mesh The mesh to include in the glow layer
      */
    def addIncludedOnlyMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Gets the kernel size of the blur.
      */
    def blurKernelSize: Double = js.native
    /**
      * Sets the kernel size of the blur.
      */
    def blurKernelSize_=(value: Double): Unit = js.native
    
    /**
      * Callback used to let the user override the color selection on a per mesh basis
      */
    def customEmissiveColorSelector(mesh: Mesh, subMesh: SubMesh, material: Material, result: Color4): Unit = js.native
    
    /**
      * Callback used to let the user override the texture selection on a per mesh basis
      */
    def customEmissiveTextureSelector(mesh: Mesh, subMesh: SubMesh, material: Material): Texture = js.native
    
    /**
      * Gets the glow intensity.
      */
    def intensity: Double = js.native
    /**
      * Sets the glow intensity.
      */
    def intensity_=(value: Double): Unit = js.native
    
    /**
      * Add a mesh to be rendered through its own material and not with emissive only.
      * @param mesh The mesh for which we need to use its material
      */
    def referenceMeshToUseItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
    
    /**
      * Remove a mesh from the exclusion list to let it impact or being impacted by the glow layer.
      * @param mesh The mesh to remove
      */
    def removeExcludedMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Remove a mesh from the Inclusion list to prevent it to impact or being impacted by the glow layer.
      * @param mesh The mesh to remove
      */
    def removeIncludedOnlyMesh(mesh: Mesh): Unit = js.native
    
    /**
      * Serializes this glow layer
      * @returns a serialized glow layer object
      */
    @JSName("serialize")
    def serialize_MGlowLayer(): Any = js.native
    
    /**
      * Remove a mesh from being rendered through its own material and not with emissive only.
      * @param mesh The mesh for which we need to not use its material
      */
    def unReferenceMeshFromUsingItsOwnMaterial(mesh: AbstractMesh): Unit = js.native
  }
  /* static members */
  object GlowLayer {
    
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default blur kernel size used for the glow.
      */
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer.DefaultBlurKernelSize")
    @js.native
    def DefaultBlurKernelSize: Double = js.native
    inline def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
    
    /**
      * The default texture size ratio used for the glow.
      */
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer.DefaultTextureRatio")
    @js.native
    def DefaultTextureRatio: Double = js.native
    inline def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
    
    /**
      * Effect Name of the layer.
      */
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer.EffectName")
    @js.native
    val EffectName: String = js.native
    
    /**
      * Creates a Glow Layer from parsed glow layer data
      * @param parsedGlowLayer defines glow layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the glow layer information
      * @returns a parsed Glow Layer
      */
    inline def Parse(parsedGlowLayer: Any, scene: Scene, rootUrl: String): GlowLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedGlowLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[GlowLayer]
  }
  
  trait IGlowLayerOptions extends StObject {
    
    /**
      * Defines the blend mode used by the merge. Default: ALPHA_ADD
      */
    var alphaBlendingMode: js.UndefOr[Double] = js.undefined
    
    /**
      * How big is the kernel of the blur texture. Default: 32
      */
    var blurKernelSize: Double
    
    /**
      * The camera attached to the layer. Default: null
      */
    var camera: Nullable[Camera]
    
    /**
      * Forces the merge step to be done in ldr (clamp values > 1). Default: false
      */
    var ldrMerge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enforces a fixed size texture to ensure resize independent blur. Default: undefined
      */
    var mainTextureFixedSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiplication factor apply to the canvas size to compute the render target size
      * used to generated the glowing objects (the smaller the faster). Default: 0.5
      */
    var mainTextureRatio: Double
    
    /**
      * Enable MSAA by choosing the number of samples. Default: 1
      */
    var mainTextureSamples: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of the main texture. Default: TEXTURETYPE_UNSIGNED_INT
      */
    var mainTextureType: Double
    
    /**
      * The rendering group to draw the layer in. Default: -1
      */
    var renderingGroupId: Double
  }
  object IGlowLayerOptions {
    
    inline def apply(
      blurKernelSize: Double,
      mainTextureRatio: Double,
      mainTextureType: Double,
      renderingGroupId: Double
    ): IGlowLayerOptions = {
      val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], mainTextureType = mainTextureType.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any], camera = null)
      __obj.asInstanceOf[IGlowLayerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGlowLayerOptions] (val x: Self) extends AnyVal {
      
      inline def setAlphaBlendingMode(value: Double): Self = StObject.set(x, "alphaBlendingMode", value.asInstanceOf[js.Any])
      
      inline def setAlphaBlendingModeUndefined: Self = StObject.set(x, "alphaBlendingMode", js.undefined)
      
      inline def setBlurKernelSize(value: Double): Self = StObject.set(x, "blurKernelSize", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraNull: Self = StObject.set(x, "camera", null)
      
      inline def setLdrMerge(value: Boolean): Self = StObject.set(x, "ldrMerge", value.asInstanceOf[js.Any])
      
      inline def setLdrMergeUndefined: Self = StObject.set(x, "ldrMerge", js.undefined)
      
      inline def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
      
      inline def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
      
      inline def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
      
      inline def setMainTextureSamples(value: Double): Self = StObject.set(x, "mainTextureSamples", value.asInstanceOf[js.Any])
      
      inline def setMainTextureSamplesUndefined: Self = StObject.set(x, "mainTextureSamples", js.undefined)
      
      inline def setMainTextureType(value: Double): Self = StObject.set(x, "mainTextureType", value.asInstanceOf[js.Any])
      
      inline def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * Return the first glow layer of the scene with a given name.
        * @param name The name of the glow layer to look for.
        * @returns The glow layer if found otherwise null.
        */
      def getGlowLayerByName(name: String): Nullable[GlowLayer]
    }
    object AbstractScene {
      
      inline def apply(getGlowLayerByName: String => Nullable[GlowLayer]): AbstractScene = {
        val __obj = js.Dynamic.literal(getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      }
    }
  }
}

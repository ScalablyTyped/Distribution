package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.PartialIGlowLayerOptions
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.effectLayerMod.EffectLayer
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glowLayerMod {
  
  @JSImport("babylonjs/Layers/glowLayer", "GlowLayer")
  @js.native
  class GlowLayer protected () extends EffectLayer {
    /**
      * Instantiates a new glow Layer and references it to the scene.
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
      */
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Scene, options: PartialIGlowLayerOptions) = this()
    
    var _blurTexture1: js.Any = js.native
    
    var _blurTexture2: js.Any = js.native
    
    var _excludedMeshes: js.Any = js.native
    
    var _horizontalBlurPostprocess1: js.Any = js.native
    
    var _horizontalBlurPostprocess2: js.Any = js.native
    
    var _includedOnlyMeshes: js.Any = js.native
    
    var _intensity: js.Any = js.native
    
    var _meshesUsingTheirOwnMaterials: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _postProcesses1: js.Any = js.native
    
    var _postProcesses2: js.Any = js.native
    
    /**
      * Returns true if the mesh should render, otherwise false.
      * @param mesh The mesh to render
      * @returns true if it should render otherwise false
      */
    /* protected */ def _shouldRenderMesh(mesh: Mesh): Boolean = js.native
    
    var _verticalBlurPostprocess1: js.Any = js.native
    
    var _verticalBlurPostprocess2: js.Any = js.native
    
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
    def serialize_MGlowLayer(): js.Any = js.native
    
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
    @scala.inline
    def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
    
    /**
      * The default texture size ratio used for the glow.
      */
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer.DefaultTextureRatio")
    @js.native
    def DefaultTextureRatio: Double = js.native
    @scala.inline
    def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
    
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
    @JSImport("babylonjs/Layers/glowLayer", "GlowLayer.Parse")
    @js.native
    def Parse(parsedGlowLayer: js.Any, scene: Scene, rootUrl: String): GlowLayer = js.native
  }
  
  @js.native
  trait IGlowLayerOptions extends StObject {
    
    /**
      * How big is the kernel of the blur texture.
      */
    var blurKernelSize: Double = js.native
    
    /**
      * The camera attached to the layer.
      */
    var camera: Nullable[Camera] = js.native
    
    /**
      * Enforces a fixed size texture to ensure resize independant blur.
      */
    var mainTextureFixedSize: js.UndefOr[Double] = js.native
    
    /**
      * Multiplication factor apply to the canvas size to compute the render target size
      * used to generated the glowing objects (the smaller the faster).
      */
    var mainTextureRatio: Double = js.native
    
    /**
      * Enable MSAA by chosing the number of samples.
      */
    var mainTextureSamples: js.UndefOr[Double] = js.native
    
    /**
      * The rendering group to draw the layer in.
      */
    var renderingGroupId: Double = js.native
  }
  object IGlowLayerOptions {
    
    @scala.inline
    def apply(blurKernelSize: Double, mainTextureRatio: Double, renderingGroupId: Double): IGlowLayerOptions = {
      val __obj = js.Dynamic.literal(blurKernelSize = blurKernelSize.asInstanceOf[js.Any], mainTextureRatio = mainTextureRatio.asInstanceOf[js.Any], renderingGroupId = renderingGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGlowLayerOptions]
    }
    
    @scala.inline
    implicit class IGlowLayerOptionsMutableBuilder[Self <: IGlowLayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurKernelSize(value: Double): Self = StObject.set(x, "blurKernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Nullable[Camera]): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraNull: Self = StObject.set(x, "camera", null)
      
      @scala.inline
      def setMainTextureFixedSize(value: Double): Self = StObject.set(x, "mainTextureFixedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainTextureFixedSizeUndefined: Self = StObject.set(x, "mainTextureFixedSize", js.undefined)
      
      @scala.inline
      def setMainTextureRatio(value: Double): Self = StObject.set(x, "mainTextureRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainTextureSamples(value: Double): Self = StObject.set(x, "mainTextureSamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainTextureSamplesUndefined: Self = StObject.set(x, "mainTextureSamples", js.undefined)
      
      @scala.inline
      def setRenderingGroupId(value: Double): Self = StObject.set(x, "renderingGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * Return a the first highlight layer of the scene with a given name.
        * @param name The name of the highlight layer to look for.
        * @return The highlight layer if found otherwise null.
        */
      def getGlowLayerByName(name: String): Nullable[GlowLayer] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(getGlowLayerByName: String => Nullable[GlowLayer]): AbstractScene = {
        val __obj = js.Dynamic.literal(getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName))
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      }
    }
  }
}

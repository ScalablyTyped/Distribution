package typings.babylonjs

import typings.babylonjs.engineRenderTargetMod.RenderTargetTextureSize
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proceduralsIndexMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "CustomProceduralTexture")
  @js.native
  class CustomProceduralTexture protected ()
    extends typings.babylonjs.customProceduralTextureMod.CustomProceduralTexture {
    /**
      * Instantiates a new Custom Procedural Texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * Custom Procedural textures are the easiest way to create your own procedural in your application.
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
      * @param name Define the name of the texture
      * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
      * @param size Define the size of the texture to create
      * @param scene Define the scene the texture belongs to
      * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
      * @param generateMipMaps Define if the texture should creates mip maps or not
      */
    def this(name: String, texturePath: String, size: Double, scene: Scene) = this()
    def this(name: String, texturePath: String, size: Double, scene: Scene, fallbackTexture: Texture) = this()
    def this(
      name: String,
      texturePath: String,
      size: Double,
      scene: Scene,
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: Double,
      scene: Scene,
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "NoiseProceduralTexture")
  @js.native
  class NoiseProceduralTexture protected ()
    extends typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture {
    /**
      * Creates a new NoiseProceduralTexture
      * @param name defines the name fo the texture
      * @param size defines the size of the texture (default is 256)
      * @param scene defines the hosting scene
      * @param fallbackTexture defines the texture to use if the NoiseProceduralTexture can't be created
      * @param generateMipMaps defines if mipmaps must be generated (true by default)
      */
    def this(name: String) = this()
    def this(name: String, size: Double) = this()
    def this(name: String, size: js.UndefOr[scala.Nothing], scene: Nullable[Scene]) = this()
    def this(name: String, size: Double, scene: Nullable[Scene]) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture
    ) = this()
    def this(name: String, size: Double, scene: js.UndefOr[Nullable[Scene]], fallbackTexture: Texture) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: js.UndefOr[scala.Nothing],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: js.UndefOr[Nullable[Scene]],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
  }
  /* static members */
  object NoiseProceduralTexture {
    
    /**
      * Creates a NoiseProceduralTexture from parsed noise procedural texture data
      * @param parsedTexture defines parsed texture data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing noise procedural texture information
      * @returns a parsed NoiseProceduralTexture
      */
    @JSImport("babylonjs/Materials/Textures/Procedurals/index", "NoiseProceduralTexture.Parse")
    @js.native
    def Parse(parsedTexture: js.Any, scene: Scene): typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture = js.native
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "ProceduralTexture")
  @js.native
  class ProceduralTexture protected ()
    extends typings.babylonjs.proceduralTextureMod.ProceduralTexture {
    /**
      * Instantiates a new procedural texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * This is the base class of any Procedural texture and contains most of the shareable code.
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      * @param name  Define the name of the texture
      * @param size Define the size of the texture to create
      * @param fragment Define the fragment shader to use to generate the texture or null if it is defined later
      * @param scene Define the scene the texture belongs to
      * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
      * @param generateMipMaps Define if the texture should creates mip maps or not
      * @param isCube Define if the texture is a cube texture or not (this will render each faces of the cube)
      * @param textureType The FBO internal texture type
      */
    def this(name: String, size: RenderTargetTextureSize, fragment: js.Any, scene: Nullable[Scene]) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture]
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: js.UndefOr[scala.Nothing],
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: Boolean,
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: js.UndefOr[scala.Nothing],
      isCube: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: js.UndefOr[scala.Nothing],
      isCube: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: Boolean,
      isCube: js.UndefOr[scala.Nothing],
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: RenderTargetTextureSize,
      fragment: js.Any,
      scene: Nullable[Scene],
      fallbackTexture: js.UndefOr[Nullable[Texture]],
      generateMipMaps: Boolean,
      isCube: Boolean,
      textureType: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "ProceduralTextureSceneComponent")
  @js.native
  class ProceduralTextureSceneComponent protected ()
    extends typings.babylonjs.proceduralTextureSceneComponentMod.ProceduralTextureSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    @js.native
    trait AbstractScene extends StObject {
      
      /**
        * The list of procedural textures added to the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
        */
      var proceduralTextures: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture] = js.native
    }
    object AbstractScene {
      
      @scala.inline
      def apply(proceduralTextures: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture]): AbstractScene = {
        val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit class AbstractSceneMutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProceduralTextures(value: js.Array[typings.babylonjs.proceduralTextureMod.ProceduralTexture]): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProceduralTexturesVarargs(value: typings.babylonjs.proceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value :_*))
      }
    }
  }
}

package typings.babylonjs

import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesProceduralsIndexMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "CustomProceduralTexture")
  @js.native
  open class CustomProceduralTexture protected ()
    extends typings.babylonjs.materialsTexturesProceduralsCustomProceduralTextureMod.CustomProceduralTexture {
    /**
      * Instantiates a new Custom Procedural Texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * Custom Procedural textures are the easiest way to create your own procedural in your application.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures#creating-custom-procedural-textures
      * @param name Define the name of the texture
      * @param texturePath Define the folder path containing all the custom texture related files (config, shaders...)
      * @param size Define the size of the texture to create
      * @param scene Define the scene the texture belongs to
      * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
      * @param generateMipMaps Define if the texture should creates mip maps or not
      * @param skipJson Define a boolena indicating that there is no json config file to load
      */
    def this(name: String, texturePath: String, size: TextureSize, scene: Scene) = this()
    def this(name: String, texturePath: String, size: TextureSize, scene: Scene, fallbackTexture: Texture) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Unit,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Unit,
      generateMipMaps: Boolean,
      skipJson: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Unit,
      generateMipMaps: Unit,
      skipJson: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Texture,
      generateMipMaps: Boolean,
      skipJson: Boolean
    ) = this()
    def this(
      name: String,
      texturePath: String,
      size: TextureSize,
      scene: Scene,
      fallbackTexture: Texture,
      generateMipMaps: Unit,
      skipJson: Boolean
    ) = this()
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "NoiseProceduralTexture")
  @js.native
  open class NoiseProceduralTexture protected ()
    extends typings.babylonjs.materialsTexturesProceduralsNoiseProceduralTextureMod.NoiseProceduralTexture {
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
    def this(name: String, size: Double, scene: Nullable[Scene]) = this()
    def this(name: String, size: Unit, scene: Nullable[Scene]) = this()
    def this(name: String, size: Double, scene: Unit, fallbackTexture: Texture) = this()
    def this(name: String, size: Double, scene: Nullable[Scene], fallbackTexture: Texture) = this()
    def this(name: String, size: Unit, scene: Unit, fallbackTexture: Texture) = this()
    def this(name: String, size: Unit, scene: Nullable[Scene], fallbackTexture: Texture) = this()
    def this(name: String, size: Double, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
    def this(name: String, size: Double, scene: Unit, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
    def this(
      name: String,
      size: Double,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: Double,
      scene: Nullable[Scene],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
    def this(name: String, size: Unit, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
    def this(name: String, size: Unit, scene: Unit, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
    def this(name: String, size: Unit, scene: Nullable[Scene], fallbackTexture: Unit, generateMipMaps: Boolean) = this()
    def this(
      name: String,
      size: Unit,
      scene: Nullable[Scene],
      fallbackTexture: Texture,
      generateMipMaps: Boolean
    ) = this()
  }
  /* static members */
  object NoiseProceduralTexture {
    
    @JSImport("babylonjs/Materials/Textures/Procedurals/index", "NoiseProceduralTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a NoiseProceduralTexture from parsed noise procedural texture data
      * @param parsedTexture defines parsed texture data
      * @param scene defines the current scene
      * @returns a parsed NoiseProceduralTexture
      */
    inline def Parse(parsedTexture: Any, scene: Scene): typings.babylonjs.materialsTexturesProceduralsNoiseProceduralTextureMod.NoiseProceduralTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.materialsTexturesProceduralsNoiseProceduralTextureMod.NoiseProceduralTexture]
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "ProceduralTexture")
  @js.native
  open class ProceduralTexture protected ()
    extends typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture {
    /**
      * Instantiates a new procedural texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * This is the base class of any Procedural texture and contains most of the shareable code.
      * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures
      * @param name  Define the name of the texture
      * @param size Define the size of the texture to create
      * @param fragment Define the fragment shader to use to generate the texture or null if it is defined later
      * @param scene Define the scene the texture belongs to
      * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
      * @param generateMipMaps Define if the texture should creates mip maps or not
      * @param isCube Define if the texture is a cube texture or not (this will render each faces of the cube)
      * @param textureType The FBO internal texture type
      */
    def this(name: String, size: TextureSize, fragment: Any, scene: Nullable[Scene]) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture]
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Boolean,
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Unit,
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Boolean,
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Unit,
      isCube: Boolean
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Boolean,
      isCube: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Boolean,
      isCube: Unit,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Unit,
      isCube: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Unit,
      generateMipMaps: Unit,
      isCube: Unit,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Boolean,
      isCube: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Boolean,
      isCube: Unit,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Unit,
      isCube: Boolean,
      textureType: Double
    ) = this()
    def this(
      name: String,
      size: TextureSize,
      fragment: Any,
      scene: Nullable[Scene],
      fallbackTexture: Nullable[Texture],
      generateMipMaps: Unit,
      isCube: Unit,
      textureType: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/index", "ProceduralTextureSceneComponent")
  @js.native
  open class ProceduralTextureSceneComponent protected ()
    extends typings.babylonjs.materialsTexturesProceduralsProceduralTextureSceneComponentMod.ProceduralTextureSceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * The list of procedural textures added to the scene
        * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/proceduralTextures
        */
      var proceduralTextures: js.Array[
            typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
          ]
    }
    object AbstractScene {
      
      inline def apply(
        proceduralTextures: js.Array[
              typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
            ]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractScene]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractScene] (val x: Self) extends AnyVal {
        
        inline def setProceduralTextures(
          value: js.Array[
                  typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
                ]
        ): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
        
        inline def setProceduralTexturesVarargs(value: typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture*): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
      }
    }
  }
}

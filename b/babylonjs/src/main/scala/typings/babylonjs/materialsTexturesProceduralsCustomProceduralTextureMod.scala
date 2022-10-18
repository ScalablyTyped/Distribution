package typings.babylonjs

import typings.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.materialsTexturesTextureMod.Texture
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesProceduralsCustomProceduralTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/Procedurals/customProceduralTexture", "CustomProceduralTexture")
  @js.native
  open class CustomProceduralTexture protected () extends ProceduralTexture {
    /**
      * Instantiates a new Custom Procedural Texture.
      * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
      * Custom Procedural textures are the easiest way to create your own procedural in your application.
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
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
    
    /* private */ var _animate: Any = js.native
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _loadJson: Any = js.native
    
    /* private */ var _texturePath: Any = js.native
    
    /* private */ var _time: Any = js.native
    
    /**
      * Define if the texture animates or not.
      */
    def animate: Boolean = js.native
    def animate_=(value: Boolean): Unit = js.native
    
    /**
      * Update the uniform values of the procedural texture in the shader.
      */
    def updateShaderUniforms(): Unit = js.native
    
    /**
      * Update the list of dependant textures samplers in the shader.
      */
    def updateTextures(): Unit = js.native
  }
}

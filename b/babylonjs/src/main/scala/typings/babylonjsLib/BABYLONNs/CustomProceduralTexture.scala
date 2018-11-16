package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
     * Custom Procedural textures are the easiest way to create your own procedural in your application.
     * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
     */
@JSGlobal("BABYLON.CustomProceduralTexture")
@js.native
class CustomProceduralTexture protected () extends ProceduralTexture {
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: Scene) = this()
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: Scene, fallbackTexture: Texture) = this()
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: scala.Boolean) = this()
  var _animate: js.Any = js.native
  var _config: js.Any = js.native
  var _loadJson: js.Any = js.native
  var _texturePath: js.Any = js.native
  var _time: js.Any = js.native
  /**
           * Define if the texture animates or not.
           */
  var animate: scala.Boolean = js.native
  /**
           * Update the uniform values of the procedural texture in the shader.
           */
  def updateShaderUniforms(): scala.Unit = js.native
  /**
           * Update the list of dependant textures samplers in the shader.
           */
  def updateTextures(): scala.Unit = js.native
}


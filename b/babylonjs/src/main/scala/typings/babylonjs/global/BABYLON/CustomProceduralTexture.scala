package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.TextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CustomProceduralTexture")
@js.native
open class CustomProceduralTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.CustomProceduralTexture {
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
  def this(name: String, texturePath: String, size: TextureSize, scene: typings.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: typings.babylonjs.BABYLON.Texture
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: typings.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: Unit,
    generateMipMaps: Boolean,
    skipJson: Boolean
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: Unit,
    generateMipMaps: Unit,
    skipJson: Boolean
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: typings.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean,
    skipJson: Boolean
  ) = this()
  def this(
    name: String,
    texturePath: String,
    size: TextureSize,
    scene: typings.babylonjs.BABYLON.Scene,
    fallbackTexture: typings.babylonjs.BABYLON.Texture,
    generateMipMaps: Unit,
    skipJson: Boolean
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

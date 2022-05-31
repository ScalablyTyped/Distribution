package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.RenderTargetTextureSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ProceduralTexture")
@js.native
class ProceduralTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ProceduralTexture {
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
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture]
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean,
    isCube: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Unit,
    isCube: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Boolean,
    isCube: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Unit,
    isCube: Boolean
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean,
    isCube: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Unit,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Unit,
    isCube: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Boolean,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Boolean,
    isCube: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Unit,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: RenderTargetTextureSize,
    fragment: js.Any,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: Nullable[typings.babylonjs.BABYLON.Texture],
    generateMipMaps: Unit,
    isCube: Unit,
    textureType: Double
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

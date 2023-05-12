package typings.babylonjs.materialsIndexMod

import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "ProceduralTexture")
@js.native
open class ProceduralTexture protected ()
  extends typings.babylonjs.materialsTexturesIndexMod.ProceduralTexture {
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
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture]
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
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
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
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
    generateMipMaps: Boolean,
    isCube: Boolean
  ) = this()
  def this(
    name: String,
    size: TextureSize,
    fragment: Any,
    scene: Nullable[Scene],
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
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
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
    generateMipMaps: Boolean,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: TextureSize,
    fragment: Any,
    scene: Nullable[Scene],
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
    generateMipMaps: Boolean,
    isCube: Unit,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: TextureSize,
    fragment: Any,
    scene: Nullable[Scene],
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
    generateMipMaps: Unit,
    isCube: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    size: TextureSize,
    fragment: Any,
    scene: Nullable[Scene],
    fallbackTexture: Nullable[typings.babylonjs.materialsTexturesTextureMod.Texture],
    generateMipMaps: Unit,
    isCube: Unit,
    textureType: Double
  ) = this()
}

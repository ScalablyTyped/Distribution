package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends typings.babylonjs.texturesIndexMod.NoiseProceduralTexture {
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
  def this(
    name: String,
    size: Double,
    scene: Nullable[Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "NoiseProceduralTexture")
@js.native
object NoiseProceduralTexture extends js.Object {
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  def Parse(parsedTexture: js.Any, scene: Scene): typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture = js.native
}


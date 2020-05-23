package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends typings.babylonjs.BABYLON.NoiseProceduralTexture {
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
  def this(name: String, size: Double, scene: Nullable[typings.babylonjs.BABYLON.Scene]) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: typings.babylonjs.BABYLON.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene],
    fallbackTexture: typings.babylonjs.BABYLON.Texture,
    generateMipMaps: Boolean
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.NoiseProceduralTexture")
@js.native
object NoiseProceduralTexture extends js.Object {
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  def Parse(parsedTexture: js.Any, scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.NoiseProceduralTexture = js.native
}


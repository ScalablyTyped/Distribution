package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to generate noise procedural textures
  */
@JSImport("babylonjs", "NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends babylonjsLib.BABYLONNs.NoiseProceduralTexture {
  /**
    * Creates a new NoiseProceduralTexture
    * @param name defines the name fo the texture
    * @param size defines the size of the texture (default is 256)
    * @param scene defines the hosting scene
    * @param fallbackTexture defines the texture to use if the NoiseProceduralTexture can't be created
    * @param generateMipMaps defines if mipmaps must be generated (true by default)
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, size: scala.Double) = this()
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], fallbackTexture: babylonjsLib.BABYLONNs.Texture) = this()
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], fallbackTexture: babylonjsLib.BABYLONNs.Texture, generateMipMaps: scala.Boolean) = this()
}

/**
  * Class used to generate noise procedural textures
  */
@JSImport("babylonjs", "NoiseProceduralTexture")
@js.native
object NoiseProceduralTexture extends js.Object {
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  def Parse(parsedTexture: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.NoiseProceduralTexture = js.native
}


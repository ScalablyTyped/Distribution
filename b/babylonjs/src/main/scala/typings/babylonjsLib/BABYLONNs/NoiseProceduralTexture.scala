package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to generate noise procedural textures
  */
@JSGlobal("BABYLON.NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected () extends ProceduralTexture {
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
  def this(name: java.lang.String, size: scala.Double, scene: Nullable[Scene]) = this()
  def this(name: java.lang.String, size: scala.Double, scene: Nullable[Scene], fallbackTexture: Texture) = this()
  def this(name: java.lang.String, size: scala.Double, scene: Nullable[Scene], fallbackTexture: Texture, generateMipMaps: scala.Boolean) = this()
  var _time: js.Any = js.native
  var _updateShaderUniforms: js.Any = js.native
  /** Gets or sets animation speed factor (default is 1) */
  var animationSpeedFactor: scala.Double = js.native
  /** Gets or sets a value between 0 and 1 indicating the overall brightness of the texture (default is 0.2) */
  var brightness: scala.Double = js.native
  /** Defines the number of octaves to process */
  var octaves: scala.Double = js.native
  /** Defines the level of persistence (0.8 by default) */
  var persistence: scala.Double = js.native
}

/**
  * Class used to generate noise procedural textures
  */
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
  def Parse(parsedTexture: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.NoiseProceduralTexture = js.native
}


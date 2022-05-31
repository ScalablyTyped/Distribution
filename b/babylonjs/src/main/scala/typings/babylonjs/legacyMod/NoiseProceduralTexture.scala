package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends typings.babylonjs.indexMod.NoiseProceduralTexture {
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
  def this(name: String, size: Double, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
  def this(name: String, size: Unit, scene: Nullable[typings.babylonjs.sceneMod.Scene]) = this()
  def this(name: String, size: Double, scene: Unit, fallbackTexture: typings.babylonjs.textureMod.Texture) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture
  ) = this()
  def this(name: String, size: Unit, scene: Unit, fallbackTexture: typings.babylonjs.textureMod.Texture) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture
  ) = this()
  def this(name: String, size: Double, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Double,
    scene: Unit,
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(name: String, size: Unit, scene: Unit, fallbackTexture: Unit, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Unit,
    scene: Unit,
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: Unit,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Unit,
    scene: Nullable[typings.babylonjs.sceneMod.Scene],
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
}
/* static members */
object NoiseProceduralTexture {
  
  @JSImport("babylonjs/Legacy/legacy", "NoiseProceduralTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  inline def Parse(parsedTexture: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture]
}

package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to host texture specific utilities
  */
@JSImport("babylonjs", "TextureTools")
@js.native
class TextureTools ()
  extends babylonjsLib.BABYLONNs.TextureTools

/**
  * Class used to host texture specific utilities
  */
@JSImport("babylonjs", "TextureTools")
@js.native
object TextureTools extends js.Object {
  var _environmentBRDFBase64Texture: js.Any = js.native
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @return the generated texture
    */
  def CreateResizedCopy(texture: babylonjsLib.BABYLONNs.Texture, width: scala.Double, height: scala.Double): babylonjsLib.BABYLONNs.Texture = js.native
  def CreateResizedCopy(
    texture: babylonjsLib.BABYLONNs.Texture,
    width: scala.Double,
    height: scala.Double,
    useBilinearMode: scala.Boolean
  ): babylonjsLib.BABYLONNs.Texture = js.native
  /**
    * Gets an environment BRDF texture for a given scene
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  def GetEnvironmentBRDFTexture(scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.BaseTexture = js.native
}


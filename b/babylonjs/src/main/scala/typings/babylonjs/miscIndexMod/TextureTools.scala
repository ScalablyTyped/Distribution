package typings.babylonjs.miscIndexMod

import typings.babylonjs.textureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "TextureTools")
@js.native
class TextureTools ()
  extends typings.babylonjs.textureToolsMod.TextureTools
/* static members */
object TextureTools {
  
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @return the generated texture
    */
  @JSImport("babylonjs/Misc/index", "TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(texture: Texture, width: Double, height: Double): Texture = js.native
  @JSImport("babylonjs/Misc/index", "TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(texture: Texture, width: Double, height: Double, useBilinearMode: Boolean): Texture = js.native
}

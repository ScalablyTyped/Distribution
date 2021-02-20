package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureTools")
@js.native
class TextureTools ()
  extends typings.babylonjs.BABYLON.TextureTools
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
  @JSGlobal("BABYLON.TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(texture: typings.babylonjs.BABYLON.Texture, width: Double, height: Double): typings.babylonjs.BABYLON.Texture = js.native
  @JSGlobal("BABYLON.TextureTools.CreateResizedCopy")
  @js.native
  def CreateResizedCopy(
    texture: typings.babylonjs.BABYLON.Texture,
    width: Double,
    height: Double,
    useBilinearMode: Boolean
  ): typings.babylonjs.BABYLON.Texture = js.native
}

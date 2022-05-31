package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureTools")
@js.native
class TextureTools ()
  extends StObject
     with typings.babylonjs.BABYLON.TextureTools
/* static members */
object TextureTools {
  
  @JSGlobal("BABYLON.TextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Uses the GPU to create a copy texture rescaled at a given size
    * @param texture Texture to copy from
    * @param width defines the desired width
    * @param height defines the desired height
    * @param useBilinearMode defines if bilinear mode has to be used
    * @return the generated texture
    */
  inline def CreateResizedCopy(texture: typings.babylonjs.BABYLON.Texture, width: Double, height: Double): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]
  inline def CreateResizedCopy(
    texture: typings.babylonjs.BABYLON.Texture,
    width: Double,
    height: Double,
    useBilinearMode: Boolean
  ): typings.babylonjs.BABYLON.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateResizedCopy")(texture.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], useBilinearMode.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Texture]
}

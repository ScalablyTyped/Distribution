package typings.babylonjs

import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/textureTools", JSImport.Namespace)
@js.native
object textureToolsMod extends js.Object {
  
  @js.native
  class TextureTools () extends js.Object
  /* static members */
  @js.native
  object TextureTools extends js.Object {
    
    /**
      * Uses the GPU to create a copy texture rescaled at a given size
      * @param texture Texture to copy from
      * @param width defines the desired width
      * @param height defines the desired height
      * @param useBilinearMode defines if bilinear mode has to be used
      * @return the generated texture
      */
    def CreateResizedCopy(texture: Texture, width: Double, height: Double): Texture = js.native
    def CreateResizedCopy(texture: Texture, width: Double, height: Double, useBilinearMode: Boolean): Texture = js.native
  }
}

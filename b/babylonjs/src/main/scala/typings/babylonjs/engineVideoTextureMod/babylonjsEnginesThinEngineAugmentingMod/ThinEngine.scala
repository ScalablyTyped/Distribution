package typings.babylonjs.engineVideoTextureMod.babylonjsEnginesThinEngineAugmentingMod

import typings.babylonjs.HTMLVideoElement
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThinEngine extends js.Object {
  /**
    * Update a video texture
    * @param texture defines the texture to update
    * @param video defines the video element to use
    * @param invertY defines if data must be stored with Y axis inverted
    */
  def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit
}

object ThinEngine {
  @scala.inline
  def apply(updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit): ThinEngine = {
    val __obj = js.Dynamic.literal(updateVideoTexture = js.Any.fromFunction3(updateVideoTexture))
  
    __obj.asInstanceOf[ThinEngine]
  }
}


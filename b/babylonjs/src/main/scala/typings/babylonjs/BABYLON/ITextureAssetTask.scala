package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextureAssetTask[TEX /* <: BaseTexture */] extends js.Object {
  /**
    * Gets the loaded texture
    */
  var texture: TEX
}

object ITextureAssetTask {
  @scala.inline
  def apply[TEX](texture: TEX): ITextureAssetTask[TEX] = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextureAssetTask[TEX]]
  }
}


package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the interface used by texture loading tasks
  */
trait ITextureAssetTask[TEX /* <: BaseTexture */] extends js.Object {
  /**
    * Gets the loaded texture
    */
  var texture: TEX
}

object ITextureAssetTask {
  @scala.inline
  def apply[TEX /* <: BaseTexture */](texture: TEX): ITextureAssetTask[TEX] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextureAssetTask[TEX]]
  }
}


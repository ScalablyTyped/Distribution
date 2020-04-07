package typings.babylonjs

import typings.babylonjs.BABYLON.BaseTexture
import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTexture extends js.Object {
  var color: Color4
  var texture: Nullable[BaseTexture]
}

object AnonTexture {
  @scala.inline
  def apply(color: Color4, texture: Nullable[BaseTexture] = null): AnonTexture = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTexture]
  }
}


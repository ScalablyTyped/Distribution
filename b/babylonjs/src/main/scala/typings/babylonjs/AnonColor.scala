package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: Color4
  var texture: Nullable[BaseTexture]
}

object AnonColor {
  @scala.inline
  def apply(color: Color4, texture: Nullable[BaseTexture] = null): AnonColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (texture != null) __obj.updateDynamic("texture")(texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}


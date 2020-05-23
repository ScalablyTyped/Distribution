package typings.babylonjs.anon

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: Color4
  var texture: Nullable[BaseTexture]
}

object Color {
  @scala.inline
  def apply(color: Color4, texture: Nullable[BaseTexture] = null): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}


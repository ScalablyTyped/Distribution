package typings
package baseuiLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VARIANT extends js.Object {
  var light: baseuiLib.baseuiLibStrings.light
  var outlined: baseuiLib.baseuiLibStrings.outlined
  var solid: baseuiLib.baseuiLibStrings.solid
}

object VARIANT {
  @scala.inline
  def apply(
    light: baseuiLib.baseuiLibStrings.light,
    outlined: baseuiLib.baseuiLibStrings.outlined,
    solid: baseuiLib.baseuiLibStrings.solid
  ): VARIANT = {
    val __obj = js.Dynamic.literal(light = light, outlined = outlined, solid = solid)
  
    __obj.asInstanceOf[VARIANT]
  }
}


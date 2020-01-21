package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkBlurStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInner extends js.Object {
  var Inner: SkBlurStyle
  var Normal: SkBlurStyle
  var Outer: SkBlurStyle
  var Solid: SkBlurStyle
}

object AnonInner {
  @scala.inline
  def apply(Inner: SkBlurStyle, Normal: SkBlurStyle, Outer: SkBlurStyle, Solid: SkBlurStyle): AnonInner = {
    val __obj = js.Dynamic.literal(Inner = Inner.asInstanceOf[js.Any], Normal = Normal.asInstanceOf[js.Any], Outer = Outer.asInstanceOf[js.Any], Solid = Solid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInner]
  }
}


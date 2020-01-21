package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkAlphaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpaque extends js.Object {
  var Opaque: SkAlphaType
  var Premul: SkAlphaType
  var Unpremul: SkAlphaType
}

object AnonOpaque {
  @scala.inline
  def apply(Opaque: SkAlphaType, Premul: SkAlphaType, Unpremul: SkAlphaType): AnonOpaque = {
    val __obj = js.Dynamic.literal(Opaque = Opaque.asInstanceOf[js.Any], Premul = Premul.asInstanceOf[js.Any], Unpremul = Unpremul.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOpaque]
  }
}


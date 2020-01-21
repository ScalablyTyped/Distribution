package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkTextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLTR extends js.Object {
  var LTR: SkTextDirection
  var RTL: SkTextDirection
}

object AnonLTR {
  @scala.inline
  def apply(LTR: SkTextDirection, RTL: SkTextDirection): AnonLTR = {
    val __obj = js.Dynamic.literal(LTR = LTR.asInstanceOf[js.Any], RTL = RTL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLTR]
  }
}


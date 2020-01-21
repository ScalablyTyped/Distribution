package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkFilterQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHigh extends js.Object {
  var High: SkFilterQuality
  var Low: SkFilterQuality
  var Medium: SkFilterQuality
  var None: SkFilterQuality
}

object AnonHigh {
  @scala.inline
  def apply(High: SkFilterQuality, Low: SkFilterQuality, Medium: SkFilterQuality, None: SkFilterQuality): AnonHigh = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHigh]
  }
}


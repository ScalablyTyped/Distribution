package typings.canvaskitDashWasm

import typings.canvaskitDashWasm.canvaskitDashWasmMod.SkFilterQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_High extends js.Object {
  var High: SkFilterQuality
  var Low: SkFilterQuality
  var Medium: SkFilterQuality
  var None: SkFilterQuality
}

object Anon_High {
  @scala.inline
  def apply(High: SkFilterQuality, Low: SkFilterQuality, Medium: SkFilterQuality, None: SkFilterQuality): Anon_High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Medium = Medium.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_High]
  }
}


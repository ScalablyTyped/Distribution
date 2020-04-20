package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var side: TAlign
  var text: String
}

object LabelOptions {
  @scala.inline
  def apply(side: TAlign, text: String): LabelOptions = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}


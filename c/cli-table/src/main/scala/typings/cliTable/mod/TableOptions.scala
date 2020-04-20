package typings.cliTable.mod

import typings.cliTable.PartialRecordtoptopmidtop
import typings.cliTable.Partialpaddingleftnumberp
import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var chars: PartialRecordtoptopmidtop
  var colAligns: js.Array[left | middle | right]
  var colWidths: js.Array[Double]
  var colors: Boolean
  var head: js.Array[String]
  var style: Partialpaddingleftnumberp
  var truncate: String
}

object TableOptions {
  @scala.inline
  def apply(
    chars: PartialRecordtoptopmidtop,
    colAligns: js.Array[left | middle | right],
    colWidths: js.Array[Double],
    colors: Boolean,
    head: js.Array[String],
    style: Partialpaddingleftnumberp,
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}


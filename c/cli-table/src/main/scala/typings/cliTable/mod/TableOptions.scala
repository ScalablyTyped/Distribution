package typings.cliTable.mod

import typings.cliTable.AnonBorder
import typings.cliTable.cliTableStrings.`bottom-left`
import typings.cliTable.cliTableStrings.`bottom-mid`
import typings.cliTable.cliTableStrings.`bottom-right`
import typings.cliTable.cliTableStrings.`left-mid`
import typings.cliTable.cliTableStrings.`mid-mid`
import typings.cliTable.cliTableStrings.`right-mid`
import typings.cliTable.cliTableStrings.`top-left`
import typings.cliTable.cliTableStrings.`top-mid`
import typings.cliTable.cliTableStrings.`top-right`
import typings.cliTable.cliTableStrings.bottom
import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.mid
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import typings.cliTable.cliTableStrings.top
import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var chars: Partial[
    Record[
      top | `top-mid` | `top-left` | `top-right` | bottom | `bottom-mid` | `bottom-left` | `bottom-right` | left | `left-mid` | mid | `mid-mid` | right | `right-mid` | middle, 
      String
    ]
  ]
  var colAligns: js.Array[left | middle | right]
  var colWidths: js.Array[Double]
  var colors: Boolean
  var head: js.Array[String]
  var style: Partial[AnonBorder]
  var truncate: String
}

object TableOptions {
  @scala.inline
  def apply(
    chars: Partial[
      Record[
        top | `top-mid` | `top-left` | `top-right` | bottom | `bottom-mid` | `bottom-left` | `bottom-right` | left | `left-mid` | mid | `mid-mid` | right | `right-mid` | middle, 
        String
      ]
    ],
    colAligns: js.Array[left | middle | right],
    colWidths: js.Array[Double],
    colors: Boolean,
    head: js.Array[String],
    style: Partial[AnonBorder],
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableOptions]
  }
}


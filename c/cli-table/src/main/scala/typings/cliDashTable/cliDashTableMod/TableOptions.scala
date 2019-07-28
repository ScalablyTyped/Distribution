package typings.cliDashTable.cliDashTableMod

import typings.cliDashTable.Anon_Border
import typings.cliDashTable.cliDashTableStrings.`bottom-left`
import typings.cliDashTable.cliDashTableStrings.`bottom-mid`
import typings.cliDashTable.cliDashTableStrings.`bottom-right`
import typings.cliDashTable.cliDashTableStrings.`left-mid`
import typings.cliDashTable.cliDashTableStrings.`mid-mid`
import typings.cliDashTable.cliDashTableStrings.`right-mid`
import typings.cliDashTable.cliDashTableStrings.`top-left`
import typings.cliDashTable.cliDashTableStrings.`top-mid`
import typings.cliDashTable.cliDashTableStrings.`top-right`
import typings.cliDashTable.cliDashTableStrings.bottom
import typings.cliDashTable.cliDashTableStrings.left
import typings.cliDashTable.cliDashTableStrings.mid
import typings.cliDashTable.cliDashTableStrings.middle
import typings.cliDashTable.cliDashTableStrings.right
import typings.cliDashTable.cliDashTableStrings.top
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
  var style: Partial[Anon_Border]
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
    style: Partial[Anon_Border],
    truncate: String
  ): TableOptions = {
    val __obj = js.Dynamic.literal(chars = chars, colAligns = colAligns, colWidths = colWidths, colors = colors, head = head, style = style, truncate = truncate)
  
    __obj.asInstanceOf[TableOptions]
  }
}


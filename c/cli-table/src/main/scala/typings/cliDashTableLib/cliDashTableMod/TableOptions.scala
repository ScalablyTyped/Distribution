package typings
package cliDashTableLib.cliDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var chars: stdLib.Partial[
    stdLib.Record[
      cliDashTableLib.cliDashTableLibStrings.top | cliDashTableLib.cliDashTableLibStrings.`top-mid` | cliDashTableLib.cliDashTableLibStrings.`top-left` | cliDashTableLib.cliDashTableLibStrings.`top-right` | cliDashTableLib.cliDashTableLibStrings.bottom | cliDashTableLib.cliDashTableLibStrings.`bottom-mid` | cliDashTableLib.cliDashTableLibStrings.`bottom-left` | cliDashTableLib.cliDashTableLibStrings.`bottom-right` | cliDashTableLib.cliDashTableLibStrings.left | cliDashTableLib.cliDashTableLibStrings.`left-mid` | cliDashTableLib.cliDashTableLibStrings.mid | cliDashTableLib.cliDashTableLibStrings.`mid-mid` | cliDashTableLib.cliDashTableLibStrings.right | cliDashTableLib.cliDashTableLibStrings.`right-mid` | cliDashTableLib.cliDashTableLibStrings.middle, 
      java.lang.String
    ]
  ]
  var colAligns: js.Array[
    cliDashTableLib.cliDashTableLibStrings.left | cliDashTableLib.cliDashTableLibStrings.middle | cliDashTableLib.cliDashTableLibStrings.right
  ]
  var colWidths: js.Array[scala.Double]
  var colors: scala.Boolean
  var head: js.Array[java.lang.String]
  var style: stdLib.Partial[cliDashTableLib.Anon_Border]
  var truncate: java.lang.String
}

object TableOptions {
  @scala.inline
  def apply(
    chars: stdLib.Partial[
      stdLib.Record[
        cliDashTableLib.cliDashTableLibStrings.top | cliDashTableLib.cliDashTableLibStrings.`top-mid` | cliDashTableLib.cliDashTableLibStrings.`top-left` | cliDashTableLib.cliDashTableLibStrings.`top-right` | cliDashTableLib.cliDashTableLibStrings.bottom | cliDashTableLib.cliDashTableLibStrings.`bottom-mid` | cliDashTableLib.cliDashTableLibStrings.`bottom-left` | cliDashTableLib.cliDashTableLibStrings.`bottom-right` | cliDashTableLib.cliDashTableLibStrings.left | cliDashTableLib.cliDashTableLibStrings.`left-mid` | cliDashTableLib.cliDashTableLibStrings.mid | cliDashTableLib.cliDashTableLibStrings.`mid-mid` | cliDashTableLib.cliDashTableLibStrings.right | cliDashTableLib.cliDashTableLibStrings.`right-mid` | cliDashTableLib.cliDashTableLibStrings.middle, 
        java.lang.String
      ]
    ],
    colAligns: js.Array[
      cliDashTableLib.cliDashTableLibStrings.left | cliDashTableLib.cliDashTableLibStrings.middle | cliDashTableLib.cliDashTableLibStrings.right
    ],
    colWidths: js.Array[scala.Double],
    colors: scala.Boolean,
    head: js.Array[java.lang.String],
    style: stdLib.Partial[cliDashTableLib.Anon_Border],
    truncate: java.lang.String
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chars")(chars)
    __obj.updateDynamic("colAligns")(colAligns)
    __obj.updateDynamic("colWidths")(colWidths)
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("head")(head)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[TableOptions]
  }
}


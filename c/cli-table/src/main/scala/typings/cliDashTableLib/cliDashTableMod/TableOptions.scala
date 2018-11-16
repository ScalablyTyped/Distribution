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
  var style: stdLib.Partial[cliDashTableLib.Anon_Paddingleft]
  var truncate: java.lang.String
}


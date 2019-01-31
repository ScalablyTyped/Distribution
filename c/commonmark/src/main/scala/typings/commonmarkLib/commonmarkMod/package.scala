package typings
package commonmarkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonmarkMod {
  type NodeType = commonmarkLib.commonmarkLibStrings.text | commonmarkLib.commonmarkLibStrings.softbreak | commonmarkLib.commonmarkLibStrings.linebreak | commonmarkLib.commonmarkLibStrings.emph | commonmarkLib.commonmarkLibStrings.strong | commonmarkLib.commonmarkLibStrings.html_inline | commonmarkLib.commonmarkLibStrings.link | commonmarkLib.commonmarkLibStrings.image | commonmarkLib.commonmarkLibStrings.code | commonmarkLib.commonmarkLibStrings.document | commonmarkLib.commonmarkLibStrings.paragraph | commonmarkLib.commonmarkLibStrings.block_quote | commonmarkLib.commonmarkLibStrings.item | commonmarkLib.commonmarkLibStrings.list | commonmarkLib.commonmarkLibStrings.heading | commonmarkLib.commonmarkLibStrings.code_block | commonmarkLib.commonmarkLibStrings.html_block | commonmarkLib.commonmarkLibStrings.thematic_break | commonmarkLib.commonmarkLibStrings.custom_inline | commonmarkLib.commonmarkLibStrings.custom_block
  type Position = js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]
}

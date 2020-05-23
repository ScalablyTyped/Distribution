package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain | Null
  var name: String
  var prelude: AtrulePreludePlain | Raw | Null
  @JSName("type")
  var type_AtrulePlain: typings.cssTree.cssTreeStrings.Atrule
}

object AtrulePlain {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssTree.cssTreeStrings.Atrule,
    block: BlockPlain = null,
    loc: CssLocation = null,
    prelude: AtrulePreludePlain | Raw = null
  ): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePlain]
  }
}


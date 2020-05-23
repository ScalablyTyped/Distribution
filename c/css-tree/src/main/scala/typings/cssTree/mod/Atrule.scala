package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atrule
  extends CssNodeCommon
     with CssNode {
  var block: Block | Null
  var name: String
  var prelude: AtrulePrelude | Raw | Null
  @JSName("type")
  var type_Atrule: typings.cssTree.cssTreeStrings.Atrule
}

object Atrule {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssTree.cssTreeStrings.Atrule,
    block: Block = null,
    loc: CssLocation = null,
    prelude: AtrulePrelude | Raw = null
  ): Atrule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], prelude = prelude.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atrule]
  }
}


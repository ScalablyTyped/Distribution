package typings.cssDashTree.cssDashTreeMod

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
  var type_Atrule: typings.cssDashTree.cssDashTreeStrings.Atrule
}

object Atrule {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.cssDashTree.cssDashTreeStrings.Atrule,
    block: Block = null,
    loc: CssLocation = null,
    prelude: AtrulePrelude | Raw = null
  ): Atrule = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atrule]
  }
}


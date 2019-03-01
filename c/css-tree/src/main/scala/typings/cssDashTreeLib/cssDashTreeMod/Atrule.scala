package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atrule
  extends CssNodeCommon
     with CssNode {
  var block: Block | scala.Null
  var name: java.lang.String
  var prelude: AtrulePrelude | Raw | scala.Null
  @JSName("type")
  var type_Atrule: cssDashTreeLib.cssDashTreeLibStrings.Atrule
}

object Atrule {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Atrule,
    block: Block = null,
    loc: CssLocation = null,
    prelude: AtrulePrelude | Raw = null
  ): Atrule = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (block != null) __obj.updateDynamic("block")(block)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atrule]
  }
}


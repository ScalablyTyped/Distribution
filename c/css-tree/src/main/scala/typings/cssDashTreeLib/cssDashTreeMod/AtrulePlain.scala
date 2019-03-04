package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtrulePlain
  extends CssNodeCommon
     with CssNodePlain {
  var block: BlockPlain | scala.Null
  var name: java.lang.String
  var prelude: AtrulePreludePlain | Raw | scala.Null
  @JSName("type")
  var type_AtrulePlain: cssDashTreeLib.cssDashTreeLibStrings.Atrule
}

object AtrulePlain {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: cssDashTreeLib.cssDashTreeLibStrings.Atrule,
    block: BlockPlain = null,
    loc: CssLocation = null,
    prelude: AtrulePreludePlain | Raw = null
  ): AtrulePlain = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (prelude != null) __obj.updateDynamic("prelude")(prelude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtrulePlain]
  }
}


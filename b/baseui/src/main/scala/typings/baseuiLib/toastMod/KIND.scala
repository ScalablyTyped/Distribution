package typings
package baseuiLib.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KIND extends js.Object {
  var info: baseuiLib.baseuiLibStrings.info
  var negative: baseuiLib.baseuiLibStrings.negative
  var positive: baseuiLib.baseuiLibStrings.positive
  var warning: baseuiLib.baseuiLibStrings.warning
}

object KIND {
  @scala.inline
  def apply(
    info: baseuiLib.baseuiLibStrings.info,
    negative: baseuiLib.baseuiLibStrings.negative,
    positive: baseuiLib.baseuiLibStrings.positive,
    warning: baseuiLib.baseuiLibStrings.warning
  ): KIND = {
    val __obj = js.Dynamic.literal(info = info, negative = negative, positive = positive, warning = warning)
  
    __obj.asInstanceOf[KIND]
  }
}


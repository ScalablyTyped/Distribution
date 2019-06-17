package typings
package baseuiLib.tagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KIND extends js.Object {
  var custom: baseuiLib.baseuiLibStrings.custom
  var negative: baseuiLib.baseuiLibStrings.negative
  var neutral: baseuiLib.baseuiLibStrings.neutral
  var positive: baseuiLib.baseuiLibStrings.positive
  var primary: baseuiLib.baseuiLibStrings.primary
  var warning: baseuiLib.baseuiLibStrings.warning
}

object KIND {
  @scala.inline
  def apply(
    custom: baseuiLib.baseuiLibStrings.custom,
    negative: baseuiLib.baseuiLibStrings.negative,
    neutral: baseuiLib.baseuiLibStrings.neutral,
    positive: baseuiLib.baseuiLibStrings.positive,
    primary: baseuiLib.baseuiLibStrings.primary,
    warning: baseuiLib.baseuiLibStrings.warning
  ): KIND = {
    val __obj = js.Dynamic.literal(custom = custom, negative = negative, neutral = neutral, positive = positive, primary = primary, warning = warning)
  
    __obj.asInstanceOf[KIND]
  }
}


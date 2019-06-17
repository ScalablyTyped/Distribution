package typings
package baseuiLib.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KIND extends js.Object {
  var minimal: baseuiLib.baseuiLibStrings.minimal
  var primary: baseuiLib.baseuiLibStrings.primary
  var secondary: baseuiLib.baseuiLibStrings.secondary
  var tertiary: baseuiLib.baseuiLibStrings.tertiary
}

object KIND {
  @scala.inline
  def apply(
    minimal: baseuiLib.baseuiLibStrings.minimal,
    primary: baseuiLib.baseuiLibStrings.primary,
    secondary: baseuiLib.baseuiLibStrings.secondary,
    tertiary: baseuiLib.baseuiLibStrings.tertiary
  ): KIND = {
    val __obj = js.Dynamic.literal(minimal = minimal, primary = primary, secondary = secondary, tertiary = tertiary)
  
    __obj.asInstanceOf[KIND]
  }
}


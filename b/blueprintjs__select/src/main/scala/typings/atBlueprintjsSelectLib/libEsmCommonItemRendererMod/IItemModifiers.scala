package typings
package atBlueprintjsSelectLib.libEsmCommonItemRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemModifiers extends js.Object {
  /** Whether this is the "active" (focused) item, meaning keyboard interactions will act upon it. */
  var active: scala.Boolean
  /** Whether this item is disabled and should ignore interactions. */
  var disabled: scala.Boolean
  /** Whether this item matches the predicate. A typical renderer could hide `false` values. */
  var matchesPredicate: scala.Boolean
}

object IItemModifiers {
  @scala.inline
  def apply(active: scala.Boolean, disabled: scala.Boolean, matchesPredicate: scala.Boolean): IItemModifiers = {
    val __obj = js.Dynamic.literal(active = active, disabled = disabled, matchesPredicate = matchesPredicate)
  
    __obj.asInstanceOf[IItemModifiers]
  }
}


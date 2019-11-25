package typings.atBlueprintjsSelect.libEsmCommonItemRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemModifiers extends js.Object {
  /** Whether this is the "active" (focused) item, meaning keyboard interactions will act upon it. */
  var active: Boolean
  /** Whether this item is disabled and should ignore interactions. */
  var disabled: Boolean
  /** Whether this item matches the predicate. A typical renderer could hide `false` values. */
  var matchesPredicate: Boolean
}

object IItemModifiers {
  @scala.inline
  def apply(active: Boolean, disabled: Boolean, matchesPredicate: Boolean): IItemModifiers = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], matchesPredicate = matchesPredicate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IItemModifiers]
  }
}


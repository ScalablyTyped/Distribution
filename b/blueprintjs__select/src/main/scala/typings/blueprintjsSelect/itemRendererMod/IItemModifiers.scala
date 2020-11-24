package typings.blueprintjsSelect.itemRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IItemModifiers extends js.Object {
  
  /** Whether this is the "active" (focused) item, meaning keyboard interactions will act upon it. */
  var active: Boolean = js.native
  
  /** Whether this item is disabled and should ignore interactions. */
  var disabled: Boolean = js.native
  
  /** Whether this item matches the predicate. A typical renderer could hide `false` values. */
  var matchesPredicate: Boolean = js.native
}
object IItemModifiers {
  
  @scala.inline
  def apply(active: Boolean, disabled: Boolean, matchesPredicate: Boolean): IItemModifiers = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], matchesPredicate = matchesPredicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemModifiers]
  }
  
  @scala.inline
  implicit class IItemModifiersOps[Self <: IItemModifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchesPredicate(value: Boolean): Self = this.set("matchesPredicate", value.asInstanceOf[js.Any])
  }
}

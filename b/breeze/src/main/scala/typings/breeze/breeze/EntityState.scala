package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityState extends IEnum {
  var Added: EntityStateSymbol = js.native
  var Deleted: EntityStateSymbol = js.native
  var Detached: EntityStateSymbol = js.native
  var Modified: EntityStateSymbol = js.native
  var Unchanged: EntityStateSymbol = js.native
}

object EntityState {
  @scala.inline
  def apply(
    Added: EntityStateSymbol,
    Deleted: EntityStateSymbol,
    Detached: EntityStateSymbol,
    Modified: EntityStateSymbol,
    Unchanged: EntityStateSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityState = {
    val __obj = js.Dynamic.literal(Added = Added.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], Detached = Detached.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], Unchanged = Unchanged.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[EntityState]
  }
  @scala.inline
  implicit class EntityStateOps[Self <: EntityState] (val x: Self) extends AnyVal {
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
    def setAdded(value: EntityStateSymbol): Self = this.set("Added", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: EntityStateSymbol): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetached(value: EntityStateSymbol): Self = this.set("Detached", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: EntityStateSymbol): Self = this.set("Modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchanged(value: EntityStateSymbol): Self = this.set("Unchanged", value.asInstanceOf[js.Any])
  }
  
}


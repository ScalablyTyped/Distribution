package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityStateSymbol extends EnumSymbol {
  def isAdded(): Boolean
  def isAddedModifiedOrDeleted(): Boolean
  def isDeleted(): Boolean
  def isDetached(): Boolean
  def isModified(): Boolean
  def isUnchanged(): Boolean
  def isUnchangedOrModified(): Boolean
}

object EntityStateSymbol {
  @scala.inline
  def apply(
    getName: () => String,
    isAdded: () => Boolean,
    isAddedModifiedOrDeleted: () => Boolean,
    isDeleted: () => Boolean,
    isDetached: () => Boolean,
    isModified: () => Boolean,
    isUnchanged: () => Boolean,
    isUnchangedOrModified: () => Boolean,
    parentEnum: IEnum
  ): EntityStateSymbol = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), isAdded = js.Any.fromFunction0(isAdded), isAddedModifiedOrDeleted = js.Any.fromFunction0(isAddedModifiedOrDeleted), isDeleted = js.Any.fromFunction0(isDeleted), isDetached = js.Any.fromFunction0(isDetached), isModified = js.Any.fromFunction0(isModified), isUnchanged = js.Any.fromFunction0(isUnchanged), isUnchangedOrModified = js.Any.fromFunction0(isUnchangedOrModified), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityStateSymbol]
  }
}


package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityStateSymbol extends EnumSymbol {
  
  def isAdded(): Boolean = js.native
  
  def isAddedModifiedOrDeleted(): Boolean = js.native
  
  def isDeleted(): Boolean = js.native
  
  def isDetached(): Boolean = js.native
  
  def isModified(): Boolean = js.native
  
  def isUnchanged(): Boolean = js.native
  
  def isUnchangedOrModified(): Boolean = js.native
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
  
  @scala.inline
  implicit class EntityStateSymbolOps[Self <: EntityStateSymbol] (val x: Self) extends AnyVal {
    
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
    def setIsAdded(value: () => Boolean): Self = this.set("isAdded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAddedModifiedOrDeleted(value: () => Boolean): Self = this.set("isAddedModifiedOrDeleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = this.set("isDeleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDetached(value: () => Boolean): Self = this.set("isDetached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsModified(value: () => Boolean): Self = this.set("isModified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnchanged(value: () => Boolean): Self = this.set("isUnchanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnchangedOrModified(value: () => Boolean): Self = this.set("isUnchangedOrModified", js.Any.fromFunction0(value))
  }
}

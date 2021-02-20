package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
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
  implicit class EntityStateSymbolMutableBuilder[Self <: EntityStateSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAdded(value: () => Boolean): Self = StObject.set(x, "isAdded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAddedModifiedOrDeleted(value: () => Boolean): Self = StObject.set(x, "isAddedModifiedOrDeleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "isDeleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDetached(value: () => Boolean): Self = StObject.set(x, "isDetached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnchanged(value: () => Boolean): Self = StObject.set(x, "isUnchanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnchangedOrModified(value: () => Boolean): Self = StObject.set(x, "isUnchangedOrModified", js.Any.fromFunction0(value))
  }
}

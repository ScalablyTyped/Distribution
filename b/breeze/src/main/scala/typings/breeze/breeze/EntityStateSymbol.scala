package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityStateSymbol
  extends StObject
     with EnumSymbol {
  
  def isAdded(): Boolean
  
  def isAddedModifiedOrDeleted(): Boolean
  
  def isDeleted(): Boolean
  
  def isDetached(): Boolean
  
  def isModified(): Boolean
  
  def isUnchanged(): Boolean
  
  def isUnchangedOrModified(): Boolean
}
object EntityStateSymbol {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: EntityStateSymbol] (val x: Self) extends AnyVal {
    
    inline def setIsAdded(value: () => Boolean): Self = StObject.set(x, "isAdded", js.Any.fromFunction0(value))
    
    inline def setIsAddedModifiedOrDeleted(value: () => Boolean): Self = StObject.set(x, "isAddedModifiedOrDeleted", js.Any.fromFunction0(value))
    
    inline def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "isDeleted", js.Any.fromFunction0(value))
    
    inline def setIsDetached(value: () => Boolean): Self = StObject.set(x, "isDetached", js.Any.fromFunction0(value))
    
    inline def setIsModified(value: () => Boolean): Self = StObject.set(x, "isModified", js.Any.fromFunction0(value))
    
    inline def setIsUnchanged(value: () => Boolean): Self = StObject.set(x, "isUnchanged", js.Any.fromFunction0(value))
    
    inline def setIsUnchangedOrModified(value: () => Boolean): Self = StObject.set(x, "isUnchangedOrModified", js.Any.fromFunction0(value))
  }
}

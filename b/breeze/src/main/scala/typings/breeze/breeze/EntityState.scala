package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityState
  extends StObject
     with IEnum {
  
  var Added: EntityStateSymbol
  
  var Deleted: EntityStateSymbol
  
  var Detached: EntityStateSymbol
  
  var Modified: EntityStateSymbol
  
  var Unchanged: EntityStateSymbol
}
object EntityState {
  
  inline def apply(
    Added: EntityStateSymbol,
    Deleted: EntityStateSymbol,
    Detached: EntityStateSymbol,
    Modified: EntityStateSymbol,
    Unchanged: EntityStateSymbol,
    contains: Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityState = {
    val __obj = js.Dynamic.literal(Added = Added.asInstanceOf[js.Any], Deleted = Deleted.asInstanceOf[js.Any], Detached = Detached.asInstanceOf[js.Any], Modified = Modified.asInstanceOf[js.Any], Unchanged = Unchanged.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[EntityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityState] (val x: Self) extends AnyVal {
    
    inline def setAdded(value: EntityStateSymbol): Self = StObject.set(x, "Added", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: EntityStateSymbol): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDetached(value: EntityStateSymbol): Self = StObject.set(x, "Detached", value.asInstanceOf[js.Any])
    
    inline def setModified(value: EntityStateSymbol): Self = StObject.set(x, "Modified", value.asInstanceOf[js.Any])
    
    inline def setUnchanged(value: EntityStateSymbol): Self = StObject.set(x, "Unchanged", value.asInstanceOf[js.Any])
  }
}

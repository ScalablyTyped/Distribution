package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbindObject[T /* <: EmbindObject[T] */] extends StObject {
  
  def delete(): Unit
  
  def deleteLater(): Unit
  
  def isAliasOf(other: Any): Boolean
  
  def isDeleted(): Boolean
}
object EmbindObject {
  
  inline def apply[T /* <: EmbindObject[T] */](delete: () => Unit, deleteLater: () => Unit, isAliasOf: Any => Boolean, isDeleted: () => Boolean): EmbindObject[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[EmbindObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbindObject[?], T /* <: EmbindObject[T] */] (val x: Self & EmbindObject[T]) extends AnyVal {
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setDeleteLater(value: () => Unit): Self = StObject.set(x, "deleteLater", js.Any.fromFunction0(value))
    
    inline def setIsAliasOf(value: Any => Boolean): Self = StObject.set(x, "isAliasOf", js.Any.fromFunction1(value))
    
    inline def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "isDeleted", js.Any.fromFunction0(value))
  }
}

package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbindObject[T /* <: EmbindObject[T] */] extends StObject {
  
  def delete(): Unit
  
  def deleteAfter(): Unit
  
  def isAliasOf(other: js.Any): Boolean
  
  def isDeleted(): Boolean
}
object EmbindObject {
  
  @scala.inline
  def apply[T /* <: EmbindObject[T] */](
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): EmbindObject[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[EmbindObject[T]]
  }
  
  @scala.inline
  implicit class EmbindObjectMutableBuilder[Self <: EmbindObject[?], T /* <: EmbindObject[T] */] (val x: Self & EmbindObject[T]) extends AnyVal {
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAfter(value: () => Unit): Self = StObject.set(x, "deleteAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAliasOf(value: js.Any => Boolean): Self = StObject.set(x, "isAliasOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "isDeleted", js.Any.fromFunction0(value))
  }
}

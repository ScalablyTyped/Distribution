package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbindObject[T /* <: EmbindObject[T] */] extends StObject {
  
  def delete(): Unit = js.native
  
  def deleteAfter(): Unit = js.native
  
  def isAliasOf(other: js.Any): Boolean = js.native
  
  def isDeleted(): Boolean = js.native
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
  implicit class EmbindObjectMutableBuilder[Self <: EmbindObject[_], T /* <: EmbindObject[T] */] (val x: Self with EmbindObject[T]) extends AnyVal {
    
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

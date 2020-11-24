package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbindObject[T /* <: EmbindObject[T] */] extends js.Object {
  
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
  implicit class EmbindObjectOps[Self <: EmbindObject[_], T /* <: EmbindObject[T] */] (val x: Self with EmbindObject[T]) extends AnyVal {
    
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
    def setDelete(value: () => Unit): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteAfter(value: () => Unit): Self = this.set("deleteAfter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAliasOf(value: js.Any => Boolean): Self = this.set("isAliasOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDeleted(value: () => Boolean): Self = this.set("isDeleted", js.Any.fromFunction0(value))
  }
}

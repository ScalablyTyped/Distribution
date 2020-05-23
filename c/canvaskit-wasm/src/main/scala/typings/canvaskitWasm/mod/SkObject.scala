package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkObject[T /* <: SkObject[T] */] extends js.Object {
  def delete(): Unit
  def deleteAfter(): Unit
  def isAliasOf(other: js.Any): Boolean
  def isDeleted(): Boolean
}

object SkObject {
  @scala.inline
  def apply[T](
    delete: () => Unit,
    deleteAfter: () => Unit,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean
  ): SkObject[T] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[SkObject[T]]
  }
}


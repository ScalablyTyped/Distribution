package typings.curriable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon01[R /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object
  var `1`: R
}

object Anon01 {
  @scala.inline
  def apply[R /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object,
    `1`: R
  ): Anon01[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon01[R]]
  }
}


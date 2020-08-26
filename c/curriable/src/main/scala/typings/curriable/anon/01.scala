package typings.curriable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `01`[R /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object = js.native
  var `1`: R = js.native
}

object `01` {
  @scala.inline
  def apply[/* <: js.Array[_] */ R](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object,
    `1`: R
  ): `01`[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`01`[R]]
  }
  @scala.inline
  implicit class `01Ops`[Self <: `01`[_], /* <: js.Array[_] */ R] (val x: Self with `01`[R]) extends AnyVal {
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
    def set0(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object
    ): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: R): Self = this.set("1", value.asInstanceOf[js.Any])
  }
  
}


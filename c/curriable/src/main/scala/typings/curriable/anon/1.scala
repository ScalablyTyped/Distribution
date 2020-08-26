package typings.curriable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1`[T /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object = js.native
  var `1`: T = js.native
}

object `1` {
  @scala.inline
  def apply[/* <: js.Array[_] */ T](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object,
    `1`: T
  ): `1`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[T]]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], /* <: js.Array[_] */ T] (val x: Self with `1`[T]) extends AnyVal {
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
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Drop<N, curriable.curriable.Tail<T>, curriable.curriable.Prepend<any, I>> */ js.Object
    ): Self = this.set("0", value.asInstanceOf[js.Any])
    @scala.inline
    def set1(value: T): Self = this.set("1", value.asInstanceOf[js.Any])
  }
  
}


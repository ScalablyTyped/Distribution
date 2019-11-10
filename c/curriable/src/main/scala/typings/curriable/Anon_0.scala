package typings.curriable

import typings.curriable.curriableMod.Head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[T /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object
  var `1`: Head[T]
}

object Anon_0 {
  @scala.inline
  def apply[T /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias curriable.curriable.Last<curriable.curriable.Tail<T>> */ js.Object,
    `1`: Head[T]
  ): Anon_0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_0[T]]
  }
}


package typings.curriable

import typings.curriable.mod.Cast
import typings.curriable.mod.Concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0Object[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object
  var `1`: Concat[TN, Cast[_, js.Array[_]]]
}

object Anon0Object {
  @scala.inline
  def apply[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object,
    `1`: Concat[TN, Cast[_, js.Array[_]]]
  ): Anon0Object[TN, I, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0Object[TN, I, T2]]
  }
}


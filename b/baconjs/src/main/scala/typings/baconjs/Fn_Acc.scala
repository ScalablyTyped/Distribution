package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Acc extends js.Object {
  def apply[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
}


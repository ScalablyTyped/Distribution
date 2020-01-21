package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "traverseFast")
@js.native
object traverseFast extends js.Object {
  def apply[T](n: Node, h: TraversalHandler[T]): Unit = js.native
  def apply[T](n: Node, h: TraversalHandler[T], state: T): Unit = js.native
}


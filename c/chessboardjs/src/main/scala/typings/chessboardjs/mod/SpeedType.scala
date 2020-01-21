package typings.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chessboardjs.chessboardjsStrings.slow
  - typings.chessboardjs.chessboardjsStrings.fast
*/
trait SpeedType extends js.Object

object SpeedType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fast: typings.chessboardjs.chessboardjsStrings.fast = this.cast("fast")
  @scala.inline
  def slow: typings.chessboardjs.chessboardjsStrings.slow = this.cast("slow")
}


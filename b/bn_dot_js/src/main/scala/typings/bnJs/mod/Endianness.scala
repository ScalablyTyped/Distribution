package typings.bnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bnJs.bnJsStrings.le
  - typings.bnJs.bnJsStrings.be
*/
trait Endianness extends js.Object

object Endianness {
  @scala.inline
  def be: typings.bnJs.bnJsStrings.be = this.cast("be")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def le: typings.bnJs.bnJsStrings.le = this.cast("le")
}


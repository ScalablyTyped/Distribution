package typings.bnDotJs.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bnDotJs.bnDotJsStrings.k256
  - typings.bnDotJs.bnDotJsStrings.p224
  - typings.bnDotJs.bnDotJsStrings.p192
  - typings.bnDotJs.bnDotJsStrings.p25519
*/
trait IPrimeName extends js.Object

object IPrimeName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def k256: typings.bnDotJs.bnDotJsStrings.k256 = this.cast("k256")
  @scala.inline
  def p192: typings.bnDotJs.bnDotJsStrings.p192 = this.cast("p192")
  @scala.inline
  def p224: typings.bnDotJs.bnDotJsStrings.p224 = this.cast("p224")
  @scala.inline
  def p25519: typings.bnDotJs.bnDotJsStrings.p25519 = this.cast("p25519")
}


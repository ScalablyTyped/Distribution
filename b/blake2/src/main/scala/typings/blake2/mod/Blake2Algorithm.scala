package typings.blake2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blake2.blake2Strings.blake2b
  - typings.blake2.blake2Strings.blake2bp
  - typings.blake2.blake2Strings.blake2s
  - typings.blake2.blake2Strings.blake2sp
  - typings.blake2.blake2Strings.bypass
*/
trait Blake2Algorithm extends js.Object

object Blake2Algorithm {
  @scala.inline
  def blake2b: typings.blake2.blake2Strings.blake2b = this.cast("blake2b")
  @scala.inline
  def blake2bp: typings.blake2.blake2Strings.blake2bp = this.cast("blake2bp")
  @scala.inline
  def blake2s: typings.blake2.blake2Strings.blake2s = this.cast("blake2s")
  @scala.inline
  def blake2sp: typings.blake2.blake2Strings.blake2sp = this.cast("blake2sp")
  @scala.inline
  def bypass: typings.blake2.blake2Strings.bypass = this.cast("bypass")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


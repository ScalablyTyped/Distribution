package typings
package chalkLib.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - chalkLib.chalkLibNumbers.`0`
  - chalkLib.chalkLibNumbers.`1`
  - chalkLib.chalkLibNumbers.`2`
  - chalkLib.chalkLibNumbers.`3`
*/
trait Level extends js.Object

object Level {
  @scala.inline
  def Ansi256: chalkLib.chalkLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Basic: chalkLib.chalkLibNumbers.`1` = this.cast(1)
  @scala.inline
  def None: chalkLib.chalkLibNumbers.`0` = this.cast(0)
  @scala.inline
  def TrueColor: chalkLib.chalkLibNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


package typings.chalk.chalkMod

import typings.chalk.chalkNumbers.`0`
import typings.chalk.chalkNumbers.`1`
import typings.chalk.chalkNumbers.`2`
import typings.chalk.chalkNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chalk.chalkNumbers.`0`
  - typings.chalk.chalkNumbers.`1`
  - typings.chalk.chalkNumbers.`2`
  - typings.chalk.chalkNumbers.`3`
*/
trait Level extends js.Object

object Level {
  @scala.inline
  def Ansi256: `2` = this.cast(2)
  @scala.inline
  def Basic: `1` = this.cast(1)
  @scala.inline
  def None: `0` = this.cast(0)
  @scala.inline
  def TrueColor: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


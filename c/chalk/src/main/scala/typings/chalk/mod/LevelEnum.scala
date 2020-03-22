package typings.chalk.mod

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
trait LevelEnum extends js.Object

object LevelEnum {
  /**
  	ANSI 256 colors support.
  	*/
  @scala.inline
  def Ansi256: `2` = this.cast(2)
  /**
  	Basic 16 colors support.
  	*/
  @scala.inline
  def Basic: `1` = this.cast(1)
  /**
  	All colors disabled.
  	*/
  @scala.inline
  def None: `0` = this.cast(0)
  /**
  	Truecolor 16 million colors support.
  	*/
  @scala.inline
  def TrueColor: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


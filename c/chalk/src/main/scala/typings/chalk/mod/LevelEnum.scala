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
  def Ansi256: `2` = 2.asInstanceOf[`2`]
  /**
  	Basic 16 colors support.
  	*/
  @scala.inline
  def Basic: `1` = 1.asInstanceOf[`1`]
  /**
  	All colors disabled.
  	*/
  @scala.inline
  def None: `0` = 0.asInstanceOf[`0`]
  /**
  	Truecolor 16 million colors support.
  	*/
  @scala.inline
  def TrueColor: `3` = 3.asInstanceOf[`3`]
}


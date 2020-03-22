package typings.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
Basic foreground colors.
[More colors here.](https://github.com/chalk/chalk/blob/master/readme.md#256-and-truecolor-color-support)
*/
/* Rewritten from type alias, can be one of: 
  - typings.chalk.chalkStrings.black
  - typings.chalk.chalkStrings.red
  - typings.chalk.chalkStrings.green
  - typings.chalk.chalkStrings.yellow
  - typings.chalk.chalkStrings.blue
  - typings.chalk.chalkStrings.magenta
  - typings.chalk.chalkStrings.cyan
  - typings.chalk.chalkStrings.white
  - typings.chalk.chalkStrings.gray
  - typings.chalk.chalkStrings.grey
  - typings.chalk.chalkStrings.blackBright
  - typings.chalk.chalkStrings.redBright
  - typings.chalk.chalkStrings.greenBright
  - typings.chalk.chalkStrings.yellowBright
  - typings.chalk.chalkStrings.blueBright
  - typings.chalk.chalkStrings.magentaBright
  - typings.chalk.chalkStrings.cyanBright
  - typings.chalk.chalkStrings.whiteBright
*/
trait ForegroundColor extends js.Object

object ForegroundColor {
  @scala.inline
  def black: typings.chalk.chalkStrings.black = this.cast("black")
  @scala.inline
  def blackBright: typings.chalk.chalkStrings.blackBright = this.cast("blackBright")
  @scala.inline
  def blue: typings.chalk.chalkStrings.blue = this.cast("blue")
  @scala.inline
  def blueBright: typings.chalk.chalkStrings.blueBright = this.cast("blueBright")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cyan: typings.chalk.chalkStrings.cyan = this.cast("cyan")
  @scala.inline
  def cyanBright: typings.chalk.chalkStrings.cyanBright = this.cast("cyanBright")
  @scala.inline
  def gray: typings.chalk.chalkStrings.gray = this.cast("gray")
  @scala.inline
  def green: typings.chalk.chalkStrings.green = this.cast("green")
  @scala.inline
  def greenBright: typings.chalk.chalkStrings.greenBright = this.cast("greenBright")
  @scala.inline
  def grey: typings.chalk.chalkStrings.grey = this.cast("grey")
  @scala.inline
  def magenta: typings.chalk.chalkStrings.magenta = this.cast("magenta")
  @scala.inline
  def magentaBright: typings.chalk.chalkStrings.magentaBright = this.cast("magentaBright")
  @scala.inline
  def red: typings.chalk.chalkStrings.red = this.cast("red")
  @scala.inline
  def redBright: typings.chalk.chalkStrings.redBright = this.cast("redBright")
  @scala.inline
  def white: typings.chalk.chalkStrings.white = this.cast("white")
  @scala.inline
  def whiteBright: typings.chalk.chalkStrings.whiteBright = this.cast("whiteBright")
  @scala.inline
  def yellow: typings.chalk.chalkStrings.yellow = this.cast("yellow")
  @scala.inline
  def yellowBright: typings.chalk.chalkStrings.yellowBright = this.cast("yellowBright")
}


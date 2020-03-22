package typings.chalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chalk.chalkStrings.reset
  - typings.chalk.chalkStrings.bold
  - typings.chalk.chalkStrings.dim
  - typings.chalk.chalkStrings.italic
  - typings.chalk.chalkStrings.underline
  - typings.chalk.chalkStrings.inverse
  - typings.chalk.chalkStrings.hidden
  - typings.chalk.chalkStrings.strikethrough
  - typings.chalk.chalkStrings.visible
*/
trait Modifiers extends js.Object

object Modifiers {
  @scala.inline
  def bold: typings.chalk.chalkStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dim: typings.chalk.chalkStrings.dim = this.cast("dim")
  @scala.inline
  def hidden: typings.chalk.chalkStrings.hidden = this.cast("hidden")
  @scala.inline
  def inverse: typings.chalk.chalkStrings.inverse = this.cast("inverse")
  @scala.inline
  def italic: typings.chalk.chalkStrings.italic = this.cast("italic")
  @scala.inline
  def reset: typings.chalk.chalkStrings.reset = this.cast("reset")
  @scala.inline
  def strikethrough: typings.chalk.chalkStrings.strikethrough = this.cast("strikethrough")
  @scala.inline
  def underline: typings.chalk.chalkStrings.underline = this.cast("underline")
  @scala.inline
  def visible: typings.chalk.chalkStrings.visible = this.cast("visible")
}


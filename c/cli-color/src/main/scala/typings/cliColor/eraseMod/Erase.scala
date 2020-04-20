package typings.cliColor.eraseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Erase extends js.Object {
  /**
    * Current line
    */
  val line: String
  /**
    * Right portion of current line
    */
  val lineLeft: String
  /**
    * Left portion of current line
    */
  val lineRight: String
  /**
    * Entire screen
    */
  val screen: String
  /**
    * Left portion of a screen
    */
  val screenLeft: String
  /**
    * Right portion of a screen
    */
  val screenRight: String
}

object Erase {
  @scala.inline
  def apply(
    line: String,
    lineLeft: String,
    lineRight: String,
    screen: String,
    screenLeft: String,
    screenRight: String
  ): Erase = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], lineLeft = lineLeft.asInstanceOf[js.Any], lineRight = lineRight.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenLeft = screenLeft.asInstanceOf[js.Any], screenRight = screenRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Erase]
  }
}


package typings.cliTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cliTable2.cliTable2Strings.left
  - typings.cliTable2.cliTable2Strings.center
  - typings.cliTable2.cliTable2Strings.right
*/
trait HorizontalAlignment extends js.Object

object HorizontalAlignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.cliTable2.cliTable2Strings.center = this.cast("center")
  @scala.inline
  def left: typings.cliTable2.cliTable2Strings.left = this.cast("left")
  @scala.inline
  def right: typings.cliTable2.cliTable2Strings.right = this.cast("right")
}


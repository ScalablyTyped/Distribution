package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.block
  - typings.csstype.csstypeStrings.`inline`
  - typings.csstype.csstypeStrings.`run-in`
*/
trait DisplayOutside extends _DisplayProperty

object DisplayOutside {
  @scala.inline
  def block: typings.csstype.csstypeStrings.block = this.cast("block")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `inline`: typings.csstype.csstypeStrings.`inline` = this.cast("inline")
  @scala.inline
  def `run-in`: typings.csstype.csstypeStrings.`run-in` = this.cast("run-in")
}


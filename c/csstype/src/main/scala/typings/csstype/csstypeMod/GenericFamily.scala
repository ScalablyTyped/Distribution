package typings.csstype.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.cursive
  - typings.csstype.csstypeStrings.fantasy
  - typings.csstype.csstypeStrings.monospace
  - typings.csstype.csstypeStrings.`sans-serif`
  - typings.csstype.csstypeStrings.serif
*/
trait GenericFamily extends _FontFamilyProperty

object GenericFamily {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cursive: typings.csstype.csstypeStrings.cursive = this.cast("cursive")
  @scala.inline
  def fantasy: typings.csstype.csstypeStrings.fantasy = this.cast("fantasy")
  @scala.inline
  def monospace: typings.csstype.csstypeStrings.monospace = this.cast("monospace")
  @scala.inline
  def `sans-serif`: typings.csstype.csstypeStrings.`sans-serif` = this.cast("sans-serif")
  @scala.inline
  def serif: typings.csstype.csstypeStrings.serif = this.cast("serif")
}


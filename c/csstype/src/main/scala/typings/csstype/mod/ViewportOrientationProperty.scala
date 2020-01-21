package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.landscape
  - typings.csstype.csstypeStrings.portrait
*/
trait ViewportOrientationProperty extends js.Object

object ViewportOrientationProperty {
  @scala.inline
  def auto: typings.csstype.csstypeStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def landscape: typings.csstype.csstypeStrings.landscape = this.cast("landscape")
  @scala.inline
  def portrait: typings.csstype.csstypeStrings.portrait = this.cast("portrait")
}


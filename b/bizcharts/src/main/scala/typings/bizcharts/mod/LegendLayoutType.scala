package typings.bizcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bizcharts.bizchartsStrings.vertical
  - typings.bizcharts.bizchartsStrings.horizontal
*/
trait LegendLayoutType extends js.Object

object LegendLayoutType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.bizcharts.bizchartsStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.bizcharts.bizchartsStrings.vertical = this.cast("vertical")
}


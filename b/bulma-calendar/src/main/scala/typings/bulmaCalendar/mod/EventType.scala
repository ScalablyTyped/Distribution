package typings.bulmaCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.bulmaCalendar.bulmaCalendarStrings.show
  - typings.bulmaCalendar.bulmaCalendarStrings.hide
  - typings.bulmaCalendar.bulmaCalendarStrings.select
  - typings.bulmaCalendar.bulmaCalendarStrings.selectColonstart
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hide: typings.bulmaCalendar.bulmaCalendarStrings.hide = this.cast("hide")
  @scala.inline
  def select: typings.bulmaCalendar.bulmaCalendarStrings.select = this.cast("select")
  @scala.inline
  def selectColonstart: typings.bulmaCalendar.bulmaCalendarStrings.selectColonstart = this.cast("select:start")
  @scala.inline
  def show: typings.bulmaCalendar.bulmaCalendarStrings.show = this.cast("show")
}


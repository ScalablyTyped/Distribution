package typings.bulmaCalendar.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bulma-calendar", JSImport.Default)
@js.native
class default protected () extends bulmaCalendar {
  // Constructors
  def this(selector: String) = this()
  def this(selector: HTMLElement) = this()
  def this(selector: String, options: BulmaCalendarOptions) = this()
  def this(selector: HTMLElement, options: BulmaCalendarOptions) = this()
}

/* static members */
@JSImport("bulma-calendar", JSImport.Default)
@js.native
object default extends js.Object {
  def attach(): js.Array[bulmaCalendar] = js.native
  def attach(selector: String): js.Array[bulmaCalendar] = js.native
  def attach(selector: String, options: BulmaCalendarOptions): js.Array[bulmaCalendar] = js.native
  def attach(selector: HTMLElement): js.Array[bulmaCalendar] = js.native
  def attach(selector: HTMLElement, options: BulmaCalendarOptions): js.Array[bulmaCalendar] = js.native
}


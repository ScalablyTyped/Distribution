package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Calendar")
@js.native
class Calendar () extends DAVCollection[CalendarObject] {
  def this(options: CalendarOptions) = this()
  var components: js.Array[java.lang.String] = js.native
  var timezone: java.lang.String = js.native
}


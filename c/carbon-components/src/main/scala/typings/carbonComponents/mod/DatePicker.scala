package typings.carbonComponents.mod

import typings.carbonComponents.anon.AttribType
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("carbon-components", "DatePicker")
@js.native
class DatePicker protected ()
  extends typings.carbonComponents.componentsMod.DatePicker {
  def this(element: js.Any, options: js.Any) = this()
}

/* static members */
@JSImport("carbon-components", "DatePicker")
@js.native
object DatePicker extends js.Object {
  var components: WeakMap[js.Object, _] = js.native
  def options: AttribType = js.native
}


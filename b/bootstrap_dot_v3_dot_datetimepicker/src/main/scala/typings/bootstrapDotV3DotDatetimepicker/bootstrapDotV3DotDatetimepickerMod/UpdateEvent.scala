package typings.bootstrapDotV3DotDatetimepicker.bootstrapDotV3DotDatetimepickerMod

import typings.jquery.JQueryEventObject
import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEvent extends JQueryEventObject {
  /** Change type as a momentjs format token. e.g. yyyy on year change */
  var change: String = js.native
  /** New viewDate. */
  var viewDate: Moment = js.native
}


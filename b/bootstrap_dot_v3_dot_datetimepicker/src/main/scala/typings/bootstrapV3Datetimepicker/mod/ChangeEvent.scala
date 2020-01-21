package typings.bootstrapV3Datetimepicker.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent extends Event {
  /** Previous date. False if the previous date is null. */
  var oldDate: Moment | Boolean = js.native
}


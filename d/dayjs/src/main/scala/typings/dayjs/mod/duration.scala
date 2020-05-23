package typings.dayjs.mod

import typings.dayjs.durationMod.Duration
import typings.dayjs.durationMod.DurationInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dayjs", "duration")
@js.native
object duration extends js.Object {
  def apply(): Duration = js.native
  def apply(input: DurationInputType): Duration = js.native
  def apply(input: DurationInputType, unit: String): Duration = js.native
}


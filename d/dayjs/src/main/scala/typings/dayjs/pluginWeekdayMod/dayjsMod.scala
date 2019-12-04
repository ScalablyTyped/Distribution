package typings.dayjs.pluginWeekdayMod

import typings.dayjs.pluginWeekdayMod.dayjsMod.Dayjs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def weekday(): Double = js.native
    def weekday(value: Double): Dayjs = js.native
  }
  
}


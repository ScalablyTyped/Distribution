package typings.dayjs.pluginCalendarMod

import typings.dayjs.dayjsMod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def calendar(): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
  }
  
}


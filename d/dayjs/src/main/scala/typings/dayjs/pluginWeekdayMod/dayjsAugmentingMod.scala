package typings.dayjs.pluginWeekdayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsAugmentingMod extends js.Object {
  
  @js.native
  trait Dayjs extends js.Object {
    
    def weekday(): Double = js.native
    def weekday(value: Double): Dayjs = js.native
  }
}

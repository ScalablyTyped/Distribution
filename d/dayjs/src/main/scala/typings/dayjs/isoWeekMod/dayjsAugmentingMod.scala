package typings.dayjs.isoWeekMod

import typings.dayjs.mod.ConfigType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsAugmentingMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def endOf(unit: ISOUnitType): Dayjs = js.native
    def isAfter(date: ConfigType): Boolean = js.native
    def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isBefore(date: ConfigType): Boolean = js.native
    def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isSame(date: ConfigType): Boolean = js.native
    def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isoWeek(): Double = js.native
    def isoWeek(value: Double): Dayjs = js.native
    def isoWeekYear(): Double = js.native
    def isoWeekday(): Double = js.native
    def isoWeekday(value: Double): Dayjs = js.native
    def startOf(unit: ISOUnitType): Dayjs = js.native
  }
  
}


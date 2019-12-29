package typings.dayjs.pluginQuarterOfYearMod

import typings.dayjs.dayjsMod.ConfigType
import typings.dayjs.dayjsMod.QUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsMod extends js.Object {
  @js.native
  trait Dayjs extends js.Object {
    def add(value: Double, unit: QUnitType): Dayjs = js.native
    def endOf(unit: QUnitType): Dayjs = js.native
    def isAfter(date: ConfigType): Boolean = js.native
    def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isBefore(date: ConfigType): Boolean = js.native
    def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isSame(date: ConfigType): Boolean = js.native
    def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
    def quarter(): Double = js.native
    def quarter(quarter: Double): Dayjs = js.native
    def startOf(unit: QUnitType): Dayjs = js.native
    def subtract(value: Double, unit: QUnitType): Dayjs = js.native
  }
  
}


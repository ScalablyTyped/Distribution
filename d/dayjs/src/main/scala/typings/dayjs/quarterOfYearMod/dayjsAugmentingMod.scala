package typings.dayjs.quarterOfYearMod

import typings.dayjs.mod.ConfigType
import typings.dayjs.mod.QUnitType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("dayjs", JSImport.Namespace)
@js.native
object dayjsAugmentingMod extends js.Object {
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


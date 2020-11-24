package typings.dayjs.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayjsTimezone extends js.Object {
  
  def apply(date: ConfigType): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def apply(date: ConfigType, format: String, timezone: String): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  def apply(date: ConfigType, timezone: String): typings.dayjs.timezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
  
  def guess(): String = js.native
  
  def setDefault(): Unit = js.native
  def setDefault(timezone: String): Unit = js.native
}

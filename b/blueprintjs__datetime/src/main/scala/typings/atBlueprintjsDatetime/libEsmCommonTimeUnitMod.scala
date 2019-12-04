package typings.atBlueprintjsDatetime

import typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", JSImport.Namespace)
@js.native
object libEsmCommonTimeUnitMod extends js.Object {
  @js.native
  sealed trait TimeUnit extends js.Object
  
  def getDefaultMaxTime(): Date = js.native
  def getDefaultMinTime(): Date = js.native
  def getTimeUnit(unit: TimeUnit, date: Date): Double = js.native
  def getTimeUnitClassName(unit: TimeUnit): String = js.native
  def getTimeUnitMax(unit: TimeUnit): Double = js.native
  def getTimeUnitMin(unit: TimeUnit): Double = js.native
  def isTimeUnitValid(unit: TimeUnit): Boolean = js.native
  def isTimeUnitValid(unit: TimeUnit, time: Double): Boolean = js.native
  def setTimeUnit(unit: TimeUnit, time: Double, date: Date, isPm: Boolean): Date = js.native
  def wrapTimeAtUnit(unit: TimeUnit, time: Double): Double = js.native
  @js.native
  object TimeUnit extends js.Object {
    @js.native
    sealed trait HOUR_12 extends TimeUnit
    
    @js.native
    sealed trait HOUR_24 extends TimeUnit
    
    @js.native
    sealed trait MINUTE extends TimeUnit
    
    @js.native
    sealed trait MS extends TimeUnit
    
    @js.native
    sealed trait SECOND extends TimeUnit
    
    /* "hour12" */ val HOUR_12: typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.HOUR_12 with String = js.native
    /* "hour24" */ val HOUR_24: typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.HOUR_24 with String = js.native
    /* "minute" */ val MINUTE: typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.MINUTE with String = js.native
    /* "ms" */ val MS: typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.MS with String = js.native
    /* "second" */ val SECOND: typings.atBlueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.SECOND with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimeUnit with String] = js.native
  }
  
}


package typings.blueprintjsDatetime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeUnitMod {
  
  @js.native
  sealed trait TimeUnit extends StObject
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimeUnit with String] = js.native
    
    @js.native
    sealed trait HOUR_12 extends TimeUnit
    /* "hour12" */ val HOUR_12: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_12 with String = js.native
    
    @js.native
    sealed trait HOUR_24 extends TimeUnit
    /* "hour24" */ val HOUR_24: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_24 with String = js.native
    
    @js.native
    sealed trait MINUTE extends TimeUnit
    /* "minute" */ val MINUTE: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MINUTE with String = js.native
    
    @js.native
    sealed trait MS extends TimeUnit
    /* "ms" */ val MS: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MS with String = js.native
    
    @js.native
    sealed trait SECOND extends TimeUnit
    /* "second" */ val SECOND: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.SECOND with String = js.native
  }
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getDefaultMaxTime")
  @js.native
  def getDefaultMaxTime(): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getDefaultMinTime")
  @js.native
  def getDefaultMinTime(): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getTimeUnit")
  @js.native
  def getTimeUnit(unit: TimeUnit, date: Date): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getTimeUnitClassName")
  @js.native
  def getTimeUnitClassName(unit: TimeUnit): String = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getTimeUnitMax")
  @js.native
  def getTimeUnitMax(unit: TimeUnit): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "getTimeUnitMin")
  @js.native
  def getTimeUnitMin(unit: TimeUnit): Double = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "isTimeUnitValid")
  @js.native
  def isTimeUnitValid(unit: TimeUnit): Boolean = js.native
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "isTimeUnitValid")
  @js.native
  def isTimeUnitValid(unit: TimeUnit, time: Double): Boolean = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "setTimeUnit")
  @js.native
  def setTimeUnit(unit: TimeUnit, time: Double, date: Date, isPm: Boolean): Date = js.native
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "wrapTimeAtUnit")
  @js.native
  def wrapTimeAtUnit(unit: TimeUnit, time: Double): Double = js.native
}

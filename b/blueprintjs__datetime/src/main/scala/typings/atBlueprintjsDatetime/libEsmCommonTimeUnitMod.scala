package typings.atBlueprintjsDatetime

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimeUnit with String] = js.native
    /* "hour12" */ @js.native
    object HOUR_12 extends TopLevel[HOUR_12 with String]
    
    /* "hour24" */ @js.native
    object HOUR_24 extends TopLevel[HOUR_24 with String]
    
    /* "minute" */ @js.native
    object MINUTE extends TopLevel[MINUTE with String]
    
    /* "ms" */ @js.native
    object MS extends TopLevel[MS with String]
    
    /* "second" */ @js.native
    object SECOND extends TopLevel[SECOND with String]
    
  }
  
}


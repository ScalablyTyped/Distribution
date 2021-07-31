package typings.blueprintjsDatetime

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeUnitMod {
  
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait TimeUnit extends StObject
  @JSImport("@blueprintjs/datetime/lib/esm/common/timeUnit", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimeUnit & String] = js.native
    
    @js.native
    sealed trait HOUR_12
      extends StObject
         with TimeUnit
    /* "hour12" */ val HOUR_12: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_12 & String = js.native
    
    @js.native
    sealed trait HOUR_24
      extends StObject
         with TimeUnit
    /* "hour24" */ val HOUR_24: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.HOUR_24 & String = js.native
    
    @js.native
    sealed trait MINUTE
      extends StObject
         with TimeUnit
    /* "minute" */ val MINUTE: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MINUTE & String = js.native
    
    @js.native
    sealed trait MS
      extends StObject
         with TimeUnit
    /* "ms" */ val MS: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.MS & String = js.native
    
    @js.native
    sealed trait SECOND
      extends StObject
         with TimeUnit
    /* "second" */ val SECOND: typings.blueprintjsDatetime.timeUnitMod.TimeUnit.SECOND & String = js.native
  }
  
  @scala.inline
  def getDefaultMaxTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMaxTime")().asInstanceOf[Date]
  
  @scala.inline
  def getDefaultMinTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMinTime")().asInstanceOf[Date]
  
  @scala.inline
  def getTimeUnit(unit: TimeUnit, date: Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnit")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTimeUnitClassName(unit: TimeUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitClassName")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getTimeUnitMax(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitMax")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getTimeUnitMin(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitMin")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isTimeUnitValid(unit: TimeUnit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeUnitValid")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isTimeUnitValid(unit: TimeUnit, time: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeUnitValid")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def setTimeUnit(unit: TimeUnit, time: Double, date: Date, isPm: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeUnit")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any], date.asInstanceOf[js.Any], isPm.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def wrapTimeAtUnit(unit: TimeUnit, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTimeAtUnit")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
}

package typings.blueprintjsDatetime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonTimeUnitMod {
  
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
    /* "hour12" */ val HOUR_12: typings.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.HOUR_12 & String = js.native
    
    @js.native
    sealed trait HOUR_24
      extends StObject
         with TimeUnit
    /* "hour24" */ val HOUR_24: typings.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.HOUR_24 & String = js.native
    
    @js.native
    sealed trait MINUTE
      extends StObject
         with TimeUnit
    /* "minute" */ val MINUTE: typings.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.MINUTE & String = js.native
    
    @js.native
    sealed trait MS
      extends StObject
         with TimeUnit
    /* "ms" */ val MS: typings.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.MS & String = js.native
    
    @js.native
    sealed trait SECOND
      extends StObject
         with TimeUnit
    /* "second" */ val SECOND: typings.blueprintjsDatetime.libEsmCommonTimeUnitMod.TimeUnit.SECOND & String = js.native
  }
  
  inline def getDefaultMaxTime(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMaxTime")().asInstanceOf[js.Date]
  
  inline def getDefaultMinTime(): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultMinTime")().asInstanceOf[js.Date]
  
  inline def getTimeUnit(unit: TimeUnit, date: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnit")(unit.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTimeUnitClassName(unit: TimeUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitClassName")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getTimeUnitMax(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitMax")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTimeUnitMin(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitMin")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTimeUnitPrintStr(unit: TimeUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeUnitPrintStr")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isTimeUnitValid(unit: TimeUnit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeUnitValid")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTimeUnitValid(unit: TimeUnit, time: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTimeUnitValid")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setTimeUnit(unit: TimeUnit, time: Double, date: js.Date, isPm: Boolean): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeUnit")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any], date.asInstanceOf[js.Any], isPm.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def wrapTimeAtUnit(unit: TimeUnit, time: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapTimeAtUnit")(unit.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Double]
}

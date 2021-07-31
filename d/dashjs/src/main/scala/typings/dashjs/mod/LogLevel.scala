package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("dashjs", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait LOG_LEVEL_DEBUG
    extends StObject
       with LogLevel
  /* 5 */ val LOG_LEVEL_DEBUG: typings.dashjs.mod.LogLevel.LOG_LEVEL_DEBUG & Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_ERROR
    extends StObject
       with LogLevel
  /* 2 */ val LOG_LEVEL_ERROR: typings.dashjs.mod.LogLevel.LOG_LEVEL_ERROR & Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_FATAL
    extends StObject
       with LogLevel
  /* 1 */ val LOG_LEVEL_FATAL: typings.dashjs.mod.LogLevel.LOG_LEVEL_FATAL & Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_INFO
    extends StObject
       with LogLevel
  /* 4 */ val LOG_LEVEL_INFO: typings.dashjs.mod.LogLevel.LOG_LEVEL_INFO & Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_NONE
    extends StObject
       with LogLevel
  /* 0 */ val LOG_LEVEL_NONE: typings.dashjs.mod.LogLevel.LOG_LEVEL_NONE & Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_WARNING
    extends StObject
       with LogLevel
  /* 3 */ val LOG_LEVEL_WARNING: typings.dashjs.mod.LogLevel.LOG_LEVEL_WARNING & Double = js.native
}

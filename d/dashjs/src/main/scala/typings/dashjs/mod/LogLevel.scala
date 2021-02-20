package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("dashjs", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait LOG_LEVEL_DEBUG extends LogLevel
  /* 5 */ val LOG_LEVEL_DEBUG: typings.dashjs.mod.LogLevel.LOG_LEVEL_DEBUG with Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_ERROR extends LogLevel
  /* 2 */ val LOG_LEVEL_ERROR: typings.dashjs.mod.LogLevel.LOG_LEVEL_ERROR with Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_FATAL extends LogLevel
  /* 1 */ val LOG_LEVEL_FATAL: typings.dashjs.mod.LogLevel.LOG_LEVEL_FATAL with Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_INFO extends LogLevel
  /* 4 */ val LOG_LEVEL_INFO: typings.dashjs.mod.LogLevel.LOG_LEVEL_INFO with Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_NONE extends LogLevel
  /* 0 */ val LOG_LEVEL_NONE: typings.dashjs.mod.LogLevel.LOG_LEVEL_NONE with Double = js.native
  
  @js.native
  sealed trait LOG_LEVEL_WARNING extends LogLevel
  /* 3 */ val LOG_LEVEL_WARNING: typings.dashjs.mod.LogLevel.LOG_LEVEL_WARNING with Double = js.native
}

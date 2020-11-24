package typings.dashjs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends js.Object
@JSImport("dashjs", "LogLevel")
@js.native
object LogLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  
  @js.native
  sealed trait LOG_LEVEL_DEBUG extends LogLevel
  /* 5 */ @js.native
  object LOG_LEVEL_DEBUG extends TopLevel[LOG_LEVEL_DEBUG with Double]
  
  @js.native
  sealed trait LOG_LEVEL_ERROR extends LogLevel
  /* 2 */ @js.native
  object LOG_LEVEL_ERROR extends TopLevel[LOG_LEVEL_ERROR with Double]
  
  @js.native
  sealed trait LOG_LEVEL_FATAL extends LogLevel
  /* 1 */ @js.native
  object LOG_LEVEL_FATAL extends TopLevel[LOG_LEVEL_FATAL with Double]
  
  @js.native
  sealed trait LOG_LEVEL_INFO extends LogLevel
  /* 4 */ @js.native
  object LOG_LEVEL_INFO extends TopLevel[LOG_LEVEL_INFO with Double]
  
  @js.native
  sealed trait LOG_LEVEL_NONE extends LogLevel
  /* 0 */ @js.native
  object LOG_LEVEL_NONE extends TopLevel[LOG_LEVEL_NONE with Double]
  
  @js.native
  sealed trait LOG_LEVEL_WARNING extends LogLevel
  /* 3 */ @js.native
  object LOG_LEVEL_WARNING extends TopLevel[LOG_LEVEL_WARNING with Double]
}

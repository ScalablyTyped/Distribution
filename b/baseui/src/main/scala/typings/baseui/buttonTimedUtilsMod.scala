package typings.baseui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonTimedUtilsMod {
  
  @JSImport("baseui/button-timed/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTime(totalMilliseconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(totalMilliseconds.asInstanceOf[js.Any]).asInstanceOf[String]
}

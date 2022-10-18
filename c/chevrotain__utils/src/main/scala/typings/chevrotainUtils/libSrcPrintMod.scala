package typings.chevrotainUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcPrintMod {
  
  @JSImport("@chevrotain/utils/lib/src/print", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PRINT_ERROR(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PRINT_ERROR")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def PRINT_WARNING(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PRINT_WARNING")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

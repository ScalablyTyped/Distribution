package typings.chevrotainUtils

import typings.chevrotainUtils.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chevrotain/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PRINT_ERROR(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PRINT_ERROR")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def PRINT_WARNING(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PRINT_WARNING")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timer[T](func: js.Function0[T]): Time[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(func.asInstanceOf[js.Any]).asInstanceOf[Time[T]]
  
  inline def toFastProperties(toBecomeFast: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toFastProperties")(toBecomeFast.asInstanceOf[js.Any]).asInstanceOf[Any]
}

package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreDebugMod {
  
  @JSImport("black-engine/core/Debug", "Debug")
  @js.native
  open class Debug () extends StObject
  /* static members */
  object Debug {
    
    @JSImport("black-engine/core/Debug", "Debug")
    @js.native
    val ^ : js.Any = js.native
    
    inline def assert(value: Any, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def assertInfo(value: Any, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertInfo")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def assertWarn(value: Any, message: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertWarn")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def error(message: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def info(message: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def isNumber(values: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def log(message: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    @JSImport("black-engine/core/Debug", "Debug.logOnFail")
    @js.native
    val logOnFail: Boolean = js.native
    
    @JSImport("black-engine/core/Debug", "Debug.throwOnFail")
    @js.native
    val throwOnFail: Boolean = js.native
    
    inline def time(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def timeEnd(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(message: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
}

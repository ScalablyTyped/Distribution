package typings.cucumberCucumber

import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiConsoleLoggerMod {
  
  @JSImport("@cucumber/cucumber/lib/api/console_logger", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends StObject
       with ILogger {
    def this(stream: Writable, debugEnabled: Boolean) = this()
    
    /* private */ var console: Any = js.native
    
    /* CompleteClass */
    override def debug(content: Any*): Unit = js.native
    
    /* private */ var debugEnabled: Any = js.native
    
    /* CompleteClass */
    override def error(content: Any*): Unit = js.native
    
    /* private */ var stream: Any = js.native
    
    /* CompleteClass */
    override def warn(content: Any*): Unit = js.native
  }
}

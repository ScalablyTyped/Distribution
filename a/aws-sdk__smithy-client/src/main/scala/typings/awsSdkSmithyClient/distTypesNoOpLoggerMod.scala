package typings.awsSdkSmithyClient

import typings.awsSdkTypes.distTypesLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNoOpLoggerMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/NoOpLogger", "NoOpLogger")
  @js.native
  open class NoOpLogger ()
    extends StObject
       with Logger {
    
    def debug(): Unit = js.native
    /* CompleteClass */
    override def debug(content: Any*): Unit = js.native
    
    def error(): Unit = js.native
    /* CompleteClass */
    override def error(content: Any*): Unit = js.native
    
    def info(): Unit = js.native
    /* CompleteClass */
    override def info(content: Any*): Unit = js.native
    
    @JSName("trace")
    def trace_MNoOpLogger(): Unit = js.native
    
    def warn(): Unit = js.native
    /* CompleteClass */
    override def warn(content: Any*): Unit = js.native
  }
}

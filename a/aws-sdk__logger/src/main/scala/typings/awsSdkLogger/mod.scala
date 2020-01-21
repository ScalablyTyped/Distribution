package typings.awsSdkLogger

import typings.awsSdkTypes.loggerMod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Logger protected ()
    extends typings.awsSdkTypes.loggerMod.Logger {
    def this(options: LoggerOptions) = this()
    val logLevel: js.Any = js.native
    val logger: js.Any = js.native
    val options: LoggerOptions = js.native
    var write: js.Any = js.native
    /* CompleteClass */
    override def error(content: String): Unit = js.native
    /* CompleteClass */
    override def info(content: String): Unit = js.native
    /* CompleteClass */
    override def log(content: String): Unit = js.native
    /* CompleteClass */
    override def warn(content: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Logger extends js.Object {
    val logLevelPriority: js.Any = js.native
  }
  
}


package typings.awsSdkTypes.middlewareMod

import typings.awsSdkTypes.loggerMod.Logger
import typings.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerExecutionContext extends js.Object {
  /**
    * A logger that may be invoked by any handler during execution of an
    * operation.
    */
  var logger: Logger
  /**
    * The serialization model for the input, output, and possible errors for
    * the operation executed by invoking the composed handler.
    */
  var model: OperationModel
}

object HandlerExecutionContext {
  @scala.inline
  def apply(logger: Logger, model: OperationModel): HandlerExecutionContext = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HandlerExecutionContext]
  }
}


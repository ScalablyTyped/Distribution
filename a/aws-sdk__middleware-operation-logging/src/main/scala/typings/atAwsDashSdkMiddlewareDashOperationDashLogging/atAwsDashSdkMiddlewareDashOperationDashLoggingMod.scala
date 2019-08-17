package typings.atAwsDashSdkMiddlewareDashOperationDashLogging

import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.HandlerArguments
import typings.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-operation-logging", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashOperationDashLoggingMod extends js.Object {
  def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], hasLoggerModel: HandlerExecutionContext): js.Function1[/* args */ HandlerArguments[Input], js.Promise[Output]] = js.native
}


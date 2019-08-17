package typings.atAwsDashSdkMiddlewareDashExpectDashContinue

import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typings.atAwsDashSdkTypes.buildMiddlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-expect-continue", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashExpectDashContinueMod extends js.Object {
  def addExpectContinue(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}


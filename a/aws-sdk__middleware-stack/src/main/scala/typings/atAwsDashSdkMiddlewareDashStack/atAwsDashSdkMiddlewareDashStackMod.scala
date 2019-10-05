package typings.atAwsDashSdkMiddlewareDashStack

import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-stack", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashStackMod extends js.Object {
  @js.native
  class MiddlewareStack[Input /* <: js.Object */, Output /* <: js.Object */, Stream] ()
    extends typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[Input, Output, Stream] {
    val entries: js.Any = js.native
    var removeByIdentity: js.Any = js.native
    var removeByTag: js.Any = js.native
    var sort: js.Any = js.native
    var sorted: js.Any = js.native
    def concat[InputType /* <: Input */, OutputType /* <: Output */](from: MiddlewareStack[InputType, OutputType, Stream]): MiddlewareStack[InputType, OutputType, Stream] = js.native
  }
  
}


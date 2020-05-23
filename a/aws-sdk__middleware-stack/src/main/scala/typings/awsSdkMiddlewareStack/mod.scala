package typings.awsSdkMiddlewareStack

import typings.awsSdkMiddlewareStack.anon.HandlerOptionsstepinitial
import typings.awsSdkTypes.middlewareMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-stack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MiddlewareStack[Input /* <: js.Object */, Output /* <: js.Object */, Stream] ()
    extends typings.awsSdkTypes.middlewareMod.MiddlewareStack[Input, Output, Stream] {
    val entries: js.Any = js.native
    var removeByIdentity: js.Any = js.native
    var removeByTag: js.Any = js.native
    var sort: js.Any = js.native
    var sorted: js.Any = js.native
    def add(middleware: Middleware[Input, Output], options: HandlerOptionsstepinitial): Unit = js.native
    def concat[InputType /* <: Input */, OutputType /* <: Output */](from: MiddlewareStack[InputType, OutputType, Stream]): MiddlewareStack[InputType, OutputType, Stream] = js.native
  }
  
}


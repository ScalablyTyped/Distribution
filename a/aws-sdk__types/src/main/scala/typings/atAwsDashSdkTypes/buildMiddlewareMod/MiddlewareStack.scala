package typings.atAwsDashSdkTypes.buildMiddlewareMod

import typings.atAwsDashSdkTypes.Anon_Initialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewareStack[Input /* <: js.Object */, Output /* <: js.Object */, Stream] extends js.Object {
  /**
    * Add middleware to the list to be executed during the "build" phase,
    * optionally specifying a priority and tags.
    */
  def add(middleware: FinalizeMiddleware[Input, Output, Stream], options: BuildHandlerOptions): Unit = js.native
  /**
    * Add middleware to the list to be executed during the "finalize" phase,
    * optionally specifying a priority and tags.
    */
  def add(middleware: FinalizeMiddleware[Input, Output, Stream], options: FinalizeHandlerOptions): Unit = js.native
  /**
    * Add middleware to the list, optionally specifying a priority and tags.
    */
  def add(middleware: Middleware[Input, Output]): Unit = js.native
  def add(middleware: Middleware[Input, Output], options: HandlerOptions with Anon_Initialize): Unit = js.native
  /**
    * Add middleware to the list to be executed during the "serialize" phase,
    * optionally specifying a priority and tags.
    */
  def add(middleware: Middleware[Input, Output], options: SerializeHandlerOptions): Unit = js.native
  /**
    * Create a list containing the middlewares in this list as well as the
    * middlewares in the `from` list. Neither source is modified, and step
    * bindings and handler priorities and tags are preserved in the copy.
    */
  def concat[InputType /* <: Input */, OutputType /* <: Output */](from: MiddlewareStack[InputType, OutputType, Stream]): MiddlewareStack[InputType, OutputType, Stream] = js.native
  def remove(toRemove: String): Boolean = js.native
  /**
    * Removes middleware from the stack.
    *
    * If a string is provided, any entry in the stack whose tags contain that
    * string will be removed from the stack.
    *
    * If a middleware class is provided, all usages thereof will be removed.
    */
  def remove(toRemove: Middleware[Input, Output]): Boolean = js.native
  /**
    * Builds a single handler function from zero or more middleware classes and
    * a core handler. The core handler is meant to send command objects to AWS
    * services and return promises that will resolve with the operation result
    * or be rejected with an error.
    *
    * When a composed handler is invoked, the arguments will pass through all
    * middleware in a defined order, and the return from the innermost handler
    * will pass through all middleware in the reverse of that order.
    */
  def resolve[InputType /* <: Input */, OutputType /* <: Output */](handler: FinalizeHandler[InputType, OutputType, Stream], context: HandlerExecutionContext): Handler[InputType, OutputType] = js.native
}


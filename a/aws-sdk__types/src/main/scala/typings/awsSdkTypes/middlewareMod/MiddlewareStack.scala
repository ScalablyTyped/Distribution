package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareStack[Input /* <: js.Object */, Output /* <: js.Object */] extends Pluggable[Input, Output] {
  
  /**
    * Add middleware to the stack to be executed during the "build" step,
    * optionally specifying a priority, tags and name
    */
  def add(middleware: BuildMiddleware[Input, Output], options: BuildHandlerOptions with AbsoluteLocation): Unit = js.native
  /**
    * Add middleware to the stack to be executed during the "deserialize" step,
    * optionally specifying a priority, tags and name
    */
  def add(
    middleware: DeserializeMiddleware[Input, Output],
    options: DeserializeHandlerOptions with AbsoluteLocation
  ): Unit = js.native
  /**
    * Add middleware to the stack to be executed during the "finalizeRequest" step,
    * optionally specifying a priority, tags and name
    */
  def add(
    middleware: FinalizeRequestMiddleware[Input, Output],
    options: FinalizeRequestHandlerOptions with AbsoluteLocation
  ): Unit = js.native
  /**
    * Add middleware to the stack to be executed during the "initialize" step,
    * optionally specifying a priority, tags and name
    */
  def add(middleware: InitializeMiddleware[Input, Output]): Unit = js.native
  def add(
    middleware: InitializeMiddleware[Input, Output],
    options: InitializeHandlerOptions with AbsoluteLocation
  ): Unit = js.native
  /**
    * Add middleware to the stack to be executed during the "serialize" step,
    * optionally specifying a priority, tags and name
    */
  def add(
    middleware: SerializeMiddleware[Input, Output],
    options: SerializeHandlerOptions with AbsoluteLocation
  ): Unit = js.native
  
  /**
    * Add middleware to a stack position before or after a known middleware，optionally
    * specifying name and tags.
    */
  def addRelativeTo(middleware: MiddlewareType[Input, Output], options: RelativeMiddlewareOptions): Unit = js.native
  
  /**
    * Create a stack containing the middlewares in this stack as well as the
    * middlewares in the `from` stack. Neither source is modified, and step
    * bindings and handler priorities and tags are preserved in the copy.
    */
  def concat[InputType /* <: Input */, OutputType /* <: Output */](from: MiddlewareStack[InputType, OutputType]): MiddlewareStack[InputType, OutputType] = js.native
  
  def remove(toRemove: String): Boolean = js.native
  /**
    * Removes middleware from the stack.
    *
    * If a string is provided, it will be treated as middleware name. If a middleware
    * is inserted with the given name, it will be removed.
    *
    * If a middleware class is provided, all usages thereof will be removed.
    */
  def remove(toRemove: MiddlewareType[Input, Output]): Boolean = js.native
  
  /**
    * Removes middleware that contains given tag
    *
    * Multiple middleware will potentially be removed
    */
  def removeByTag(toRemove: String): Boolean = js.native
  
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
  def resolve[InputType /* <: Input */, OutputType /* <: Output */](handler: DeserializeHandler[InputType, OutputType], context: HandlerExecutionContext): InitializeHandler[InputType, OutputType] = js.native
  
  /**
    * Apply a customization function to mutate the middleware stack, often
    * used for customizations that requires mutating multiple middleware.
    */
  def use(pluggable: Pluggable[Input, Output]): Unit = js.native
}

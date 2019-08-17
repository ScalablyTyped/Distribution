package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildMiddlewareMod {
  type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = FinalizeHandler[Input, Output, Stream]
  type BuildHandlerArguments[Input /* <: js.Object */, Stream] = FinalizeHandlerArguments[Input, Stream]
  type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = FinalizeMiddleware[Input, Output, Stream]
  type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[/* args */ FinalizeHandlerArguments[Input, Stream], js.Promise[Output]]
  type FinalizeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ FinalizeHandler[Input, Output, Stream], 
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[Input, Output, Stream]
  ]
  type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[/* args */ HandlerArguments[Input], js.Promise[Output]]
  type Middleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ Handler[Input, Output], 
    /* context */ HandlerExecutionContext, 
    Handler[Input, Output]
  ]
  type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[/* args */ SerializeHandlerArguments[Input, Stream], js.Promise[Output]]
  type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ SerializeHandler[Input, Output, Stream], 
    /* context */ HandlerExecutionContext, 
    SerializeHandler[Input, Output, Stream]
  ]
  type Terminalware[OutputConstraint /* <: js.Object */, Stream] = js.Function1[
    /* context */ HandlerExecutionContext, 
    FinalizeHandler[js.Object, OutputConstraint, Stream]
  ]
}

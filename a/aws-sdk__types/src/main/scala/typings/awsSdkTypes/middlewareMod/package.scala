package typings.awsSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object middlewareMod {
  type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = typings.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream]
  type BuildHandlerArguments[Input /* <: js.Object */, Stream] = typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input, Stream]
  type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = typings.awsSdkTypes.middlewareMod.FinalizeMiddleware[Input, Output, Stream]
  type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input, Stream], 
    js.Promise[Output]
  ]
  type FinalizeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output, Stream]
  ]
  type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.HandlerArguments[Input], 
    js.Promise[Output]
  ]
  type Middleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.Handler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.Handler[Input, Output]
  ]
  type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.SerializeHandlerArguments[Input, Stream], 
    js.Promise[Output]
  ]
  type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output, Stream], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output, Stream]
  ]
  type Terminalware[OutputConstraint /* <: js.Object */, Stream] = js.Function1[
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.FinalizeHandler[js.Object, OutputConstraint, Stream]
  ]
}

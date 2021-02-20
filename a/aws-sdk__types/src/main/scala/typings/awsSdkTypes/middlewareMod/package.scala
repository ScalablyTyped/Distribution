package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object middlewareMod {
  
  type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.BuildHandlerArguments[Input], 
    js.Promise[typings.awsSdkTypes.middlewareMod.BuildHandlerOutput[Output]]
  ]
  
  type BuildHandlerArguments[Input /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input]
  
  type BuildHandlerOutput[Output /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.BuildHandler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.BuildHandler[Input, Output]
  ]
  
  type DeserializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.DeserializeHandlerArguments[Input], 
    js.Promise[typings.awsSdkTypes.middlewareMod.DeserializeHandlerOutput[Output]]
  ]
  
  type DeserializeHandlerArguments[Input /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input]
  
  type DeserializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.DeserializeHandler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.DeserializeHandler[Input, Output]
  ]
  
  type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments[Input], 
    js.Promise[typings.awsSdkTypes.middlewareMod.FinalizeHandlerOutput[Output]]
  ]
  
  type FinalizeHandlerOutput[Output /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type FinalizeRequestMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.FinalizeHandler[Input, Output]
  ]
  
  type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output]
  
  type InitializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.InitializeHandlerArguments[Input], 
    js.Promise[typings.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]]
  ]
  
  type InitializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.InitializeHandler[Input, Output]
  ]
  
  type MiddlewareType[Input /* <: js.Object */, Output /* <: js.Object */] = (typings.awsSdkTypes.middlewareMod.InitializeMiddleware[Input, Output]) | (typings.awsSdkTypes.middlewareMod.SerializeMiddleware[Input, Output]) | (typings.awsSdkTypes.middlewareMod.BuildMiddleware[Input, Output]) | (typings.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware[Input, Output]) | (typings.awsSdkTypes.middlewareMod.DeserializeMiddleware[Input, Output])
  
  type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
    /* args */ typings.awsSdkTypes.middlewareMod.SerializeHandlerArguments[Input], 
    js.Promise[typings.awsSdkTypes.middlewareMod.SerializeHandlerOutput[Output]]
  ]
  
  type SerializeHandlerOutput[Output /* <: js.Object */] = typings.awsSdkTypes.middlewareMod.InitializeHandlerOutput[Output]
  
  type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
    /* next */ typings.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output], 
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.SerializeHandler[Input, Output]
  ]
  
  type Terminalware = js.Function1[
    /* context */ typings.awsSdkTypes.middlewareMod.HandlerExecutionContext, 
    typings.awsSdkTypes.middlewareMod.DeserializeHandler[js.Object, js.Object]
  ]
}

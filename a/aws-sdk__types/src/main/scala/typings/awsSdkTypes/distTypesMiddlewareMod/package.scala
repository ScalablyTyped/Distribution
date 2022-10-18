package typings.awsSdkTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BuildHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[/* args */ BuildHandlerArguments[Input], js.Promise[BuildHandlerOutput[Output]]]

type BuildHandlerArguments[Input /* <: js.Object */] = FinalizeHandlerArguments[Input]

type BuildHandlerOutput[Output /* <: js.Object */] = InitializeHandlerOutput[Output]

type BuildMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
/* next */ BuildHandler[Input, Output], 
/* context */ HandlerExecutionContext, 
BuildHandler[Input, Output]]

type DeserializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
/* args */ DeserializeHandlerArguments[Input], 
js.Promise[DeserializeHandlerOutput[Output]]]

type DeserializeHandlerArguments[Input /* <: js.Object */] = FinalizeHandlerArguments[Input]

type DeserializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
/* next */ DeserializeHandler[Input, Output], 
/* context */ HandlerExecutionContext, 
DeserializeHandler[Input, Output]]

type FinalizeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
/* args */ FinalizeHandlerArguments[Input], 
js.Promise[FinalizeHandlerOutput[Output]]]

type FinalizeHandlerOutput[Output /* <: js.Object */] = InitializeHandlerOutput[Output]

type FinalizeRequestMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
/* next */ FinalizeHandler[Input, Output], 
/* context */ HandlerExecutionContext, 
FinalizeHandler[Input, Output]]

type Handler[Input /* <: js.Object */, Output /* <: js.Object */] = InitializeHandler[Input, Output]

type InitializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
/* args */ InitializeHandlerArguments[Input], 
js.Promise[InitializeHandlerOutput[Output]]]

type InitializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
/* next */ InitializeHandler[Input, Output], 
/* context */ HandlerExecutionContext, 
InitializeHandler[Input, Output]]

type MiddlewareType[Input /* <: js.Object */, Output /* <: js.Object */] = (InitializeMiddleware[Input, Output]) | (SerializeMiddleware[Input, Output]) | (BuildMiddleware[Input, Output]) | (FinalizeRequestMiddleware[Input, Output]) | (DeserializeMiddleware[Input, Output])

type SerializeHandler[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function1[
/* args */ SerializeHandlerArguments[Input], 
js.Promise[SerializeHandlerOutput[Output]]]

type SerializeHandlerOutput[Output /* <: js.Object */] = InitializeHandlerOutput[Output]

type SerializeMiddleware[Input /* <: js.Object */, Output /* <: js.Object */] = js.Function2[
/* next */ SerializeHandler[Input, Output], 
/* context */ HandlerExecutionContext, 
SerializeHandler[Input, Output]]

type Terminalware = js.Function1[/* context */ HandlerExecutionContext, DeserializeHandler[js.Object, js.Object]]

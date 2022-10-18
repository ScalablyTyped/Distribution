package typings.awsSdkTypes.distTypesEventStreamMod

import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerArguments
import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandlerOutput
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamPayloadHandler extends StObject {
  
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](
    next: FinalizeHandler[Input, Output],
    args: FinalizeHandlerArguments[Input],
    context: HandlerExecutionContext
  ): js.Promise[FinalizeHandlerOutput[Output]] = js.native
}

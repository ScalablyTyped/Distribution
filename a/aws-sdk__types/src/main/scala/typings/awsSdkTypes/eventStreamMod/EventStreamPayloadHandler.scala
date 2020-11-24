package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerArguments
import typings.awsSdkTypes.middlewareMod.FinalizeHandlerOutput
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamPayloadHandler extends js.Object {
  
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](
    next: FinalizeHandler[Input, Output],
    args: FinalizeHandlerArguments[Input],
    context: HandlerExecutionContext
  ): js.Promise[FinalizeHandlerOutput[Output]] = js.native
}

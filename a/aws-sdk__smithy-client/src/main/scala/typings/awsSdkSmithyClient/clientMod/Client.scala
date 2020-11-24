package typings.awsSdkSmithyClient.clientMod

import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/smithy-client/dist/cjs/client", "Client")
@js.native
class Client[HandlerOptions, ClientInput /* <: js.Object */, ClientOutput /* <: MetadataBearer */, ResolvedClientConfiguration /* <: SmithyResolvedConfiguration[HandlerOptions] */] protected ()
  extends typings.awsSdkTypes.clientMod.Client[ClientInput, ClientOutput, ResolvedClientConfiguration] {
  def this(config: ResolvedClientConfiguration) = this()
  
  def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
    command: Command[
      ClientInput, 
      InputType, 
      ClientOutput, 
      OutputType, 
      SmithyResolvedConfiguration[HandlerOptions]
    ],
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
  ): Unit = js.native
  def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
    command: Command[
      ClientInput, 
      InputType, 
      ClientOutput, 
      OutputType, 
      SmithyResolvedConfiguration[HandlerOptions]
    ],
    options: HandlerOptions
  ): js.Promise[OutputType] = js.native
  def send[InputType /* <: ClientInput */, OutputType /* <: ClientOutput */](
    command: Command[
      ClientInput, 
      InputType, 
      ClientOutput, 
      OutputType, 
      SmithyResolvedConfiguration[HandlerOptions]
    ],
    options: HandlerOptions,
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
  ): Unit = js.native
}

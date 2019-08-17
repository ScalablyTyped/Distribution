package typings.atAwsDashSdkClientDashGlacierDashNode.glacierClientMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/GlacierClient", "GlacierClient")
@js.native
class GlacierClient protected () extends js.Object {
  def this(configuration: GlacierConfiguration) = this()
  val config: GlacierResolvedConfiguration = js.native
  val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable] = js.native
  def destroy(): Unit = js.native
  /**
    * This will need to be revised when the command interface lands.
    */
  def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
    command: Command[
      InputTypesUnion, 
      InputType, 
      OutputTypesUnion, 
      OutputType, 
      GlacierResolvedConfiguration, 
      Readable
    ]
  ): js.Promise[OutputType] = js.native
  def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
    command: Command[
      InputTypesUnion, 
      InputType, 
      OutputTypesUnion, 
      OutputType, 
      GlacierResolvedConfiguration, 
      Readable
    ],
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
  ): Unit = js.native
}


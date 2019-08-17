package typings.atAwsDashSdkClientDashXrayDashNode.xRayClientMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayConfiguration
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/XRayClient", "XRayClient")
@js.native
class XRayClient protected () extends js.Object {
  def this(configuration: XRayConfiguration) = this()
  val config: XRayResolvedConfiguration = js.native
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
      XRayResolvedConfiguration, 
      Readable
    ]
  ): js.Promise[OutputType] = js.native
  def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
    command: Command[
      InputTypesUnion, 
      InputType, 
      OutputTypesUnion, 
      OutputType, 
      XRayResolvedConfiguration, 
      Readable
    ],
    cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
  ): Unit = js.native
}


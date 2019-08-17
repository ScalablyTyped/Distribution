package typings.atAwsDashSdkClientDashKmsDashNode.commandsGetKeyRotationStatusCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesGetKeyRotationStatusOutputMod.GetKeyRotationStatusOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GetKeyRotationStatusCommand", "GetKeyRotationStatusCommand")
@js.native
class GetKeyRotationStatusCommand protected () extends Command[
      InputTypesUnion, 
      GetKeyRotationStatusInput, 
      OutputTypesUnion, 
      GetKeyRotationStatusOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: GetKeyRotationStatusInput) = this()
  /* CompleteClass */
  override val input: GetKeyRotationStatusInput = js.native
  val middlewareStack: MiddlewareStack[GetKeyRotationStatusInput, GetKeyRotationStatusOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[GetKeyRotationStatusInput, GetKeyRotationStatusOutput] = js.native
}


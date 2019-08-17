package typings.atAwsDashSdkClientDashKmsDashNode.commandsCreateKeyCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyInputMod.CreateKeyInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateKeyOutputMod.CreateKeyOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateKeyCommand", "CreateKeyCommand")
@js.native
class CreateKeyCommand protected () extends Command[
      InputTypesUnion, 
      CreateKeyInput, 
      OutputTypesUnion, 
      CreateKeyOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateKeyInput) = this()
  /* CompleteClass */
  override val input: CreateKeyInput = js.native
  val middlewareStack: MiddlewareStack[CreateKeyInput, CreateKeyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
}


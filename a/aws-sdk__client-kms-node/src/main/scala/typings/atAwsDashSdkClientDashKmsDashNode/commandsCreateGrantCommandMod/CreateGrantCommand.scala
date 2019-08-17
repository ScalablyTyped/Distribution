package typings.atAwsDashSdkClientDashKmsDashNode.commandsCreateGrantCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateGrantInputMod.CreateGrantInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesCreateGrantOutputMod.CreateGrantOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateGrantCommand", "CreateGrantCommand")
@js.native
class CreateGrantCommand protected () extends Command[
      InputTypesUnion, 
      CreateGrantInput, 
      OutputTypesUnion, 
      CreateGrantOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: CreateGrantInput) = this()
  /* CompleteClass */
  override val input: CreateGrantInput = js.native
  val middlewareStack: MiddlewareStack[CreateGrantInput, CreateGrantOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[CreateGrantInput, CreateGrantOutput] = js.native
}


package typings.atAwsDashSdkClientDashKmsDashNode.commandsGenerateDataKeyWithoutPlaintextCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesGenerateDataKeyWithoutPlaintextOutputMod.GenerateDataKeyWithoutPlaintextOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyWithoutPlaintextCommand", "GenerateDataKeyWithoutPlaintextCommand")
@js.native
class GenerateDataKeyWithoutPlaintextCommand protected () extends Command[
      InputTypesUnion, 
      GenerateDataKeyWithoutPlaintextInput, 
      OutputTypesUnion, 
      GenerateDataKeyWithoutPlaintextOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: GenerateDataKeyWithoutPlaintextInput) = this()
  /* CompleteClass */
  override val input: GenerateDataKeyWithoutPlaintextInput = js.native
  val middlewareStack: MiddlewareStack[
    GenerateDataKeyWithoutPlaintextInput, 
    GenerateDataKeyWithoutPlaintextOutput, 
    Readable
  ] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[GenerateDataKeyWithoutPlaintextInput, GenerateDataKeyWithoutPlaintextOutput] = js.native
}


package typings.atAwsDashSdkClientDashKmsDashNode.commandsEncryptCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesEncryptInputMod.EncryptInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesEncryptOutputMod.EncryptOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EncryptCommand", "EncryptCommand")
@js.native
class EncryptCommand protected () extends Command[
      InputTypesUnion, 
      EncryptInput, 
      OutputTypesUnion, 
      EncryptOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: EncryptInput) = this()
  /* CompleteClass */
  override val input: EncryptInput = js.native
  val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[EncryptInput, EncryptOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[EncryptInput, EncryptOutput] = js.native
}


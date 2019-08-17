package typings.atAwsDashSdkClientDashXrayDashNode.commandsPutEncryptionConfigCommandMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typings.atAwsDashSdkClientDashXrayDashNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typings.atAwsDashSdkClientDashXrayDashNode.xRayConfigurationMod.XRayResolvedConfiguration
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", "PutEncryptionConfigCommand")
@js.native
class PutEncryptionConfigCommand protected () extends Command[
      InputTypesUnion, 
      PutEncryptionConfigInput, 
      OutputTypesUnion, 
      PutEncryptionConfigOutput, 
      XRayResolvedConfiguration, 
      Readable
    ] {
  def this(input: PutEncryptionConfigInput) = this()
  /* CompleteClass */
  override val input: PutEncryptionConfigInput = js.native
  val middlewareStack: MiddlewareStack[PutEncryptionConfigInput, PutEncryptionConfigOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: XRayResolvedConfiguration
  ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
}


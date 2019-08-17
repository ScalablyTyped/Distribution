package typings.atAwsDashSdkClientDashKmsDashNode.commandsDescribeKeyCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesDescribeKeyInputMod.DescribeKeyInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesDescribeKeyOutputMod.DescribeKeyOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DescribeKeyCommand", "DescribeKeyCommand")
@js.native
class DescribeKeyCommand protected () extends Command[
      InputTypesUnion, 
      DescribeKeyInput, 
      OutputTypesUnion, 
      DescribeKeyOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: DescribeKeyInput) = this()
  /* CompleteClass */
  override val input: DescribeKeyInput = js.native
  val middlewareStack: MiddlewareStack[DescribeKeyInput, DescribeKeyOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
}


package typings.atAwsDashSdkClientDashKmsDashNode.commandsRevokeGrantCommandMod

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantInputMod.RevokeGrantInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesRevokeGrantOutputMod.RevokeGrantOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/RevokeGrantCommand", "RevokeGrantCommand")
@js.native
class RevokeGrantCommand protected () extends Command[
      InputTypesUnion, 
      RevokeGrantInput, 
      OutputTypesUnion, 
      RevokeGrantOutput, 
      KMSResolvedConfiguration, 
      Readable
    ] {
  def this(input: RevokeGrantInput) = this()
  /* CompleteClass */
  override val input: RevokeGrantInput = js.native
  val middlewareStack: MiddlewareStack[RevokeGrantInput, RevokeGrantOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: KMSResolvedConfiguration
  ): Handler[RevokeGrantInput, RevokeGrantOutput] = js.native
}


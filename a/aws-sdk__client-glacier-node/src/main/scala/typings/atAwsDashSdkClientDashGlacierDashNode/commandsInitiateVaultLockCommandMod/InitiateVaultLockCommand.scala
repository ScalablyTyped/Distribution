package typings.atAwsDashSdkClientDashGlacierDashNode.commandsInitiateVaultLockCommandMod

import typings.atAwsDashSdkClientDashGlacierDashNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typings.atAwsDashSdkClientDashGlacierDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateVaultLockCommand", "InitiateVaultLockCommand")
@js.native
class InitiateVaultLockCommand protected () extends Command[
      InputTypesUnion, 
      InitiateVaultLockInput, 
      OutputTypesUnion, 
      InitiateVaultLockOutput, 
      GlacierResolvedConfiguration, 
      Readable
    ] {
  def this(input: InitiateVaultLockInput) = this()
  /* CompleteClass */
  override val input: InitiateVaultLockInput = js.native
  val middlewareStack: MiddlewareStack[InitiateVaultLockInput, InitiateVaultLockOutput, Readable] = js.native
  def resolveMiddleware(
    clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
  /* CompleteClass */
  override def resolveMiddleware(
    stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
    configuration: GlacierResolvedConfiguration
  ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
}


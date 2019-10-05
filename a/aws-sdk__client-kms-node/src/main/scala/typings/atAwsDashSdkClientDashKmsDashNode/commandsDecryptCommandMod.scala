package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesDecryptInputMod.DecryptInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesDecryptOutputMod.DecryptOutput
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DecryptCommand", JSImport.Namespace)
@js.native
object commandsDecryptCommandMod extends js.Object {
  @js.native
  class DecryptCommand protected () extends Command[
          InputTypesUnion, 
          DecryptInput, 
          OutputTypesUnion, 
          DecryptOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DecryptInput) = this()
    /* CompleteClass */
    override val input: DecryptInput = js.native
    val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
  
}


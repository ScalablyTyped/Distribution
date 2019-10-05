package typings.atAwsDashSdkClientDashKmsDashNode

import typings.atAwsDashSdkClientDashKmsDashNode.kMSConfigurationMod.KMSResolvedConfiguration
import typings.atAwsDashSdkClientDashKmsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKmsDashNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
import typings.atAwsDashSdkClientDashKmsDashNode.typesUpdateKeyDescriptionOutputMod.UpdateKeyDescriptionOutput
import typings.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typings.atAwsDashSdkTypes.buildCommandMod.Command
import typings.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/UpdateKeyDescriptionCommand", JSImport.Namespace)
@js.native
object commandsUpdateKeyDescriptionCommandMod extends js.Object {
  @js.native
  class UpdateKeyDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateKeyDescriptionInput, 
          OutputTypesUnion, 
          UpdateKeyDescriptionOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateKeyDescriptionInput) = this()
    /* CompleteClass */
    override val input: UpdateKeyDescriptionInput = js.native
    val middlewareStack: MiddlewareStack[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typings.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateKeyDescriptionInput, UpdateKeyDescriptionOutput] = js.native
  }
  
}


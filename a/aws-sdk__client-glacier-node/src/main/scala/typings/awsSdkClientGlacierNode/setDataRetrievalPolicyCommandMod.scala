package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object setDataRetrievalPolicyCommandMod extends js.Object {
  @js.native
  class SetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          SetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetDataRetrievalPolicyInput) = this()
    val middlewareStack: MiddlewareStack[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  }
  
}


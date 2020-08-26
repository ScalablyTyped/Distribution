package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typings.awsSdkMiddlewareStack.mod.MiddlewareStack
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object getDataRetrievalPolicyCommandMod extends js.Object {
  @js.native
  class GetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          GetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetDataRetrievalPolicyInput) = this()
    val middlewareStack: MiddlewareStack[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
  }
  
}


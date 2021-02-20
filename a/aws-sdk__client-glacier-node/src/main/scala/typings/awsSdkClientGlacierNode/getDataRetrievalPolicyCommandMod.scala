package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typings.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDataRetrievalPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/GetDataRetrievalPolicyCommand", "GetDataRetrievalPolicyCommand")
  @js.native
  class GetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          GetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: GetDataRetrievalPolicyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
  }
}

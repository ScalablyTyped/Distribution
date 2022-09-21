package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typings.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setDataRetrievalPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", "SetDataRetrievalPolicyCommand")
  @js.native
  open class SetDataRetrievalPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          SetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: SetDataRetrievalPolicyInput) = this()
    
    /* CompleteClass */
    override val input: SetDataRetrievalPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  }
}

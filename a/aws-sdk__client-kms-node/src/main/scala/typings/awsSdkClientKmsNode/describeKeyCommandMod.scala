package typings.awsSdkClientKmsNode

import typings.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typings.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
import typings.awsSdkClientKmsNode.typesDescribeKeyOutputMod.DescribeKeyOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeKeyCommandMod {
  
  @JSImport("@aws-sdk/client-kms-node/commands/DescribeKeyCommand", "DescribeKeyCommand")
  @js.native
  open class DescribeKeyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeKeyInput, 
          OutputTypesUnion, 
          DescribeKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DescribeKeyInput) = this()
    
    /* CompleteClass */
    override val input: DescribeKeyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeKeyInput, DescribeKeyOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DescribeKeyInput, DescribeKeyOutput] = js.native
  }
}

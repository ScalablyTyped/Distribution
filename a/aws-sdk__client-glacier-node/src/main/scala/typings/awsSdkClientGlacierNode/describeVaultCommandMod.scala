package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesDescribeVaultInputMod.DescribeVaultInput
import typings.awsSdkClientGlacierNode.typesDescribeVaultOutputMod.DescribeVaultOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DescribeVaultCommand", "DescribeVaultCommand")
  @js.native
  class DescribeVaultCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeVaultInput, 
          OutputTypesUnion, 
          DescribeVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DescribeVaultInput) = this()
    
    /* CompleteClass */
    override val input: DescribeVaultInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeVaultInput, DescribeVaultOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: js.Any
    ): Handler[DescribeVaultInput, DescribeVaultOutput] = js.native
  }
}

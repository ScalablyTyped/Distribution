package typings.awsSdkClientGlacierNode

import typings.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typings.awsSdkClientGlacierNode.typesDescribeJobInputMod.DescribeJobInput
import typings.awsSdkClientGlacierNode.typesDescribeJobOutputMod.DescribeJobOutput
import typings.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDescribeJobCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DescribeJobCommand", "DescribeJobCommand")
  @js.native
  open class DescribeJobCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DescribeJobInput, 
          OutputTypesUnion, 
          DescribeJobOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DescribeJobInput) = this()
    
    /* CompleteClass */
    override val input: DescribeJobInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DescribeJobInput, DescribeJobOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[DescribeJobInput, DescribeJobOutput] = js.native
  }
}

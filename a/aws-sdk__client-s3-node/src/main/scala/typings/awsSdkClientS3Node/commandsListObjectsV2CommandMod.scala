package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.typesListObjectsV2InputMod.ListObjectsV2Input
import typings.awsSdkClientS3Node.typesListObjectsV2OutputMod.ListObjectsV2Output
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListObjectsV2CommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/ListObjectsV2Command", "ListObjectsV2Command")
  @js.native
  open class ListObjectsV2Command protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListObjectsV2Input, 
          OutputTypesUnion, 
          ListObjectsV2Output, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectsV2Input) = this()
    
    /* CompleteClass */
    override val input: ListObjectsV2Input = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListObjectsV2Input, ListObjectsV2Output] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[ListObjectsV2Input, ListObjectsV2Output] = js.native
  }
}

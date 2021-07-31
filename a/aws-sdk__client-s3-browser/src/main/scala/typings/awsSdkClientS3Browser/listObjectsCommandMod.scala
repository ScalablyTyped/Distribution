package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesListObjectsInputMod.ListObjectsInput
import typings.awsSdkClientS3Browser.typesListObjectsOutputMod.ListObjectsOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listObjectsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/ListObjectsCommand", "ListObjectsCommand")
  @js.native
  class ListObjectsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListObjectsInput, 
          OutputTypesUnion, 
          ListObjectsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListObjectsInput) = this()
    
    /* CompleteClass */
    override val input: ListObjectsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListObjectsInput, ListObjectsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: js.Any
    ): Handler[ListObjectsInput, ListObjectsOutput] = js.native
  }
}

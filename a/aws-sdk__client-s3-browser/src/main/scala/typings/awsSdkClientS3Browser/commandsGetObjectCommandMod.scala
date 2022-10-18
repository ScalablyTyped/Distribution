package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetObjectInputMod.GetObjectInput
import typings.awsSdkClientS3Browser.typesGetObjectOutputMod.GetObjectOutput
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetObjectCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetObjectCommand", "GetObjectCommand")
  @js.native
  open class GetObjectCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetObjectInput, 
          OutputTypesUnion, 
          GetObjectOutput[Blob], 
          S3ResolvedConfiguration
        ] {
    def this(input: GetObjectInput) = this()
    
    /* CompleteClass */
    override val input: GetObjectInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetObjectInput, GetObjectOutput[Blob]] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetObjectInput, GetObjectOutput[Blob]] = js.native
  }
}

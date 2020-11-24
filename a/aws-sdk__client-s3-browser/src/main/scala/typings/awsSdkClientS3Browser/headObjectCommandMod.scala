package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesHeadObjectInputMod.HeadObjectInput
import typings.awsSdkClientS3Browser.typesHeadObjectOutputMod.HeadObjectOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/HeadObjectCommand", JSImport.Namespace)
@js.native
object headObjectCommandMod extends js.Object {
  
  @js.native
  class HeadObjectCommand protected () extends Command[
          InputTypesUnion, 
          HeadObjectInput, 
          OutputTypesUnion, 
          HeadObjectOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: HeadObjectInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[HeadObjectInput, HeadObjectOutput] = js.native
  }
}

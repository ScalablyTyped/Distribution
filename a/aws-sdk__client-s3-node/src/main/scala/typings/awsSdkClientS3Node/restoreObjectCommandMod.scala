package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesRestoreObjectInputMod.RestoreObjectInput
import typings.awsSdkClientS3Node.typesRestoreObjectOutputMod.RestoreObjectOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/RestoreObjectCommand", JSImport.Namespace)
@js.native
object restoreObjectCommandMod extends js.Object {
  
  @js.native
  class RestoreObjectCommand protected () extends Command[
          InputTypesUnion, 
          RestoreObjectInput, 
          OutputTypesUnion, 
          RestoreObjectOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: RestoreObjectInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[RestoreObjectInput, RestoreObjectOutput] = js.native
  }
}

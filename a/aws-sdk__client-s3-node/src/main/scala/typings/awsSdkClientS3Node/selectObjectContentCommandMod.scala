package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Node.typesSelectObjectContentInputMod.SelectObjectContentInput
import typings.awsSdkClientS3Node.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/SelectObjectContentCommand", JSImport.Namespace)
@js.native
object selectObjectContentCommandMod extends js.Object {
  
  @js.native
  class SelectObjectContentCommand protected () extends Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: SelectObjectContentInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
}

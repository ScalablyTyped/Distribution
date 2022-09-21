package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
import typings.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.awsSdkTypes.middlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectObjectContentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/SelectObjectContentCommand", "SelectObjectContentCommand")
  @js.native
  open class SelectObjectContentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: SelectObjectContentInput) = this()
    
    /* CompleteClass */
    override val input: SelectObjectContentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
}

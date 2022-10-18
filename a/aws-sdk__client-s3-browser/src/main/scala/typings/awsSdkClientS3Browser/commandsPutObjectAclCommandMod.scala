package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput
import typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput
import typings.awsSdkTypes.distTypesCommandMod.Command
import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutObjectAclCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutObjectAclCommand", "PutObjectAclCommand")
  @js.native
  open class PutObjectAclCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutObjectAclInput, 
          OutputTypesUnion, 
          PutObjectAclOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutObjectAclInput) = this()
    
    /* CompleteClass */
    override val input: PutObjectAclInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutObjectAclInput, PutObjectAclOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
  }
}

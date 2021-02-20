package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesPutObjectAclInputMod.PutObjectAclInput
import typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod.PutObjectAclOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putObjectAclCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutObjectAclCommand", "PutObjectAclCommand")
  @js.native
  class PutObjectAclCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectAclInput, 
          OutputTypesUnion, 
          PutObjectAclOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutObjectAclInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectAclInput, PutObjectAclOutput] = js.native
  }
}
